package Convertor;


/**
 * Created by BobrZlosyn on 22.12.2017.
 */
public class TypeConvertor {


    public static int getBooleanValue(String value) {
        if (value.equals("true")){
            return 1;
        }else {
            return 0;
        }
    }

    public static String convertArrayTypes(String type, String defType) {
        if (Validators.VARIABLE_TYPE_ARRAY_INT.equals(type) && Validators.VARIABLE_TYPE_INT.equals(defType)){
            return Validators.VARIABLE_TYPE_INT;
        }

        if (Validators.VARIABLE_TYPE_ARRAY_BOOLEAN.equals(type) && Validators.VARIABLE_TYPE_BOOLEAN.equals(defType)){
            return Validators.VARIABLE_TYPE_BOOLEAN;
        }
        return type;
    }

    public static String convertArrayTypesToSimple(String type) {
        if (Validators.VARIABLE_TYPE_ARRAY_INT.equals(type)){
            return Validators.VARIABLE_TYPE_INT;
        }

        if (Validators.VARIABLE_TYPE_ARRAY_BOOLEAN.equals(type)){
            return Validators.VARIABLE_TYPE_BOOLEAN;
        }
        return type;
    }

    public static String convertSimpleToArray(String type) {
        if (Validators.VARIABLE_TYPE_INT.equals(type)){
            return Validators.VARIABLE_TYPE_ARRAY_INT;
        }

        if (Validators.VARIABLE_TYPE_BOOLEAN.equals(type)){
            return Validators.VARIABLE_TYPE_ARRAY_BOOLEAN;
        }
        return type;
    }
}
