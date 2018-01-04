package tableClasses;

import enums.EInstructionSet;

/**
 * Created by BobrZlosyn on 17.12.2017.
 */
public class Code {

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
