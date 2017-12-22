package enums;

import Convertor.TypeConvertor;
import Convertor.Validators;
import org.antlr.v4.runtime.Token;
import tableClasses.ErrorHandle;
import tableClasses.TableOfCodes;
import tableClasses.TableOfSymbols;

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
        RETURN("RET"),

        //ROZSIRENA SADA
        NEW("NEW"),
        DELETE("DEL"),
        LOAD_ADD("LDA"), //ABSOLUTNI ADRESA
        STORE_ADD("STA"), //ABSOLUTNI ADRESA
        LOAD_ADD_LEVEL("PLD"), //load a store na zadanou adresu L, A
        STORE_ADD_LEVEL("PST"), //load a store na zadanou adresu L, A
        ;

        private final String instructionName;

        EInstructionSet(String name){
            instructionName = name;
        }

        public String getInsturctionName() {
            return instructionName;
        }

        public static void doInstruction(EInstructionSet instruction, int address) {
                TableOfCodes.addCode(instruction, String.valueOf(address));
        }

        public static void doInstruction(EInstructionSet instruction, int level, int address) {
                TableOfCodes.addCode(instruction, level, String.valueOf(address));
        }

        public static boolean loadIntegerVariable (String variable, Token token){
                if (Validators.isVariableName(variable)){
                        TableOfSymbols.Symbol sym = TableOfSymbols.findByNameAllLevels(variable, true);
                        if (sym == null) {
                                ErrorHandle.addError(EErrorCodes.VARIABLE_DOESNT_EXIST,
                                        token.getLine(), token.getCharPositionInLine());
                                return false;
                        }

                        if (!sym.getVariableType().equals(Validators.VARIABLE_TYPE_INT)){
                                ErrorHandle.addError(EErrorCodes.TYPE_MISMATCH,
                                        token.getLine(), token.getCharPositionInLine());
                                return false;
                        }

                        doInstruction(EInstructionSet.LOAD, sym.getLevel(), sym.getAddress());
                        return true;
                } else {
                        if (Validators.isInteger(variable)) {
                                TableOfCodes.addCode(EInstructionSet.LITERAL, variable);
                            return true;
                        }
                }

            ErrorHandle.addError(EErrorCodes.TYPE_MISMATCH, token.getLine(), token.getCharPositionInLine());
            return false;
        }

        public static boolean loadStringVariable (String variable, Token token){
                if (Validators.isVariableName(variable)){
                        TableOfSymbols.Symbol sym = TableOfSymbols.findByNameAllLevels(variable, true);
                        if (sym == null) {
                                ErrorHandle.addError(EErrorCodes.VARIABLE_DOESNT_EXIST,
                                        token.getLine(), token.getCharPositionInLine());
                                return false;
                        }

                        if (!sym.getVariableType().equals(Validators.VARIABLE_TYPE_STRING)){
                                ErrorHandle.addError(EErrorCodes.TYPE_MISMATCH,
                                        token.getLine(), token.getCharPositionInLine());
                                return false;
                        }

                        doInstruction(EInstructionSet.LOAD, sym.getLevel(), sym.getAddress());
                        return true;
                } else {
                        if (Validators.isString(variable)) {
                                TableOfCodes.addCode(EInstructionSet.LITERAL, variable);
                            return true;
                        }
                }
            ErrorHandle.addError(EErrorCodes.TYPE_MISMATCH, token.getLine(), token.getCharPositionInLine());
            return false;
        }

        public static boolean loadBooleanVariable (String variable, Token token){
                if (Validators.isVariableName(variable)){
                        TableOfSymbols.Symbol sym = TableOfSymbols.findByNameAllLevels(variable, true);
                        if (sym == null) {
                                ErrorHandle.addError(EErrorCodes.VARIABLE_DOESNT_EXIST,
                                        token.getLine(), token.getCharPositionInLine());
                                return false;
                        }

                        if (!sym.getVariableType().equals(Validators.VARIABLE_TYPE_BOOLEAN)){
                                ErrorHandle.addError(EErrorCodes.TYPE_MISMATCH,
                                        token.getLine(), token.getCharPositionInLine());
                                return false;
                        }

                        doInstruction(EInstructionSet.LOAD, sym.getLevel(), sym.getAddress());
                        return true;
                } else {
                    if (Validators.isBoolean(variable)) {
                        TableOfCodes.addCode(EInstructionSet.LITERAL, variable);
                        return true;
                    }
                }
            ErrorHandle.addError(EErrorCodes.TYPE_MISMATCH, token.getLine(), token.getCharPositionInLine());
            return false;
        }

        public static boolean loadIntegerArrayVariable (String variable, Token token, String index){
            if (Validators.isVariableName(variable)){
                TableOfSymbols.Symbol sym = TableOfSymbols.findByNameAllLevels(variable, true);
                if (sym == null) {
                    ErrorHandle.addError(EErrorCodes.VARIABLE_DOESNT_EXIST,
                            token.getLine(), token.getCharPositionInLine());
                    return false;
                }

                if (!sym.getVariableType().equals(Validators.VARIABLE_TYPE_ARRAY_INT)){
                    ErrorHandle.addError(EErrorCodes.TYPE_MISMATCH,
                            token.getLine(), token.getCharPositionInLine());
                    return false;
                }

                int ind = 0;
                if (Validators.isInteger(index)) {
                    ind = Integer.parseInt(index);
                    if (ind + sym.getAddress() > sym.getSize()) {
                        ErrorHandle.addError(EErrorCodes.OUT_OF_ARRAY,
                                token.getLine(), token.getCharPositionInLine());
                        return false;
                    }
                }

                //TODO: implementace proměnných v poli

                doInstruction(EInstructionSet.LOAD, sym.getLevel(), sym.getAddress() + ind);
                return true;
            }
            return false;
        }

        public static boolean loadBooleanArrayVariable (String variable, Token token, String index){
            if (Validators.isVariableName(variable)){
                TableOfSymbols.Symbol sym = TableOfSymbols.findByNameAllLevels(variable, true);
                if (sym == null) {
                    ErrorHandle.addError(EErrorCodes.VARIABLE_DOESNT_EXIST,
                            token.getLine(), token.getCharPositionInLine());
                    return false;
                }

                if (!sym.getVariableType().equals(Validators.VARIABLE_TYPE_ARRAY_BOOLEAN)){
                    ErrorHandle.addError(EErrorCodes.TYPE_MISMATCH,
                            token.getLine(), token.getCharPositionInLine());
                    return false;
                }

                int ind = 0;
                if (Validators.isInteger(index)) {
                    ind = Integer.parseInt(index);
                    if (ind + sym.getAddress() > sym.getSize()) {
                        ErrorHandle.addError(EErrorCodes.OUT_OF_ARRAY,
                                token.getLine(), token.getCharPositionInLine());
                        return false;
                    }
                }

                //TODO: implementace proměnných v poli

                doInstruction(EInstructionSet.LOAD, sym.getLevel(), sym.getAddress() + ind);
                return true;
            }
            return false;
        }

        public static boolean handleVariables(String variable, Token token, String type) {
            switch (type){
                case Validators.VARIABLE_TYPE_STRING: {
                    return loadStringVariable(variable, token);
                }
                case Validators.VARIABLE_TYPE_INT: {
                    return loadIntegerVariable(variable, token);
                }
                case Validators.VARIABLE_TYPE_BOOLEAN: {
                    return loadBooleanVariable(variable, token);
                }

                default: {
                    return false;
                }
            }
        }
}
