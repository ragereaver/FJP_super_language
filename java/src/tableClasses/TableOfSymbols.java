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
    private static ArrayList <Symbol> registerFunctions = new ArrayList<>();
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

    public static boolean addSymbolFunction(Token ctxToken, String name, String variableType, ArrayList <String> types, ArrayList <String> params){
       if( !addSymbol(ctxToken, name, false, TableOfCodes.getAddressInt(objectID) , variableType, 0, false, false)) {
            return false;
       }

        Symbol function = tableOfSymbols.get(tableOfSymbols.size() - 1);
        function.params = params;
        function.types = types;
        function.countParam = types.size();

        TableOfCodes.updateCall(types, name, String.valueOf(function.getAddress()));
        return true;
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

        }else {//normalni promenna
            //TODO: doplnit string - pokud bude

            if (isEmpty) {
                EInstructionSet.doInstruction(EInstructionSet.LITERAL, 0);
            }

            if (isVariable) {
                TableOfCodes.updateInt(getObjectID());
                EInstructionSet.doInstruction(EInstructionSet.STORE, address);
            }
        }

        return true;
    }


    public static boolean registerFunction(Token ctxToken, String name, String variableType, ArrayList <String> types, ArrayList <String> variables){
        if (functionExist(name, types)){
            ErrorHandle.addError(EErrorCodes.FUNCTION_EXISTS,
                    ctxToken.getLine(), ctxToken.getCharPositionInLine());
            return false;
        }

        boolean isVariable = false;
        boolean isConst = false;
        int address = -1;
        int size = -1;

        Symbol newFunction = new Symbol(parentID, objectID, name, isVariable, actualLevel, address, variableType, size, isConst);
        newFunction.params = variables;
        newFunction.types = types;
        newFunction.countParam = types.size();

        if (!registerFunctions.add(newFunction)) {
            ErrorHandle.addError(EErrorCodes.UNKNOW_ERROR,
                    ctxToken.getLine(), ctxToken.getCharPositionInLine());
            return false;
        }
        return true;

    }

    public static boolean functionExist(String name, ArrayList <String> types){
        boolean exists;
        int size = registerFunctions.size();

        for (int i = 0; i < size; i++) {
            Symbol symbol = registerFunctions.get(i);
            if (symbol.getName().equals(name)
                    && symbol.getCountParam() == types.size()) {

                exists = true;
                for (int j = 0; j < symbol.getCountParam(); j++) {

                    if (!symbol.getTypeAtIndex(j).equals(types.get(j))){
                        exists = false;
                        break;
                    }
                }

                if (exists) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean validFunctionType(String name, ArrayList <String> types, String expType){
        boolean exists;
        int size = registerFunctions.size();

        for (int i = 0; i < size; i++) {
            Symbol symbol = registerFunctions.get(i);
            if (symbol.getName().equals(name)
                    && symbol.getCountParam() == types.size()) {

                exists = true;
                for (int j = 0; j < symbol.getCountParam(); j++) {

                    if (!symbol.getTypeAtIndex(j).equals(types.get(j))){
                        exists = false;
                        break;
                    }
                }

                if (exists) {
                    return symbol.getVariableType().equals(expType);
                }
            }
        }

        return false;
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

    public static Symbol findFunction(String name, ArrayList <String> types){
        int size = tableOfSymbols.size();
        boolean exists;

        for (int i = 0; i < size; i++) {
            Symbol function = tableOfSymbols.get(i);
            if (function.getName().equals(name)
                    && types.size() == function.getCountParam()){

                exists = true;
                for (int j = 0; j < types.size(); j++){
                    if (!types.get(j).equals(function.getTypeAtIndex(j))){
                        exists = false;
                        break;
                    }
                }

                if(exists) {
                    return function;
                }
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

                if(symbol.getObjectID() == object || symbol.getObjectID() == parent) {
                    if (symbol.getObjectID() == parent) {
                        someObjectExist = true;
                        parent = symbol.getParentID();
                        pomObject = symbol.getObjectID();
                    }

                    if (symbol.getName().equals(name) && (isVariable == symbol.isVariable())){
                        return symbol;
                    }
                }
            }

            object = pomObject;
        }

        return null;
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
        System.out.println("object" + objectID + " parent " + parentID);
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
            if (sym.getLevel() == 0 && (sym.isVariable())) {
                symbol = sym;
            } else {
                if (sym.getObjectID() == objectID && (sym.isVariable())){
                    symbol = sym;
                }
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

}
