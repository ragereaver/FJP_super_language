package tableClasses;

import enums.EInstructionSet;

import java.util.ArrayList;

/**
 * Created by BobrZlosyn on 17.12.2017.
 */
public class TableOfCodes {

    private static ArrayList<Code> tableOfCodes = new ArrayList<>();

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

    public static  void addCode (EInstructionSet code, int level, String value) {
        tableOfCodes.add(new Code(code, level, value, tableOfCodes.size()));
    }

    public static  void addCode (EInstructionSet code, String value) {
        tableOfCodes.add(new Code(code, TableOfSymbols.getActualLevel(), value, tableOfCodes.size()));
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
}
