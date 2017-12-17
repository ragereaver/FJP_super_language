grammar SLLanguage;


compilationUnit
    :   translationUnit? EOF
    ;

translationUnit
    :   typeSpecifier functionDefinition
    |   declaration
    |   cycle
    ;

functionDefinition
    :   'function' Identifier '(' initList? ')' compoundStatement
    ;

initList
    :   typeSpecifier Identifier ',' initList
    |   typeSpecifier Identifier
    ;

typeSpecifier
    :   'void'
    |   'char'
    |   'short'
    |   'int'
    |   'long'
    |   'boolean'
    ;

cycle
    : 'for' '(' forCondition ')' compoundStatement
    | 'while' '(' expression ')' compoundStatement
    | 'do' compoundStatement 'while' '(' expression ')' ';'
    | 'until'
    | 'if' '(' logicalOrExpression ')' compoundStatement ('else' compoundStatement)?
    | 'switch' '(' expression ')' '{' labeledStatement '}'
    ;

statement
    :   labeledStatement
    |   compoundStatement
    |   expressionStatement
    |   cycle
    |   jumpStatement
    ;

labeledStatement
    :   'case' DigitSequence ':' statement
    |   'default' ':' statement
    ;

compoundStatement
    :   '{' blockItemList? '}'
    ;

expressionStatement
    :   expression? ';'
    ;

blockItemList
    :   blockItem
    |   blockItemList blockItem
    ;

blockItem
    :   declaration
    |   statement
    ;

declaration
    :   typeSpecifier initDeclaratorList ';'
    ;

initDeclaratorList
    :   initDeclarator
    |   initDeclaratorList ',' initDeclarator
    ;

initDeclarator
    :   Identifier
    |   Identifier '=' assignmentExpression
    ;

jumpStatement
    :   'continue' ';'
    |   'break' ';'
    |   'return' expression? ';'
    ;

expression
    :   assignmentExpression
    |   expression ',' assignmentExpression
    ;

conditionalExpression
    :   logicalOrExpression ('?' expression ':' conditionalExpression)?
    ;

assignmentOperator
    :   '=' | '/=' | '%=' | '+=' | '-='
    ;

/**
*   conditional  expressions
**/
logicalOrExpression
    :   logicalAndExpression
    |   logicalOrExpression '||' logicalAndExpression
    ;

logicalAndExpression
    :   equalityExpression
    |   logicalAndExpression '&&' equalityExpression
    ;

assignmentExpression
    :   conditionalExpression
    |   unaryExpression assignmentOperator assignmentExpression
    |   DigitSequence // for
    ;

equalityExpression
    :   relationalExpression
    |   equalityExpression '==' relationalExpression
    |   equalityExpression '!=' relationalExpression
    ;

relationalExpression
    :   additiveExpression
    |   relationalExpression '<' additiveExpression
    |   relationalExpression '>' additiveExpression
    |   relationalExpression '<=' additiveExpression
    |   relationalExpression '>=' additiveExpression
    ;

additiveExpression
    :   multiplicativeExpression
    |   additiveExpression '+' multiplicativeExpression
    |   additiveExpression '-' multiplicativeExpression
    ;

multiplicativeExpression
    :   castExpression
    |   multiplicativeExpression '*' castExpression
    |   multiplicativeExpression '/' castExpression
    |   multiplicativeExpression '%' castExpression
    ;

castExpression
    :   unaryExpression
    |   DigitSequence // for
    ;

unaryExpression
    :   postfixExpression
    |   '++' unaryExpression
    |   '--' unaryExpression
    |   unaryOperator castExpression
    ;

unaryOperator
    :   '*' | '+' | '-' | '!'
    ;

postfixExpression
    :   primaryExpression
    |   postfixExpression '[' expression ']'
    |   postfixExpression '(' argumentExpressionList? ')'
    |   postfixExpression '++'
    |   postfixExpression '--'
    ;

primaryExpression
    :   Identifier
    |   Constant
    |   StringLiteral+
    |   '(' expression ')'
    ;

argumentExpressionList
    :   assignmentExpression
    |   argumentExpressionList ',' assignmentExpression
    ;

/**
*   For condition
**/
forCondition
	:   forDeclaration ';' forExpression? ';' forExpression?
	|   expression? ';' forExpression? ';' forExpression?
	;

forDeclaration
    :   typeSpecifier initDeclaratorList
	| 	typeSpecifier
    ;

forExpression
    :   assignmentExpression
    |   forExpression ',' assignmentExpression
    ;





Break : 'break';
Case : 'case';
Char : 'char';
Continue : 'continue';
Default : 'default';
Do : 'do';
Else : 'else';
For : 'for';
If : 'if';
Int : 'int';
Long : 'long';
Return : 'return';
Short : 'short';
Switch : 'switch';
Void : 'void';
While : 'while';

LeftParen : '(';
RightParen : ')';
LeftBracket : '[';
RightBracket : ']';
LeftBrace : '{';
RightBrace : '}';

Less : '<';
LessEqual : '<=';
Greater : '>';
GreaterEqual : '>=';

Plus : '+';
PlusPlus : '++';
Minus : '-';
MinusMinus : '--';
Star : '*';
Div : '/';
Mod : '%';

AndAnd : '&&';
OrOr : '||';
Not : '!';

Question : '?';
Colon : ':';
Semi : ';';
Comma : ',';

Assign : '=';
// '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|='
DivAssign : '/=';
ModAssign : '%=';
PlusAssign : '+=';
MinusAssign : '-=';

Equal : '==';
NotEqual : '!=';

Identifier
    :   Nondigit
        (   Nondigit
        |   Digit
        )*
    ;

DigitSequence
    :   Digit+
    ;

Constant
    :   IntegerConstant
    |   CharacterConstant
    ;

fragment
IntegerConstant
    :   DecimalConstant
    ;

fragment
DecimalConstant
    :   NonzeroDigit Digit*
    ;

fragment
Nondigit
    :   [a-zA-Z_]
    ;

fragment
Digit
    :   [0-9]
    ;

fragment
NonzeroDigit
    :   [1-9]
    ;

fragment
CharacterConstant
    :   '\'' CCharSequence '\''
    |   'L\'' CCharSequence '\''
    |   'u\'' CCharSequence '\''
    |   'U\'' CCharSequence '\''
    ;

fragment
CCharSequence
    :   CChar+
    ;

fragment
CChar
    :   ~['\\\r\n]
    |   EscapeSequence
    ;

fragment
EscapeSequence
    :   SimpleEscapeSequence
    |   OctalEscapeSequence
    |   HexadecimalEscapeSequence
    ;

fragment
SimpleEscapeSequence
    :   '\\' ['"?abfnrtv\\]
    ;

fragment
OctalEscapeSequence
    :   '\\' OctalDigit
    |   '\\' OctalDigit OctalDigit
    |   '\\' OctalDigit OctalDigit OctalDigit
    ;

fragment
HexadecimalEscapeSequence
    :   '\\x' HexadecimalDigit+
    ;

fragment
OctalDigit
    :   [0-7]
    ;

fragment
HexadecimalDigit
    :   [0-9a-fA-F]
    ;

StringLiteral
    :   EncodingPrefix? '"' SCharSequence? '"'
    ;

fragment
EncodingPrefix
    :   'u8'
    |   'u'
    |   'U'
    |   'L'
    ;

fragment
SCharSequence
    :   SChar+
    ;

fragment
SChar
    :   ~["\\\r\n]
    |   EscapeSequence
    |   '\\\n'   // Added line
    |   '\\\r\n' // Added line
    ;