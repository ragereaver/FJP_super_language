package createFilePL0;

import java.util.ArrayList;

/**
 * Created by BobrZlosyn on 17.12.2017.
 */
public class TableOfCodes {

    private static ArrayList<Code> tableOfCodes;

    public static class Code {
        private EOperationCodes code;
        private int level;
        private int value;
        private int index;

        public Code (EOperationCodes code, int level, int value, int index) {
            this.code = code;
            this.level = level;
            this.value = value;
            this.index = index;
        }

        public int getLevel() {
            return level;
        }

        public EOperationCodes getCode() {
            return code;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return index + "\t" + code.getOperationName() + "\t" + level + "\t" + value + "\n";
        }
    }

    public static  void addCode (EOperationCodes code, int level, int value) {
        tableOfCodes.add(new Code(code, level, value, tableOfCodes.size()));
    }

    public static void updateCode (int index, int value) {
        tableOfCodes.get(index).setValue(value);
    }

    public static ArrayList<Code> getTableOfCodes() {
        return tableOfCodes;
    }
}
