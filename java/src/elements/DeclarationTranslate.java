package elements;

import Convertor.TypeConvertor;
import Convertor.Validators;
import enums.EErrorCodes;
import enums.EInstructionSet;
import enums.EOperationCodes;
import generatedParser.SLLanguageParser.InitDeclaratorListContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import tableClasses.ErrorHandle;
import tableClasses.TableOfCodes;
import tableClasses.TableOfSymbols;

import java.util.ArrayList;

import static generatedParser.SLLanguageParser.*;

/**
 * Created by BobrZlosyn on 18.12.2017.
 */
public class DeclarationTranslate {
    private String type;
    private ArrayList<String> variables = new ArrayList<>();
    private ArrayList values = new ArrayList<>();

    /**
     * zpracovava normalni deklarace ( vse krome pole)
     * @param ctx
     * @return
     */
    public void doStandardDeclaration(DeclarationContext ctx){
        System.out.println(ctx.getText());

        // preskoceni deklarace poli
        if (ctx.getChildCount() > 1) {
            String type = ctx.typeSpecifier().getText();

            String value = doDeclarationInner(type, ctx.getChild(1), 1);

        }
    }

    /**
     * vraci hodnotu
     * @param type
     * @param children
     * @param depth
     * @return
     */
    private String doDeclarationInner(String type, ParseTree children, int depth){
        String identifier;
        String value;
        if (children.getChildCount() == 1) {
            System.out.println("jednotlive casti");
            InitDeclaratorListContext ctx = (InitDeclaratorListContext) children;
            identifier = ctx.initDeclarator().Identifier().getText();

            AssignmentExpressionContext assignmentExpCtx = ctx.initDeclarator().assignmentExpression();
            if (assignmentExpCtx != null) {
                value = assignmentExpCtx.getText();

                if(Validators.isDimHere(value)) {

                    value = resolveMathProblems(assignmentExpCtx, ctx.getStart(), 0);
                }else {
                    if (Validators.isArrayHere(value)) {
                        //TODO: dosazeni promenne v poli
                    }else {
                        TableOfSymbols.addSymbol(ctx.getStart(), identifier, true, 0, type, 0, false, value);
                        TableOfCodes.addCode(EInstructionSet.LITERAL, TableOfSymbols.getLastSymbolValue().get(0).toString());
                    }
                }


            }else {
                value = null;
                TableOfSymbols.addSymbol(ctx.getStart(), identifier, true, 0, type, 0, false, value);
            }




            System.out.println("konec \n");

        }else {
            //doDeclarationInner(ct);
        }
        System.out.println(children.getChildCount());
        System.out.println(children.getText());

        return "";
    }

    /**
     * zpracovava deklaraci pole
     * @param ctx
     * @return
     */
    public boolean doArrayDeclaration(ArrayDeclarationContext ctx) {

        int firstTypeIndex = 0;
        int secondTypeIndex = 1;

        type = ctx.typeSpecifier(firstTypeIndex).getText();
        if (!type.equals(ctx.typeSpecifier(secondTypeIndex).getText())){
            ErrorHandle.addError(EErrorCodes.TYPE_MISMATCH_ARRAY,
                    ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
            return false;
        }

        String arrSize = ctx.DigitSequence().getText();

        values.add(Integer.parseInt(arrSize));
        variables.add(ctx.Identifier().toString().substring(1, ctx.Identifier().toString().length() - 1));

        return TableOfSymbols.addSymbol(ctx.getStart(), variables.get(0), true, 0, type, (int)values.get(0), false, null);
    }


    /**
     * resi problem se zavorkami (zatim jen cisla)
     * @param nextChild
     * @param ctx
     * @param depth
     * @return
     */
    private String resolveMathProblems(ParseTree nextChild, Token ctx, int depth ){
        String res = "";
        for(int i = 0; i < 100; i++) {
            if (nextChild.getChildCount() == 1) {
                nextChild = nextChild.getChild(0);
                if (nextChild.getChild(0) == null) {
                    return nextChild.getText();
                }

            }else {
                if (nextChild.getChild(0).getText().equals("(")){
                    nextChild = nextChild.getChild(1);
                }else {

                    String result = resolveMathProblems(nextChild.getChild(0), ctx, depth + 1);
                    String sign = nextChild.getChild(1).getText();
                    String right = resolveMathProblems(nextChild.getChild(2), ctx, depth + 1);

                    String num1 = TypeConvertor.convertIntegerType(ctx, result);
                    if (num1 != null) {
                        TableOfCodes.addCode(EInstructionSet.LITERAL, num1);
                    }

                    res = getResult(result, right, sign, ctx);
                    return res;
                }
            }

        }
        return res;
    }

    private String getResult(String leftNumber, String rightNumber, String sign, Token ctx ){
        String num1 = TypeConvertor.convertIntegerType(ctx, leftNumber);
        String num2 = TypeConvertor.convertIntegerType(ctx, rightNumber);
        if (num1 == null || num2 == null) {
            return "0";
        }

        int left = Integer.parseInt(num1);
        int right = Integer.parseInt(num2);
        int result = 0;
        switch (sign) {
            case "+": {
                result = left + right;
                TableOfCodes.addCode(EInstructionSet.OPERATION, EOperationCodes.PLUS.getOperationName());
            }break;

            case "-": {
                result = left - right;
                TableOfCodes.addCode(EInstructionSet.OPERATION, EOperationCodes.MINUS.getOperationName());
            }break;

            case "*": {
                result = left * right;
                TableOfCodes.addCode(EInstructionSet.OPERATION, EOperationCodes.MULLTIPLY.getOperationName());
            }break;

            case "/": {
                result = left / right;
                TableOfCodes.addCode(EInstructionSet.OPERATION, EOperationCodes.DIVIDE.getOperationName());
            }break;

            case "%": {
                result = left / right;
                TableOfCodes.addCode(EInstructionSet.OPERATION, EOperationCodes.MODULO.getOperationName());
            }break;
        }

        return String.valueOf(result);
    }

}
