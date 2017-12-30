package tableClasses;

import enums.EInstructionSet;

import java.util.ArrayList;

/**
 * Created by BobrZlosyn on 17.12.2017.
 */
public class TableOfCodes {

    private static ArrayList<Code> tableOfMainCode = new ArrayList<>();
    private static ArrayList<IntWait> tableOfCalls = new ArrayList<>();
    private static ArrayList<IntWait> tableOfIntsJump = new ArrayList<>();
    private static boolean isInFunction = false;

    public static class IntWait {
        private int objectID;
        private int codeIndex;
        private EInstructionSet code;
        private ArrayList <String> types;
        private String functionName;

        public IntWait(int objectID, int codeIndex, EInstructionSet code) {
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

    public static class Code {
        private EInstructionSet code;
        private int level;
        private String value;
        private int index;

        public Code (EInstructionSet code, int level, String value, int index) {
            this.code = code;
            this.level = level;
            this.value = value;
            this.index = index;
        }

        public int getLevel() {
            return level;
        }

        public EInstructionSet getCode() {
            return code;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String toString() {
            return index + "\t" + code.getInsturctionName() + "\t" + level + "\t" + value + "\n";
        }
    }

    public static  void addCode (EInstructionSet code, String value) {
        TableOfCodes.addCode(code, TableOfSymbols.getActualLevel(), value);
    }

    public static  void addCode (EInstructionSet code, int level, String value) {
        if (code.equals(EInstructionSet.INT)
                || code.equals(EInstructionSet.JUMP)
                || code.equals(EInstructionSet.JUMP_COMP)) {

            tableOfIntsJump.add(new IntWait(TableOfSymbols.getObjectID(), tableOfMainCode.size(), code));
        }

        tableOfMainCode.add(new Code(code, level, value, tableOfMainCode.size()));
    }

    public static void addCall (String value, ArrayList<String> types, String functionName) {
        IntWait call = new IntWait(TableOfSymbols.getObjectID(), tableOfMainCode.size(), EInstructionSet.CALL);
        call.setFunctionName(functionName);
        call.setTypes(types);
        tableOfCalls.add(call);

        tableOfMainCode.add(new Code(EInstructionSet.CALL, 0, value, tableOfMainCode.size()));
    }

    public static void updateCode (int index, String value) {
        tableOfMainCode.get(index).setValue(value);
    }

    public static ArrayList<Code> getTableOfMainCode() {
        return tableOfMainCode;
    }

    public static String createString(){
        StringBuilder code = new StringBuilder();
        tableOfMainCode.forEach(code1 -> code.append(code1.toString()));
        return code.toString();
    }

    public static int getAddressInt(int objectID) {
        int defaultObject = -1;
        for (IntWait intWait : tableOfIntsJump) {
            if (intWait.getCode().equals(EInstructionSet.INT) && intWait.getObjectID() == objectID) {
                return intWait.getCodeIndex();
            }
        }

        return defaultObject;
    }

    public static void updateInt(int objectID) {
        TableOfCodes.updateInt(objectID, 1);
    }

    public static void updateInt(int objectID, int size) {
        tableOfIntsJump.forEach(intWait -> {
            if ( intWait.getCode().equals(EInstructionSet.INT) && intWait.getObjectID() == objectID) {

                int index = intWait.getCodeIndex();
                int value = Integer.parseInt(tableOfMainCode.get(index).getValue()) + size;
                TableOfCodes.updateCode(index, String.valueOf(value));
                return;
            }
        });
    }

    public static void updateJump(int objectID, String address) {
        tableOfIntsJump.forEach(intWait -> {
            if ( intWait.getCode().equals(EInstructionSet.JUMP) && intWait.getObjectID() == objectID) {
                int index = intWait.getCodeIndex();
                TableOfCodes.updateCode(index, address);
                return;
            }
        });
    }

    public static void updateJumpCompare(int objectID, String address) {
        tableOfIntsJump.forEach(intWait -> {
            if ( intWait.getCode().equals(EInstructionSet.JUMP_COMP) && intWait.getObjectID() == objectID) {
                int index = intWait.getCodeIndex();
                TableOfCodes.updateCode(index, address);
                return;
            }
        });
    }

    public static void updateCall(ArrayList<String> types, String name, String address) {
        int size = tableOfCalls.size();
        boolean exists;

        for (int i = 0; i < size; i++) {
            IntWait call = tableOfCalls.get(i);
            if (call.getFunctionName().equals(name)
                    && types.size() == call.getTypesSize()){

                exists = true;
                for (int j = 0; j < types.size(); j++){
                    if (!types.get(j).equals(call.getTypeAtIndex(j))){
                        exists = false;
                        break;
                    }
                }

                if(exists) {
                    tableOfMainCode.get(call.getCodeIndex()).setValue(address);
                    tableOfCalls.remove(i--);
                    size--;
                }
            }
        }
    }
    public static void clean() {
        tableOfCalls.clear();
        tableOfMainCode.clear();
        tableOfIntsJump.clear();
    }

    public static void setIsInFunction(boolean isInFunction) {
        TableOfCodes.isInFunction = isInFunction;
    }
}
