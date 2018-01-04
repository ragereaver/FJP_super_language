package tableClasses;

import enums.EInstructionSet;

import java.util.ArrayList;

/**
 * Created by BobrZlosyn on 17.12.2017.
 */
public class ExpectingAddress {

    private int objectID;
    private int codeIndex;
    private EInstructionSet code;
    private ArrayList <String> types;
    private String functionName;

    public ExpectingAddress(int objectID, int codeIndex, EInstructionSet code) {
        this.objectID = objectID;
        this.codeIndex = codeIndex;
        this.code = code;
        types = new ArrayList<>();
        functionName = "";
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public void setTypes(ArrayList<String> types) {
        this.types = types;
    }

    public int getObjectID() {
        return objectID;
    }

    public int getCodeIndex() {
        return codeIndex;
    }

    public EInstructionSet getCode() {
        return code;
    }

    public String getFunctionName() {
        return functionName;
    }

    public int getTypesSize() {
        return types.size();
    }

    public String getTypeAtIndex(int index) {
        if (types.size() <= index) {
            return null;
        }
        return types.get(index);
    }

}
