package tableClasses;

import enums.EInstructionSet;

import java.util.ArrayList;

/**
 * Created by BobrZlosyn on 17.12.2017.
 */
public class TableOfCodes {

    private static ArrayList<Code> tableOfMainCode = new ArrayList<>();
    private static ArrayList<ExpectingAddress> tableOfCalls = new ArrayList<>();
    private static ArrayList<ExpectingAddress> tableOfIntsJump = new ArrayList<>();


    public static  void addCode (EInstructionSet code, String value) {
        TableOfCodes.addCode(code, 0, value);
    }

    public static  void addCode (EInstructionSet code, int level, String value) {
        if (code.equals(EInstructionSet.INT)) {
            tableOfIntsJump.add(new ExpectingAddress(TableOfSymbols.getObjectID(), tableOfMainCode.size(), code));
        }

        if (code.equals(EInstructionSet.JUMP)
                || code.equals(EInstructionSet.JUMP_COMP)) {

            if (Integer.parseInt(value) == -1){
                tableOfIntsJump.add(new ExpectingAddress(TableOfSymbols.getObjectID(), tableOfMainCode.size(), code));
            }
        }

        tableOfMainCode.add(new Code(code, level, value, tableOfMainCode.size()));
    }

    public static void addCall (String value, ArrayList<String> types, String functionName) {
        ExpectingAddress call = new ExpectingAddress(TableOfSymbols.getObjectID(), tableOfMainCode.size(), EInstructionSet.CALL);
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
        for (ExpectingAddress intWait : tableOfIntsJump) {
            if (intWait.getCode().equals(EInstructionSet.INT) && intWait.getObjectID() == objectID) {
                return intWait.getCodeIndex();
            }
        }

        return defaultObject;
    }

    public static void updateInt(int objectID) {
        if (TableOfSymbols.getActualLevel() == 0) {
            TableOfCodes.updateInt(0, 1);
        }else {
            TableOfCodes.updateInt(objectID, 1);
        }

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
        int size = tableOfIntsJump.size();

        for (int i = 0; i < size; i++) {
            ExpectingAddress jump = tableOfIntsJump.get(i);
            if ( jump.getCode().equals(EInstructionSet.JUMP)
                    && jump.getObjectID() >= objectID) {

                int index = jump.getCodeIndex();
                TableOfCodes.updateCode(index, address);
                tableOfIntsJump.remove(i--);
                size--;
            }
        }
    }

    public static void updateJumpCompare(int objectID, String address) {
        int size = tableOfIntsJump.size();

        for (int i = 0; i < size; i++) {
            ExpectingAddress jump = tableOfIntsJump.get(i);
            if ( jump.getCode().equals(EInstructionSet.JUMP_COMP)
                    && jump.getObjectID() == objectID) {

                int index = jump.getCodeIndex();
                TableOfCodes.updateCode(index, address);
                tableOfIntsJump.remove(i--);
                size--;
            }
        }
    }

    public static void updateCall(ArrayList<String> types, String name, String address) {
        int size = tableOfCalls.size();
        boolean exists;

        for (int i = 0; i < size; i++) {
            ExpectingAddress call = tableOfCalls.get(i);
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
                    TableOfCodes.updateCode(call.getCodeIndex(), address);
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

}
