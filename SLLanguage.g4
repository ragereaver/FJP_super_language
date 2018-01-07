grammar SLLanguage;

compilationUnit
    :   translationUnit? EOF
    ;

translationUnit
    :   allCode
    |   allCode translationUnit
    ;

allCode
    :   functionDefinition
    |   declaration
    |   cycle
    |   functionCall ';'
    |   constDeclaration
    |   assignmentExpression ';'
    ;

constDeclaration
    :   'const' typeSpecifier Identifier '=' constValues ';'
    ;

constValues
    :   DigitSequence
    |   'true'
    |   'false'
    ;

arrayDeclaration
    :   typeSpecifier '[' ']' Identifier '=' 'new' typeSpecifier '[' (Identifier | DigitSequence) ']' ';'
    ;

functionDefinition
    :   (typeSpecifier | emptySpecifier) 'function' Identifier '(' initList? ')' compoundStatement
    ;

initList
    :   typeSpecifier Identifier ',' initList
    |   typeSpecifier Identifier
    ;

typeSpecifier
    :   'int'
    |   'boolean'
    ;


emptySpecifier
    :   'void'
    ;

cycle
    :   'for' '(' forCondition ')' compoundStatement
    |   'while' '(' logicalOrExpression ')' compoundStatement
    |   'until' '(' logicalOrExpression ')' compoundStatement
    |   'do' compoundStatement 'while' '(' logicalOrExpression ')' ';'
    |   'repeat' compoundStatement 'until' '(' logicalOrExpression ')' ';'
    |   'if' '(' logicalOrExpression ')' compoundStatement elseStatement?
    |   'switch' '(' expression ')' '{' (labeledStatement)* '}'
    ;

elseStatement
    :   'else' compoundStatement
    ;
    
statement
    :   labeledStatement
    |   compoundStatement
    |   functionCall ';'
    |   expressionStatement
    |   cycle
    |   jumpStatement
    ;

labeledStatement
    :   'case' DigitSequence ':' (compoundStatement | expressionStatement | jumpStatement | (functionCall ';'))*
    |   'default' ':' (compoundStatement | expressionStatement | jumpStatement | (functionCall ';'))
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
    |   arrayDeclaration
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
    :   logicalOrExpression ('?' expression (':' expression)? )?
    ;

assignmentOperator
    :   '='
    ;

functionCall
    :   Identifier '(' expression? ')'
    ;

functionValues
    :   Identifier
    |   Identifier ',' functionValues
    |   Constant
    |   Constant ',' functionValues
    |   DigitSequence
    |   DigitSequence ',' functionValues
    |   'false'
    |   'false' ',' functionValues
    |   'true'
    |   'true' ',' functionValues
    |   functionCall
    |   functionCall ',' functionValues
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
    |   unaryOperator castExpression
    ;

unaryOperator
    :   '*' | '+' | '-' | '!'
    ;

postfixExpression
    :   primaryExpression
    |   postfixExpression '[' expression ']'
    |   Identifier '(' functionValues? ')'
    ;

primaryExpression
    :   Identifier
    |   Constant
    |   '(' expression ')'
    |   'true'
    |   'false'
    ;


/**
*   For condition
**/
forCondition
	:   forDeclaration ';' logicalOrExpression? ';' forExpression?
	|   forInit? ';' logicalOrExpression? ';' forExpression?
	;

forDeclaration
    :   typeSpecifier initDeclaratorList
	| 	typeSpecifier
    ;

forInit
    :   forExpression
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
Return : 'return';
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
Minus : '-';
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


Whitespace
    :   [ \t]+
        -> skip
    ;

Newline
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;

BlockComment
    :   '/*' .*? '*/'
        -> skip
    ;