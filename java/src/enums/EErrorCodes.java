package enums;

/**
 * Created by BobrZlosyn on 21.12.2017.
 */
public enum EErrorCodes {

    VARIABLE_EXISTS("Variable with this name already exist!"),
    TYPE_MISMATCH_ARRAY("Variable must be same type like creating array!"),
    TYPE_MISMATCH("Variable is not convertable!"),
    VARIABLE_DOESNT_EXIST("Variable on right side doesnt exist!"),
    VARIABLE_TO_ASSIGNMENT_NOT_EXIST("Variable on left side doesnt exist!"),
    PARSER_FAILED("Parsing code wasnt possible!"),
    UNKNOW_ERROR("Some weird error happened while adding to arraylist!"),
    BAD_INDEX_ARRAY("Index must be number!"),
    OUT_OF_ARRAY("Index is out of array memory!"),
    INVALID_ACTION("Action is not allowed with these types!"),
    FUNCTION_NOT_EXIST("Function dont exist!"),
    ;

    private final String errorMessage;

    EErrorCodes(String message){
        errorMessage = message;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
