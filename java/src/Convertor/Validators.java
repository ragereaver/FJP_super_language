package Convertor;

import enums.EInstructionSet;
import enums.EOperationCodes;
import org.antlr.v4.runtime.Token;
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
        if (!value.equals("true")) {
            if (!value.equals("false")) {
                return false;
            }
        }
        return true;
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

}
