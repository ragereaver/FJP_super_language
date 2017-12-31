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
    public static final String UNKNOWN_TYPE = "none";

    public static boolean validateType (String variableType, String value){
        boolean isVariable = false;
        TableOfSymbols.Symbol var = null;
        if (isVariableName(value)) {
            var = TableOfSymbols.findByNameAllLevels(value, true);
            isVariable = true;
        }

        if (var == null) {
            return false;
        }

        if (isVariable) {
            return (var.getVariableType().equals(variableType));
        }

        switch (variableType){
            case VARIABLE_TYPE_STRING: {
                return isString(value);
            }
            case VARIABLE_TYPE_INT: {
                return isInteger(value);
            }
            case VARIABLE_TYPE_BOOLEAN: {
                return isBoolean(value);
            }
            default: {
                return false;
            }
        }
    }

    public static String getType (String value){
        boolean isVariable = false;
        TableOfSymbols.Symbol var = null;
        if (isVariableName(value)) {
            var = TableOfSymbols.findByNameAllLevels(value, true);
            isVariable = true;
        }

        if (isVariable && var == null) {
            return UNKNOWN_TYPE;
        }


        if (isVariable) {
            return var.getVariableType();
        }

        if (isInteger(value)){
            return VARIABLE_TYPE_INT;
        }

        if (isString(value)){
            return VARIABLE_TYPE_STRING;
        }

        if (isBoolean(value)){
            return VARIABLE_TYPE_BOOLEAN;
        }

        return UNKNOWN_TYPE;
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
        String regex = "((.+)(<|>|==|-|/|%|&&|\\*|\\|\\||<=|>=|!=|!==|===|\\+)(.+))";
        return  value.matches(regex);
    }

    public static boolean isNegateSignHere (String value){
        String regex = "((.+)(!)(\\w+))";
        return  value.matches(regex);
    }

    public static boolean isKeyWord(String value){
        switch (value){
            case "boolean": return true;
            case "false": return true;
            case "true": return true;
            case "int": return true;
            case "string": return true;
            case "for": return true;
            case "if": return true;
            case "while": return true;
            case "until": return true;
            case "do": return true;
            case "case": return true;
            case "new": return true;
            case "switch": return true;
            case "return": return true;
            case "default": return true;
            case "else": return true;
            case "void": return true;
            case "const": return true;
            case "break": return true;
            case "continue": return true;
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

    public static String validateAction(String leftType, String rightType, String sign) {
        switch (sign) {
                case "+": {
                    if (leftType.equals(rightType) &&
                            (leftType.equals(VARIABLE_TYPE_INT) ||
                                    leftType.equals(VARIABLE_TYPE_ARRAY_INT))) {
                        return VARIABLE_TYPE_INT;
                    }

                    if ((leftType.equals(rightType) &&
                            (leftType.equals(VARIABLE_TYPE_STRING)))){
                        return VARIABLE_TYPE_STRING;
                    }
                }break;

                case "-": {
                    if (leftType.equals(rightType) &&
                            (leftType.equals(VARIABLE_TYPE_INT) ||
                                    leftType.equals(VARIABLE_TYPE_ARRAY_INT))) {
                        return VARIABLE_TYPE_INT;
                    }
                }break;

                case "*": {
                    if (leftType.equals(rightType) &&
                            (leftType.equals(VARIABLE_TYPE_INT) ||
                                    leftType.equals(VARIABLE_TYPE_ARRAY_INT))) {
                        return VARIABLE_TYPE_INT;
                    }
                }break;

                case "/": {
                    if (leftType.equals(rightType) &&
                            (leftType.equals(VARIABLE_TYPE_INT) ||
                                    leftType.equals(VARIABLE_TYPE_ARRAY_INT))) {
                        return VARIABLE_TYPE_INT;
                    }
                }break;

                case "%": {
                    if (leftType.equals(rightType) &&
                            (leftType.equals(VARIABLE_TYPE_INT) ||
                                    leftType.equals(VARIABLE_TYPE_ARRAY_INT))) {
                        return VARIABLE_TYPE_INT;
                    }
                }break;

                case "==": {
                    if (leftType.equals(rightType)) {
                        return VARIABLE_TYPE_BOOLEAN;
                    }
                }break;

                case "!=": {
                    if (leftType.equals(rightType)) {
                        return VARIABLE_TYPE_BOOLEAN;
                    }
                }break;

                case "<": {
                    if (leftType.equals(rightType) &&
                            (leftType.equals(VARIABLE_TYPE_INT) ||
                                    leftType.equals(VARIABLE_TYPE_ARRAY_INT))) {
                        return VARIABLE_TYPE_BOOLEAN;
                    }
                }break;

                case "<=": {
                    if (leftType.equals(rightType) &&
                            (leftType.equals(VARIABLE_TYPE_INT) ||
                                    leftType.equals(VARIABLE_TYPE_ARRAY_INT))) {
                        return VARIABLE_TYPE_BOOLEAN;
                    }
                }break;

                case ">": {
                    if (leftType.equals(rightType) &&
                            (leftType.equals(VARIABLE_TYPE_INT) ||
                                    leftType.equals(VARIABLE_TYPE_ARRAY_INT))) {
                        return VARIABLE_TYPE_BOOLEAN;
                    }
                }break;

                case ">=": {
                    if (leftType.equals(rightType) &&
                            (leftType.equals(VARIABLE_TYPE_INT) ||
                                    leftType.equals(VARIABLE_TYPE_ARRAY_INT))) {
                        return VARIABLE_TYPE_BOOLEAN;
                    }
                }break;

                case "&&": {
                    if (leftType.equals(rightType) &&
                            (leftType.equals(VARIABLE_TYPE_BOOLEAN) ||
                                    leftType.equals(VARIABLE_TYPE_ARRAY_BOOLEAN))) {
                        return VARIABLE_TYPE_BOOLEAN;
                    }
                }break;

                case "||": {
                    if (leftType.equals(rightType) &&
                            (leftType.equals(VARIABLE_TYPE_BOOLEAN) ||
                                    leftType.equals(VARIABLE_TYPE_ARRAY_BOOLEAN))) {
                        return VARIABLE_TYPE_BOOLEAN;
                    }
                }break;

                //String equal - musi se osetrit
                case "===": {
                    if (leftType.equals(rightType) &&
                            (leftType.equals(VARIABLE_TYPE_STRING))){
                        return VARIABLE_TYPE_BOOLEAN;
                    }
                }break;

                //String equal - musi se osetrit
                case "!==": {
                    if (leftType.equals(rightType) &&
                            (leftType.equals(VARIABLE_TYPE_STRING))){
                        return VARIABLE_TYPE_BOOLEAN;
                    }
                }break;
        }

        return null;
    }

    public static boolean isAssignmentHere(String value) {
        String pattern = "((\\w+)(=)((-|\\+|!)?)(\\w+)(.*))";
        return (value != null && value.matches(pattern));
    }

    public static boolean isCommaHere(String value) {
        String pattern = "((.+)(,)(.+))";
        return (value != null && value.matches(pattern));
    }
}
