package tableClasses;

import Convertor.TypeConvertor;
import Convertor.Validators;
import enums.EErrorCodes;
import enums.EInstructionSet;
import jdk.nashorn.internal.ir.Symbol;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by BobrZlosyn on 17.12.2017.
 */
public class TableOfSymbols {


    private static ArrayList <Symbol> tableOfSymbols = new ArrayList<>();
    private static Stack <Integer> changesInParentID = new Stack<>();
    private static Stack <Integer> changesInObjectID = new Stack<>();
    private static int actualLevel = 0;
    private static int parentID = -1;
    private static int objectID = 0;
    private static int actObjectID = 0;
    public static String filepath = "";
    public static String destinationFilepath = "";

    public static class Symbol {
        private String name, variableType;
        private boolean isVariable, isConst;
        private int level, address, size, parentID, objectID;
        private int countParam;
        private ArrayList <String> params;
        private ArrayList <String> types;

        public Symbol(int parentID, int objectID, String name, boolean isVariable, int level, int address,
                                                    String variableType, int size, boolean isConst){

            this.name = name;
            this.isVariable = isVariable;
            this.level = level;
            this.address = address;
            this.variableType = variableType;
            this.size = size;
            this.isConst = isConst;
            this.parentID = parentID;
            this.objectID = objectID;
            params = new ArrayList();
            types = new ArrayList();
            countParam = 0;
        }

        public int getLevel() {
            return level;
        }

        public int getAddress() {
            return address;
        }

        public int getSize() {
            return size;
        }

        public String getName() {
            return name;
        }

        public String getVariableType() {
            return variableType;
        }

        public boolean isVariable() {
            return isVariable;
        }

        public boolean isConst() {
            return isConst;
        }

        public int getObjectID() {
            return objectID;
        }

        public int getParentID() {
            return parentID;
        }

        public int getCountParam() {
            return countParam;
        }

        public String getParamAtIndex(int index) {
            if (params.size() <= index) {
                return null;
            }
            return params.get(index);
        }

        public String getTypeAtIndex(int index) {
            if (types.size() <= index) {
                return null;
            }
            return types.get(index);
        }
    }


    public static boolean addSymbolConst(Token ctxToken, String name, String variableType, int size){

        return addSymbol(ctxToken, name, true, getNextSymbolVariableAddress(), variableType, size, true, false);
    }

    public static boolean addSymbolVariable(Token ctxToken, String name, String variableType, int size){

        return addSymbol(ctxToken, name, true, getNextSymbolVariableAddress(), variableType, size, false, false);
    }

    public static boolean addSymbolFunction(Token ctxToken, String name, String variableType){
        return addSymbol(ctxToken, name, false, TableOfCodes.getAddressInt(objectID) , variableType, 0, false, false);
    }

    public static boolean addSymbol(Token ctxToken, String name, boolean isVariable, String variableType, int size, boolean isConst, boolean isEmpty){
        return addSymbol(ctxToken, name, isVariable, getNextSymbolVariableAddress(), variableType, size, isConst, isEmpty);
    }

    public static boolean addSymbol(Token ctxToken, String name, boolean isVariable, int address, String variableType, int size, boolean isConst, boolean isEmpty){

        if (findByNameActLevel(name, isVariable) != null) {
            ErrorHandle.addError(EErrorCodes.VARIABLE_EXISTS,
                    ctxToken.getLine(), ctxToken.getCharPositionInLine());
            return false;
        }

        System.out.println("VKLADAMA DO TABLE_OF_SYMBOLS>" + parentID +", " + objectID+", " + name+", " +isVariable +", " + actualLevel+", " + address +", " + variableType +", " + size+", " + isConst );
        if (!tableOfSymbols.add(new Symbol(parentID, objectID, name, isVariable, actualLevel, address, variableType, size, isConst))) {
            ErrorHandle.addError(EErrorCodes.UNKNOW_ERROR,
                    ctxToken.getLine(), ctxToken.getCharPositionInLine());
            return false;
        }


        if (Validators.isArrayHere(variableType)) {//zapsani pole do prikazu

            TableOfCodes.updateInt(getObjectID(), size);
            for (int i = 0; i < size; i++) {
                EInstructionSet.doInstruction(EInstructionSet.LITERAL, 0);
                EInstructionSet.doInstruction(EInstructionSet.STORE, address + i);
            }
            System.out.println("last adress //////////// " + getNextSymbolVariableAddress());
        }else {//normalni promenna
            //TODO: doplnit string - pokud bude


            if (isVariable) {
                TableOfCodes.updateInt(getObjectID());
            }

            if (isVariable && !isEmpty) {
                EInstructionSet.doInstruction(EInstructionSet.STORE, address);
            }
        }

        return true;
    }


    public static Symbol findByAdress(int address){
        for (Symbol symbol : tableOfSymbols){
            if (symbol.getAddress() == address){
                return symbol;
            }
        }
        return null;
    }

    public static Symbol findByNameActLevel(String name, boolean isVariable){
        for (Symbol symbol : tableOfSymbols){
            if (symbol.getObjectID() == objectID && symbol.getName().equals(name) && (isVariable == symbol.isVariable())){
                return symbol;
            }
        }

        return null;
    }

    public static Symbol findFunction(String name, int params, ArrayList <String> types){

        int size = tableOfSymbols.size();
        Symbol symbol;
        for (int i = 0; i < size; i++){
            symbol = tableOfSymbols.get(i);
            if (symbol.getName().equals(name)
                    && !symbol.isVariable()) {
               return tableOfSymbols.get(i);
            }
        }
        return null;
    }

    public static Symbol findByNameAllLevels(String name, boolean isVariable){

        int parent = parentID;
        int object = objectID;
        int pomObject = -1;
        boolean lastRound = true;
        boolean someObjectExist = true;

        while (lastRound) {
            if (parent == -1 || !someObjectExist) {
                lastRound = false;
            }

            someObjectExist = false;
            for (int i = 0; i < tableOfSymbols.size(); i++) {
                Symbol symbol = tableOfSymbols.get(i);
                System.out.println("hledam v " + symbol.getName() + "  object " + symbol.getObjectID() + "   " + objectID);
                if(symbol.getObjectID() == object || symbol.getObjectID() == parent) {
                    if (symbol.getObjectID() == parent) {
                        someObjectExist = true;
                        parent = symbol.getParentID();
                        pomObject = symbol.getObjectID();
                    }


                    if (symbol.getName().equals(name) && (isVariable == symbol.isVariable())){
                        System.out.println("Variable is found " + symbol.getName());
                        return symbol;
                    }
                }
            }

            object = pomObject;
        }

        return null;
    }

    public static void removeAllInLevel(int level){
        int size = tableOfSymbols.size();
        for (int i = 0; i < size; i++){
            if (tableOfSymbols.get(i).getLevel() == level) {
                tableOfSymbols.remove(i);
                i--;
            }
        }

    }

    public static void setLevel(boolean isDeeper){
        if(isDeeper) {
            actualLevel++;

        }else {
            actualLevel--;
        }
    }

    public static void setObject(boolean isDeeper) {
        if(isDeeper) {
            if(parentID == 0) {
                changesInParentID.push(parentID);
                parentID = objectID;

            }else {
                parentID++;
                changesInParentID.push(-1);
            }

            changesInObjectID.push(objectID);
            objectID = ++actObjectID;

        }else {
            parentID = changesInParentID.pop();
            objectID = changesInObjectID.pop();
        }
    }

    public static int getActualLevel() {
        return actualLevel;
    }

    public static int getParentLevel() {
        int parentLevel = getActualLevel() - 1;
        return (parentLevel > 0) ? parentLevel : 0;
    }

    public static Symbol getLastSymbol(){
        return tableOfSymbols.get(tableOfSymbols.size() - 1);
    }



    public static int getNextSymbolVariableAddress(){
        Symbol symbol = null;
        for (Symbol sym : tableOfSymbols){
            if (sym.getObjectID() == objectID && (sym.isVariable())){
                symbol = sym;
            }
        }

        if (symbol == null) {
            return 3;
        }else {
            if (symbol.getSize() == 0) {
                return symbol.getAddress() + 1;
            }else {
                return symbol.getAddress() + symbol.getSize();
            }
        }
    }

    public static int getObjectID() {
        return objectID;
    }

    public static void clean() {
        tableOfSymbols.clear();
    }

    public static void updateFunction(ArrayList <String> params, ArrayList <String> paramsTypes){
        int size = tableOfSymbols.size();
        for (int i = 0; i < size; i++){
            if (tableOfSymbols.get(i).getObjectID() == objectID && !tableOfSymbols.get(i).isVariable()) {
                tableOfSymbols.get(i).countParam = params.size();
                tableOfSymbols.get(i).params = params;
                tableOfSymbols.get(i).types = paramsTypes;
            }
        }

    }
}
