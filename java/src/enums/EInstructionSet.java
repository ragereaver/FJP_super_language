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
        NEW("NEW"), //alokace 1 bunky pameti, na zasobnik jeji adresa */
        DELETE("DEL"), //dealokace 1 bunky pameti, jeji adresa na vrcholu zasobniku */
        LOAD_ADD("LDA"), //na vrchol zasobniku data z adresy uvedene na vrcholu zasobniku */
        STORE_ADD("STA"), //na zasobniku hodnota, adresa -> ulozeni hodnoty na adresu */
        LOAD_ADD_LEVEL("PLD"), //na zasobniku L, A -> na vrchol hodnota z (L, A) */
        STORE_ADD_LEVEL("PST"), //na zasobnkku X, L, A -> na adresu (L, A) se ulozi X */
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

        public static boolean storeInstruction(String identifier){
            TableOfSymbols.Symbol symbol = TableOfSymbols.findByNameAllLevels(identifier, true);
            if (symbol == null){
                return false;
            }

            doInstruction(EInstructionSet.STORE, TableOfSymbols.getActualLevel() - symbol.getLevel(), symbol.getAddress());
            return true;
        }

    /**
     * nacte hodnotu prommenne a ulozi ji na vrchol zasobniku
     * @param variable
     * @param token
     * @param type
     * @return
     */
        public static boolean loadVariableName(String variable, Token token, String type){
                TableOfSymbols.Symbol sym = TableOfSymbols.findByNameAllLevels(variable, true);
                if (sym == null) {
                    ErrorHandle.addError(EErrorCodes.VARIABLE_DOESNT_EXIST,
                            token.getLine(), token.getCharPositionInLine());
                    return false;
                }

                if (!sym.getVariableType().equals(type)){
                    ErrorHandle.addError(EErrorCodes.TYPE_MISMATCH,
                            token.getLine(), token.getCharPositionInLine());
                    return false;
                }

                System.out.println(token.getLine() + " ----------- " + variable + "          " + TableOfSymbols.getActualLevel() + "            " + sym.getLevel());
                doInstruction(EInstructionSet.LOAD, TableOfSymbols.getActualLevel() - sym.getLevel(), sym.getAddress());
                return true;
        }

    /**
     * porovna zda se jedna o prommenou nebo konstantni vyraz a da hodnotu na vrchol zasobniku
     * @param variable
     * @param token
     * @param type
     * @return
     */
        public static boolean loadIntegerVariable (String variable, Token token, String type){
                if (Validators.isVariableName(variable)){
                    return loadVariableName(variable, token, type);

                } else {
                    if (Validators.isInteger(variable)) {
                            TableOfCodes.addCode(EInstructionSet.LITERAL, variable);
                        return true;
                    }
                }
            ErrorHandle.addError(EErrorCodes.TYPE_MISMATCH, token.getLine(), token.getCharPositionInLine());
            return false;
        }

    /**
     * porovna zda se jedna o prommenou nebo konstantni vyraz a da hodnotu na vrchol zasobniku
     * @param variable
     * @param token
     * @param type
     * @return
     */
        public static boolean loadStringVariable (String variable, Token token, String type){
                if (Validators.isVariableName(variable)){
                    return loadVariableName(variable, token, type);
                } else {
                        if (Validators.isString(variable)) {
                                TableOfCodes.addCode(EInstructionSet.LITERAL, variable);
                            return true;
                        }
                }
            ErrorHandle.addError(EErrorCodes.TYPE_MISMATCH, token.getLine(), token.getCharPositionInLine());
            return false;
        }

    /**
     * porovna zda se jedna o prommenou nebo konstantni vyraz a da hodnotu na vrchol zasobniku
     * @param variable
     * @param token
     * @param type
     * @return
     */
        public static boolean loadBooleanVariable (String variable, Token token, String type){
            if (Validators.isVariableName(variable)){
                return loadVariableName(variable, token, type);
            } else {
                if (Validators.isBoolean(variable)) {
                    EInstructionSet.doInstruction(EInstructionSet.LITERAL, TypeConvertor.getBooleanValue(variable));
                    return true;
                }
            }
            ErrorHandle.addError(EErrorCodes.TYPE_MISMATCH, token.getLine(), token.getCharPositionInLine());
            return false;
        }

    /**
     * melo by ziskat adresu podle indexu v poli a nasledne vytahnout hodnotu na vrchol zasobniku
     * @param variable
     * @param token
     * @param index
     * @param type
     * @return
     */
        public static boolean loadArrayVariable (String variable, Token token, String index, String type){
            if (Validators.isVariableName(variable)){
                TableOfSymbols.Symbol sym = TableOfSymbols.findByNameAllLevels(variable, true);
                if (sym == null) {
                    ErrorHandle.addError(EErrorCodes.VARIABLE_DOESNT_EXIST,
                            token.getLine(), token.getCharPositionInLine());
                    return false;
                }

                if (!sym.getVariableType().equals(type)){
                    ErrorHandle.addError(EErrorCodes.TYPE_MISMATCH,
                            token.getLine(), token.getCharPositionInLine());
                    return false;
                }

                int ind = -1;
                if (Validators.isInteger(index)) {
                    ind = Integer.parseInt(index);
                }

                if (Validators.isVariableName(index)) {
                    TableOfSymbols.Symbol indexSym = TableOfSymbols.findByNameAllLevels(variable, true);
                    if (indexSym != null) {
                        if (indexSym.getVariableType().equals(Validators.VARIABLE_TYPE_INT)) {
                            doInstruction(EInstructionSet.LOAD, TableOfSymbols.getActualLevel() - indexSym.getLevel(), indexSym.getAddress());
                            doInstruction(EInstructionSet.LOAD, TableOfSymbols.getActualLevel() - sym.getLevel(), sym.getAddress());
                            EOperationCodes.doOperation("+");
                            doInstruction(EInstructionSet.LOAD_ADD, TableOfSymbols.getActualLevel() - sym.getLevel(), sym.getAddress());
                            return true;
                        }else {
                            ErrorHandle.addError(EErrorCodes.BAD_INDEX_ARRAY,
                                    token.getLine(), token.getCharPositionInLine());
                            return false;
                        }
                    }else {
                        ErrorHandle.addError(EErrorCodes.VARIABLE_DOESNT_EXIST,
                                token.getLine(), token.getCharPositionInLine());
                        return false;
                    }
                }

                if (ind < 0 || ind + sym.getAddress() > sym.getSize()) {
                    ErrorHandle.addError(EErrorCodes.OUT_OF_ARRAY,
                            token.getLine(), token.getCharPositionInLine());
                    return false;
                }

                doInstruction(EInstructionSet.LOAD, TableOfSymbols.getActualLevel() - sym.getLevel(), sym.getAddress() + ind);
                return true;
            }
            return false;
        }

        public static boolean handleVariables(String variable, Token token, String type) {
            switch (type){
                case Validators.VARIABLE_TYPE_STRING: {
                    return loadStringVariable(variable, token, type);
                }
                case Validators.VARIABLE_TYPE_INT: {
                    return loadIntegerVariable(variable, token, type);
                }
                case Validators.VARIABLE_TYPE_BOOLEAN: {
                    return loadBooleanVariable(variable, token, type);
                }

                default: {
                    return false;
                }
            }
        }
}
