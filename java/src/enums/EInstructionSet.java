package enums;

import Convertor.TypeConvertor;
import Convertor.Validators;
import org.antlr.v4.runtime.Token;
import tableClasses.ErrorHandle;
import tableClasses.Symbol;
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

        public static boolean storeInstruction(String identifier, Token token){
            Symbol symbol = TableOfSymbols.findByNameAllLevels(identifier, true);
            if (symbol == null){
                return false;
            }

            if (symbol.isConst()) {
                ErrorHandle.addError(EErrorCodes.CONSTANT_CHANGE, token );
                return false;
            }
            doInstruction(EInstructionSet.STORE, TableOfSymbols.getActualLevel() - symbol.getLevel(), symbol.getAddress());
            return true;
        }

        public static boolean storeToArrayInstruction(String identifier){
            Symbol symbol = TableOfSymbols.findByNameAllLevels(identifier, true);
            if (symbol == null){
                return false;
            }


            doInstruction(EInstructionSet.LITERAL, symbol.getAddress());
            EOperationCodes.doOperation(EOperationCodes.PLUS);
            doInstruction(EInstructionSet.STORE_ADD_LEVEL, 0, 0);


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
            Symbol sym = TableOfSymbols.getValidateSymbol(variable, type, token);
            if (sym != null) {
                doInstruction(EInstructionSet.LOAD, TableOfSymbols.getActualLevel() - sym.getLevel(), sym.getAddress());
                return true;
            }else{
                return false;
            }
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

            ErrorHandle.addError(EErrorCodes.TYPE_MISMATCH, token);
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
            ErrorHandle.addError(EErrorCodes.TYPE_MISMATCH, token);
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
            if (!Validators.isVariableName(variable)){
                return false;
            }

            Symbol sym = TableOfSymbols.getValidateSymbol(variable, type, token);
            if (sym == null) {
                return false;
            }

            int ind = -1;
            if (Validators.isInteger(index)) {
                ind = Integer.parseInt(index);
            }

            if (Validators.isVariableName(index)) {
                Symbol indexSym = TableOfSymbols.getValidateSymbol(index,type.substring(0, type.length() - 2), token);

                if (indexSym == null) {
                    ErrorHandle.addError(EErrorCodes.BAD_INDEX_ARRAY, token);
                    return false;
                }


                int level = TableOfSymbols.getActualLevel() - sym.getLevel();
                doInstruction(EInstructionSet.LITERAL, 0, level);

                doInstruction(EInstructionSet.LOAD, TableOfSymbols.getActualLevel() - indexSym.getLevel(), indexSym.getAddress());
                doInstruction(EInstructionSet.LITERAL, 0, sym.getAddress());
                EOperationCodes.doOperation(EOperationCodes.PLUS);

                doInstruction(EInstructionSet.LOAD_ADD_LEVEL, 0, 0);


                return true;
            }

            if (ind < 0 || ind + sym.getAddress() > sym.getAddress() + sym.getSize()) {
                ErrorHandle.addError(EErrorCodes.OUT_OF_ARRAY, token);
                return false;
            }

            doInstruction(EInstructionSet.LOAD, TableOfSymbols.getActualLevel() - sym.getLevel(), sym.getAddress() + ind);
            return true;
        }

        public static boolean justLoadArrayVariable (Symbol array){
            int level = TableOfSymbols.getActualLevel() - array.getLevel();
            doInstruction(EInstructionSet.LITERAL, 0, level);


            doInstruction(EInstructionSet.LITERAL, 0, array.getAddress());
            EOperationCodes.doOperation(EOperationCodes.PLUS);
            doInstruction(EInstructionSet.LOAD_ADD_LEVEL, 0, 0);

            return true;
        }

        private static boolean copyArray (String variable, Token token, String type, String identifier) {

            if (Validators.isArrayHere(identifier)) {
                return handleVariables(variable, token, type.substring(0, type.length() - 2), identifier);
            }

            if (!Validators.getType(variable).equals(type)){
                ErrorHandle.addError(EErrorCodes.TYPE_MISMATCH, token);
            }


            Symbol where = TableOfSymbols.getValidateSymbol(identifier, type, token);
            Symbol what = TableOfSymbols.getValidateSymbol(variable, type, token);
            if (what == null || where == null) {
                return false;
            }
            int whatLevel = TableOfSymbols.getActualLevel() - what.getLevel();
            int whereLevel = TableOfSymbols.getActualLevel() - where.getLevel();
            int min = Integer.min(where.getSize(), what.getSize());

            for (int i = min - 1; 0 < i; i--) {
                EInstructionSet.doInstruction(EInstructionSet.LOAD, whatLevel, what.getAddress() + i);
                EInstructionSet.doInstruction(EInstructionSet.STORE, whereLevel, where.getAddress() + i);
            }

            EInstructionSet.doInstruction(EInstructionSet.LOAD, whatLevel, what.getAddress());

            return false;
        }

        public static boolean handleVariables(String variable, Token token, String type, String identifier) {

            switch (type){
                case Validators.VARIABLE_TYPE_INT: {
                    return loadIntegerVariable(variable, token, type);
                }
                case Validators.VARIABLE_TYPE_BOOLEAN: {
                    return loadBooleanVariable(variable, token, type);
                }
                case Validators.VARIABLE_TYPE_ARRAY_INT: {
                    return copyArray(variable, token, type, identifier);
                }
                case Validators.VARIABLE_TYPE_ARRAY_BOOLEAN: {
                    return copyArray(variable, token, type, identifier);
                }
                default: {
                    ErrorHandle.addError(EErrorCodes.TYPE_MISMATCH, token);
                    return false;
                }
            }
        }
}
