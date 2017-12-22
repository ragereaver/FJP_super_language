package tableClasses;

import enums.EErrorCodes;

import java.util.ArrayList;

/**
 * Created by BobrZlosyn on 18.12.2017.
 */
public class ErrorHandle {
    private static ArrayList<Error> errorArray = new ArrayList<>();

    private static class Error {
        private EErrorCodes code;
        private String additionalMsg;
        private int line, character;

        public Error (EErrorCodes code, int line, int character, String additionalMsg) {
            this.code = code;
            this.line = line;
            this.additionalMsg = additionalMsg;
            this.character = character;
        }

        @Override
        public String toString() {
            return "Warning: At line " + line + ":" + character + " - " + code.getErrorMessage() + " " + additionalMsg + "\n";
        }
    }


    public static void addError(EErrorCodes code, int line, int character){
        addError(code, line, character, "");
    }

    public static void addError(EErrorCodes code, int line, int character, String additionalMsg){
        errorArray.add(new Error(code, line, character, additionalMsg));
    }

    public static String createString(){
        StringBuilder errors = new StringBuilder();
        errorArray.forEach(error -> errors.append(error.toString()));
        return  errors.toString();
    }

    public static boolean hasError() {
        return !errorArray.isEmpty();
    }
}
