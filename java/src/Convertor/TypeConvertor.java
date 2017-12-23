package Convertor;


/**
 * Created by BobrZlosyn on 22.12.2017.
 */
public class TypeConvertor {


    public static int getBooleanValue(String value) {
        if (value.equals("true")){
            return 1;
        }else {
            return 0;
        }
    }
/*
    public static boolean validateValue(Token ctxToken, String variableType, String value) {
        switch (variableType){
            case VARIABLE_TYPE_STRING: {
                char startChar = value.charAt(0);
                char endChar = value.charAt(value.length() - 1);
                if(startChar == '"' && endChar == '"') {
                    return value;
                }

                return convertStringType(ctxToken, value);
            }
            case VARIABLE_TYPE_INT: {
                if( Validators.isInteger(value)) {
                    return true;
                }

                return validateName(ctxToken, value, variableType);
            }
            case VARIABLE_TYPE_BOOLEAN: {
                if(Validators.isBoolean(value)) {
                    return true;
                }

                return validateName(ctxToken, value, variableType);
            }
            default: {
                return false;
            }
        }
    }
*/

/*
    public static String validateStringType(Token ctxToken, String value){

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

    public static String validateIntegerType(Token ctxToken, String value){

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

    public static String validateBooleanType(Token ctxToken, String value){

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


    public static ArrayList validateValuesToInt(TableOfSymbols.Symbol symbol){
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
    }*/
}
