package tableClasses;

import Convertor.Validators;
import enums.EErrorCodes;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;

/**
 * Created by BobrZlosyn on 17.12.2017.
 */
public class RegisteredFunction {

    private static ArrayList <Symbol> registerFunctions = new ArrayList<>();
    private static int maxParams = 0;
    private static int returnSize = 0;
    public static final String RETURN_NAME = "*return";
    public static final String PARAMS_NAME = "*params";

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
        Symbol newFunction = new Symbol( TableOfSymbols.getParentID(),
                                         TableOfSymbols.getObjectID(),
                                         name,
                                         isVariable,
                                         TableOfSymbols.getActualLevel(),
                                         address,
                                         variableType,
                                         size,
                                         isConst);

        newFunction.setParams(variables);
        newFunction.setTypes(types);
        newFunction.setCountParam(types.size());

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

                        System.out.println(name + "-----------------" + types.get(j));
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

    public static String getFunctionType(String name, ArrayList <String> types){
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
                    return symbol.getVariableType();
                }
            }
        }

        return Validators.UNKNOWN_TYPE;
    }


    public static void setMaxParams(int number) {
        maxParams = Integer.max(maxParams, number);
    }

    public static int getMaxParams() {
       return maxParams;
    }

    public static void setReturnSize(int number) {
        returnSize = Integer.max(returnSize, number);
    }

    public static int getReturnSize() {
        return returnSize;
    }

    public static void clean() {
        registerFunctions.clear();
        maxParams = 0;
        returnSize = 0;
    }

}
