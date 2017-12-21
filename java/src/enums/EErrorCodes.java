package enums;

/**
 * Created by BobrZlosyn on 21.12.2017.
 */
public enum EErrorCodes {

    VARIABLE_EXISTS("Variable with this name already exist!"),
    TYPE_MISMATCH_ARRAY("Variable must be same type like creating array!"),
    PARSER_FAILED("Parsing code wasnt possible!"),
    ;

    private final String errorMessage;

    EErrorCodes(String message){
        errorMessage = message;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
