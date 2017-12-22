package Convertor;

import enums.EErrorCodes;
import org.antlr.v4.runtime.Token;
import tableClasses.ErrorHandle;
import tableClasses.TableOfSymbols;

import java.util.ArrayList;

/**
 * Created by BobrZlosyn on 22.12.2017.
 */
public class TypeConvertor {
    public static final String VARIABLE_TYPE_STRING = "string";
    public static final String VARIABLE_TYPE_INT = "int";
    public static final String VARIABLE_TYPE_BOOLEAN = "boolean";
    public static final String VARIABLE_TYPE_ARRAY = "array";

    public static String convertteValue(Token ctxToken, String variableType, String value) {
        switch (variableType){
            case VARIABLE_TYPE_STRING: {
                return convertStringType(ctxToken, value);
            }
            case VARIABLE_TYPE_INT: {
                return convertIntegerType(ctxToken, value);
            }
            case VARIABLE_TYPE_BOOLEAN: {
                return convertBooleanType(ctxToken, value);
            }
            default: {
                return null;
            }
        }
    }

    public static String convertStringType(Token ctxToken, String value){

        if(Validators.isVariableName(value)) {
            TableOfSymbols.Symbol variable = TableOfSymbols.findByNameAllLevels(value, true);
            if(variable == null) {
                ErrorHandle.addError(EErrorCodes.VARIABLE_DOESNT_EXIST,
                        ctxToken.getLine(), ctxToken.getCharPositionInLine());
                return null;
            }else {
                return variable.getValue();
            }

        }else {
            char startChar = value.charAt(0);
            char endChar = value.charAt(value.length() - 1);
            if(startChar == '"' && endChar == '"') {
                return value;
            }
            ErrorHandle.addError(EErrorCodes.TYPE_MISMATCH,
                    ctxToken.getLine(), ctxToken.getCharPositionInLine());
            return null;
        }
    }

    public static String convertIntegerType(Token ctxToken, String value){

        if(Validators.isVariableName(value)) {
            TableOfSymbols.Symbol variable = TableOfSymbols.findByNameAllLevels(value, true);
            if(variable == null) {
                ErrorHandle.addError(EErrorCodes.VARIABLE_DOESNT_EXIST,
                        ctxToken.getLine(), ctxToken.getCharPositionInLine());
                return null;
            }else {
                if (variable.getVariableType().equals(VARIABLE_TYPE_INT)) {
                    return variable.getValue();
                }
                if (variable.getVariableType().equals(VARIABLE_TYPE_BOOLEAN)) {
                    return variable.getValue();
                }

                if (variable.getVariableType().equals(VARIABLE_TYPE_STRING) && Validators.isInteger(variable.getValue())) {
                    return variable.getValue();
                }

                ErrorHandle.addError(EErrorCodes.TYPE_MISMATCH,
                        ctxToken.getLine(), ctxToken.getCharPositionInLine());
                return null;
            }
        }else {
            if( Validators.isInteger(value)) {
                return value;
            }

            ErrorHandle.addError(EErrorCodes.TYPE_MISMATCH,
                    ctxToken.getLine(), ctxToken.getCharPositionInLine());
            return null;
        }
    }

    public static String convertBooleanType(Token ctxToken, String value){

        if(Validators.isBoolean(value)) {
            return value.equals("false") ? String.valueOf(0) : String.valueOf(1);
        }

        if(Validators.isVariableName(value)) {
            TableOfSymbols.Symbol variable = TableOfSymbols.findByNameAllLevels(value, true);
            if (variable == null) {
                ErrorHandle.addError(EErrorCodes.VARIABLE_DOESNT_EXIST,
                        ctxToken.getLine(), ctxToken.getCharPositionInLine());
                return null;
            } else {
                if (variable.getVariableType().equals(VARIABLE_TYPE_INT)) {
                    int number = Integer.parseInt(value);
                    return number == 0 ? String.valueOf(0) : String.valueOf(1);
                }
                if (variable.getVariableType().equals(VARIABLE_TYPE_BOOLEAN)) {
                    return variable.getValue();
                }

                if (variable.getVariableType().equals(VARIABLE_TYPE_STRING) && Validators.isInteger(variable.getValue())) {
                    if (Validators.isInteger(value)) {
                        int number = Integer.parseInt(value);
                        return number == 0 ? String.valueOf(0) : String.valueOf(1);
                    }
                }
            }

            ErrorHandle.addError(EErrorCodes.TYPE_MISMATCH,
                    ctxToken.getLine(), ctxToken.getCharPositionInLine());
            return null;
        }

        if (Validators.isInteger(value)) {
            int number = Integer.parseInt(value);
            return number == 0 ? String.valueOf(0) : String.valueOf(1);
        }

        ErrorHandle.addError(EErrorCodes.TYPE_MISMATCH,
                ctxToken.getLine(), ctxToken.getCharPositionInLine());
        return null;
    }


    public static ArrayList convertValuesToInt(TableOfSymbols.Symbol symbol){
        ArrayList values = new ArrayList();

        switch (symbol.getVariableType()){
            case VARIABLE_TYPE_STRING: {
                for (char c : symbol.getValue().toCharArray()) {
                    values.add((int) c);
                }
            }break;

            case VARIABLE_TYPE_INT: {
                values.add(Integer.parseInt(symbol.getValue()));
            } break;

            case VARIABLE_TYPE_BOOLEAN: {
                values.add(Integer.parseInt(symbol.getValue()));
            }break;

            default: {
                values.add(0);
            }
        }
        return values;
    }
}
