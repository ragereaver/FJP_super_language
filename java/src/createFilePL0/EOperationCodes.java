package createFilePL0;

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
}
