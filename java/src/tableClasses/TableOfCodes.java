package tableClasses;

import enums.EInstructionSet;
import javafx.scene.control.Tab;

import java.util.ArrayList;

/**
 * Created by BobrZlosyn on 17.12.2017.
 */
public class TableOfCodes {

    private static ArrayList<Code> tableOfCodes = new ArrayList<>();
    private static ArrayList<Code> tableOfCalls = new ArrayList<>();
    private static ArrayList<IntWait> tableOfIntsJump = new ArrayList<>();

    public static class IntWait {
        private int objectID;
        private int codeIndex;
        private EInstructionSet code;

        public IntWait(int objectID, int codeIndex, EInstructionSet code) {
            this.objectID = objectID;
            this.codeIndex = codeIndex;
            this.code = code;
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

        @Override
        public String toString() {
            return index + "\t" + code.getInsturctionName() + "\t" + level + "\t" + value + "\n";
        }
    }

    public static  void addCode (EInstructionSet code, String value) {
        TableOfCodes.addCode(code, TableOfSymbols.getActualLevel(), value);
    }

    public static  void addCode (EInstructionSet code, int level, String value) {
        if (code.equals(EInstructionSet.INT) || code.equals(EInstructionSet.JUMP)) {
            tableOfIntsJump.add(new IntWait(TableOfSymbols.getObjectID(),tableOfCodes.size(), code));
        }

        tableOfCodes.add(new Code(code, level, value, tableOfCodes.size()));
    }


    public static void updateCode (int index, String value) {
        tableOfCodes.get(index).setValue(value);
    }

    public static ArrayList<Code> getTableOfCodes() {
        return tableOfCodes;
    }

    public static String createString(){
        StringBuilder code = new StringBuilder();
        tableOfCodes.forEach(code1 -> code.append(code1.toString()));
        return code.toString();
    }

    public static void updateInt(int objectID) {
        TableOfCodes.updateInt(objectID, 1);
    }

    public static void updateInt(int objectID, int size) {
        tableOfIntsJump.forEach(intWait -> {
            if ( intWait.getCode().equals(EInstructionSet.INT) && intWait.getObjectID() == objectID) {

                int index = intWait.getCodeIndex();
                int value = Integer.parseInt(tableOfCodes.get(index).getValue()) + size;
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

}
