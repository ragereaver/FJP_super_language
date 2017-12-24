package enums;

import tableClasses.TableOfCodes;

/**
 * Created by BobrZlosyn on 17.12.2017.
 */
public enum EOperationCodes {
    UNARY_MINUS("1"),
    PLUS("2"),
    MINUS("3"),
    MULLTIPLY("4"),
    DIVIDE("5"),
    MODULO("6"),
    ODD("7"),
    EQUAL("8"),
    NOT_EQUAL("9"),
    LESS("10"),
    MORE_EQUAL("11"),
    MORE("12"),
    LESS_EQUAL("13");

    private final String operationName;

    EOperationCodes(String name){
        operationName = name;
    }

    public String getOperationName() {
        return operationName;
    }


    public static void doOperation(String sign){

        switch (sign) {
            case "+": {
                TableOfCodes.addCode(EInstructionSet.OPERATION, EOperationCodes.PLUS.getOperationName());
            }break;

            case "-": {
                TableOfCodes.addCode(EInstructionSet.OPERATION, EOperationCodes.MINUS.getOperationName());
            }break;

            case "*": {
                TableOfCodes.addCode(EInstructionSet.OPERATION, EOperationCodes.MULLTIPLY.getOperationName());
            }break;

            case "/": {
                TableOfCodes.addCode(EInstructionSet.OPERATION, EOperationCodes.DIVIDE.getOperationName());
            }break;

            case "%": {
                TableOfCodes.addCode(EInstructionSet.OPERATION, EOperationCodes.MODULO.getOperationName());
            }break;

            case "==": {
                TableOfCodes.addCode(EInstructionSet.OPERATION, EOperationCodes.EQUAL.getOperationName());
            }break;

            case "!=": {
                TableOfCodes.addCode(EInstructionSet.OPERATION, EOperationCodes.NOT_EQUAL.getOperationName());
            }break;

            case "<": {
                TableOfCodes.addCode(EInstructionSet.OPERATION, EOperationCodes.LESS.getOperationName());
            }break;

            case "<=": {
                TableOfCodes.addCode(EInstructionSet.OPERATION, EOperationCodes.LESS_EQUAL.getOperationName());
            }break;

            case ">": {
                TableOfCodes.addCode(EInstructionSet.OPERATION, EOperationCodes.MORE.getOperationName());
            }break;

            case ">=": {
                TableOfCodes.addCode(EInstructionSet.OPERATION, EOperationCodes.MORE_EQUAL.getOperationName());
            }break;

            case "&&": {
                TableOfCodes.addCode(EInstructionSet.OPERATION, EOperationCodes.MULLTIPLY.getOperationName());
                EInstructionSet.doInstruction(EInstructionSet.LITERAL, 1);
                TableOfCodes.addCode(EInstructionSet.OPERATION, EOperationCodes.EQUAL.getOperationName());
            }break;

            case "||": {
                TableOfCodes.addCode(EInstructionSet.OPERATION, EOperationCodes.PLUS.getOperationName());
                EInstructionSet.doInstruction(EInstructionSet.LITERAL, 0);
                TableOfCodes.addCode(EInstructionSet.OPERATION, EOperationCodes.MORE.getOperationName());
            }break;

            //String equal - musi se osetrit
            case "===": {
                TableOfCodes.addCode(EInstructionSet.OPERATION, EOperationCodes.EQUAL.getOperationName());
            }break;

            //String equal - musi se osetrit
            case "!==": {
                TableOfCodes.addCode(EInstructionSet.OPERATION, EOperationCodes.NOT_EQUAL.getOperationName());
            }break;
        }
    }
}
