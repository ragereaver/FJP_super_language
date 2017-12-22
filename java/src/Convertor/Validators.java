package Convertor;

/**
 * Created by BobrZlosyn on 22.12.2017.
 */
public class Validators {


    public static boolean isVariableName(String value) {
        String pattern = "[a-z](\\w+)?";
        return (value != null && value.matches(pattern));
    }

    public static boolean isInteger(String value) {
        String pattern = "((\\+|-)?)(\\d+)";
        return (value != null && value.matches(pattern));
    }

    public static boolean isBoolean(String value) {
        if (!value.equals("true")) {
            if (!value.equals("false")) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDimHere(String value){
        return value.contains("(");
    }

    public static boolean isArrayHere(String value){
        return value.contains("[");
    }
}
