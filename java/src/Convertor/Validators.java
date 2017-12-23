package Convertor;

import enums.EErrorCodes;
import enums.EInstructionSet;
import enums.EOperationCodes;
import org.antlr.v4.runtime.Token;
import tableClasses.ErrorHandle;
import tableClasses.TableOfCodes;
import tableClasses.TableOfSymbols;

/**
 * Created by BobrZlosyn on 22.12.2017.
 */
public class Validators {
    public static final String VARIABLE_TYPE_STRING = "string";
    public static final String VARIABLE_TYPE_INT = "int";
    public static final String VARIABLE_TYPE_BOOLEAN = "boolean";
    public static final String VARIABLE_TYPE_ARRAY_INT = "int[]";
    public static final String VARIABLE_TYPE_ARRAY_BOOLEAN = "boolean[]";

    public static boolean validateType (String variableType, String value){
        boolean isVariable = false;
        TableOfSymbols.Symbol var = null;
        if (isVariableName(value)) {
            var = TableOfSymbols.findByNameAllLevels(value, true);
            isVariable = true;
        }

        switch (variableType){
            case VARIABLE_TYPE_STRING: {
                if (isVariable && var != null) {
                    return  (var.getVariableType().equals(variableType));
                }else {
                    return isString(value);
                }
            }
            case VARIABLE_TYPE_INT: {
                if (isVariable && var != null) {
                    return var.getVariableType().equals(variableType);
                }else {
                    return isInteger(value);
                }
            }
            case VARIABLE_TYPE_BOOLEAN: {
                if (isVariable && var != null) {
                    return var.getVariableType().equals(variableType);
                }else {
                    return isBoolean(value);
                }
            }

            default: {
                return false;
            }
        }
    }

    public static boolean isString(String value) {
        if (value == null || value.length() < 2) {
            return false;
        }

        char startChar = value.charAt(0);
        char endChar = value.charAt(value.length() - 1);
        return (startChar == '"' && endChar == '"');
    }

    public static boolean isVariableName(String value) {
        if(Validators.isKeyWord(value)) {
            return false;
        }

        String pattern = "[a-z](\\w+)?";
        return (value != null && value.matches(pattern));
    }

    public static boolean isInteger(String value) {
        String pattern = "((\\+|-)?)(\\d+)";
        return (value != null && value.matches(pattern));
    }

    public static boolean isBoolean(String value) {
        return  (value.equals("true") || value.equals("false"));
    }

    public static boolean isDimHere(String value){
        return value.contains("(");
    }

    public static boolean isTernalIfHere(String value){
        return value.contains("?");
    }

    public static boolean isArrayHere(String value){
        return value.contains("[");
    }

    public static boolean isSignHere (String value){
        String regex = "(.(<|>|=|\\*|-|\\+|/|%|&|\\|).)";
        return  value.matches(regex);
    }

    public static boolean isKeyWord(String value){
        switch (value){
            case "boolean": return true;
            case "false": return true;
            case "true": return true;
            case "int": return true;
            case "string": return true;
            default: return false;
        }
    }

    public static String getType (Token token, String variable) {
        if (isVariableName(variable)) {
            TableOfSymbols.Symbol sym = TableOfSymbols.findByNameAllLevels(variable, true);
            System.out.println("ahoj");
            if (sym == null) {
                ErrorHandle.addError(EErrorCodes.VARIABLE_DOESNT_EXIST,
                        token.getLine(), token.getCharPositionInLine());
                return "";
            }
            return sym.getVariableType();
        }else {
            if (isInteger(variable)){
                return VARIABLE_TYPE_INT;
            }

            if (isBoolean(variable)){
                return VARIABLE_TYPE_BOOLEAN;
            }

            if (isString(variable)){
                return VARIABLE_TYPE_STRING;
            }
        }
        return "";
    }

    public static boolean validateAction(String leftType, String rightType, String sign) {
        switch (sign) {
                case "+": {
                    return (leftType.equals(rightType) &&
                            (leftType.equals(VARIABLE_TYPE_INT) ||
                                    leftType.equals(VARIABLE_TYPE_ARRAY_INT) ||
                                    leftType.equals(VARIABLE_TYPE_STRING)));
                }

                case "-": {
                    return (leftType.equals(rightType) &&
                            (leftType.equals(VARIABLE_TYPE_INT) ||
                                    leftType.equals(VARIABLE_TYPE_ARRAY_INT)));
                }

                case "*": {
                    return (leftType.equals(rightType) &&
                            (leftType.equals(VARIABLE_TYPE_INT) ||
                                    leftType.equals(VARIABLE_TYPE_ARRAY_INT)));
                }

                case "/": {
                    return (leftType.equals(rightType) &&
                            (leftType.equals(VARIABLE_TYPE_INT) ||
                                    leftType.equals(VARIABLE_TYPE_ARRAY_INT)));
                }

                case "%": {
                    return (leftType.equals(rightType) &&
                            (leftType.equals(VARIABLE_TYPE_INT) ||
                                    leftType.equals(VARIABLE_TYPE_ARRAY_INT)));
                }

                case "==": {
                    return (leftType.equals(rightType));
                }

                case "!=": {
                    return (leftType.equals(rightType));
                }

                case "<": {
                    return (leftType.equals(rightType) &&
                            (leftType.equals(VARIABLE_TYPE_INT) ||
                                    leftType.equals(VARIABLE_TYPE_ARRAY_INT)));
                }

                case "<=": {
                    return (leftType.equals(rightType) &&
                            (leftType.equals(VARIABLE_TYPE_INT) ||
                                    leftType.equals(VARIABLE_TYPE_ARRAY_INT)));
                }

                case ">": {
                    return (leftType.equals(rightType) &&
                            (leftType.equals(VARIABLE_TYPE_INT) ||
                                    leftType.equals(VARIABLE_TYPE_ARRAY_INT)));
                }

                case ">=": {
                    return (leftType.equals(rightType) &&
                            (leftType.equals(VARIABLE_TYPE_INT) ||
                                    leftType.equals(VARIABLE_TYPE_ARRAY_INT)));
                }

                //String equal - musi se osetrit
                case "===": {
                    return (leftType.equals(rightType) &&
                            (leftType.equals(VARIABLE_TYPE_STRING)));
                }

                //String equal - musi se osetrit
                case "!==": {
                    return (leftType.equals(rightType) &&
                            (leftType.equals(VARIABLE_TYPE_STRING)));
                }
        }

        return false;
    }

}
