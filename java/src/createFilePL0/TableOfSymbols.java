package createFilePL0;

import java.util.ArrayList;

/**
 * Created by BobrZlosyn on 17.12.2017.
 */
public class TableOfSymbols {
    public static final String VARIABLE_TYPE_STRING = "string";
    public static final String VARIABLE_TYPE_INT = "int";
    public static final String VARIABLE_TYPE_BOOLEAN = "bool";
    public static final String VARIABLE_TYPE_ARRAY = "array";

    private static ArrayList<Symbols> tableOfSymbols = new ArrayList<>();;

    public static class Symbols {
        private String name, variableType;
        private boolean isVariable, isConst;
        private int level, address, size;

        public Symbols(String name, boolean isVariable, int level, int address, String variableType, int size, boolean isConst){

            this.name = name;
            this.isVariable = isVariable;
            this.level = level;
            this.address = address;
            this.variableType = variableType;
            this.size = size;
            this.isConst = isConst;
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
    }

    public static boolean addSymbol(String name, boolean isVariable, int level, int address, String variableType, int size, boolean isConst){
        for (Symbols symbol : tableOfSymbols){
            if (symbol.getLevel() == level && symbol.getName().equals(name) && (isVariable == symbol.isVariable())){
                return false;
            }
        }

        return tableOfSymbols.add(new Symbols(name, isVariable, level, address, variableType, size, isConst));
    }

    public static Symbols findByAdress(int address){
        for (Symbols symbol : tableOfSymbols){
            if (symbol.getAddress() == address){
                return symbol;
            }
        }
        return null;
    }

    public static Symbols findByName(String name, boolean isVariable, int level){
        for (Symbols symbol : tableOfSymbols){
            if (symbol.getLevel() == level && symbol.getName().equals(name) && (isVariable == symbol.isVariable())){
                return symbol;
            }
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
}
