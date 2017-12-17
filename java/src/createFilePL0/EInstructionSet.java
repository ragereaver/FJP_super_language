package createFilePL0;

/**
 * Created by BobrZlosyn on 17.12.2017.
 */
public enum EInstructionSet {
        LITERAL("LIT"),
        JUMP("JMP"),
        JUMP_COMP("JMC"),
        OPERATION("OPR"),
        CALL("CAL"),
        INT("INT"),
        LOAD("LOD"),
        STORE("STO"),
        RETURN("RET");

        private final String instructionName;

        EInstructionSet(String name){
            instructionName = name;
        }

        public String getInsturctionName() {
            return instructionName;
        }
}
