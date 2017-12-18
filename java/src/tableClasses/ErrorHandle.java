package tableClasses;

import java.util.ArrayList;

/**
 * Created by BobrZlosyn on 18.12.2017.
 */
public class ErrorHandle {

    public static final String VARIABLE_EXISTS = "Variable with this name already exist!";
    public static final String TYPE_MISMATCH_ARRAY = "Variable must be same type like creating array!";




    private static ArrayList<Error> ErrorArray = new ArrayList<>();

    private static class Error {
        private String message;
        private int line;

        public Error (String message, int line) {
            this.message = message;
            this.line = line;
        }

        @Override
        public String toString() {
            return "Warning: At line " + line + ":" + message;
        }
    }


    public static void addError(String message, int line){
        ErrorArray.add(new Error(message, line));
    }

    public static String createString(){
        StringBuilder errors = new StringBuilder();
        ErrorArray.forEach(error -> errors.append(error.toString()));
        return  errors.toString();
    }
}
