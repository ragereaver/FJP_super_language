package tableClasses;


import java.util.ArrayList;

/**
 * Created by BobrZlosyn on 17.12.2017.
 */
public class Symbol {

    private String name, variableType;
    private boolean isVariable, isConst;
    private int level, address, size, parentID, objectID;
    private int countParam;
    private ArrayList <String> params;
    private ArrayList <String> types;

    public Symbol(int parentID, int objectID, String name, boolean isVariable, int level, int address,
                                                String variableType, int size, boolean isConst){

        this.name = name;
        this.isVariable = isVariable;
        this.level = level;
        this.address = address;
        this.variableType = variableType;
        this.size = size;
        this.isConst = isConst;
        this.parentID = parentID;
        this.objectID = objectID;
        params = new ArrayList();
        types = new ArrayList();
        countParam = 0;
    }



    public int getLevel() {
        return level;
    }

    public int getAddress() {
        return address;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public String getVariableType() {
        return variableType;
    }

    public boolean isVariable() {
        return isVariable;
    }

    public boolean isConst() {
        return isConst;
    }

    public int getObjectID() {
        return objectID;
    }

    public int getParentID() {
        return parentID;
    }

    public int getCountParam() {
        return countParam;
    }

    public String getParamAtIndex(int index) {
        if (params.size() <= index) {
            return null;
        }
        return params.get(index);
    }

    public String getTypeAtIndex(int index) {
        if (types.size() <= index) {
            return null;
        }
        return types.get(index);
    }

    public void setParams(ArrayList<String> params) {
        this.params = params;
    }

    public void setCountParam(int countParam) {
        this.countParam = countParam;
    }

    public void setTypes(ArrayList<String> types) {
        this.types = types;
    }

    public void setVariableType(String variableType) {
        this.variableType = variableType;
    }
}
