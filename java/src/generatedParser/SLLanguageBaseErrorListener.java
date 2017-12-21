package generatedParser;

import enums.EErrorCodes;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import tableClasses.ErrorHandle;

/**
 * Created by BobrZlosyn on 21.12.2017.
 */
public class SLLanguageBaseErrorListener extends BaseErrorListener {
    public static final SLLanguageBaseErrorListener INSTANCE = new SLLanguageBaseErrorListener();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {

        ErrorHandle.addError(EErrorCodes.PARSER_FAILED, line, charPositionInLine, msg);
        System.err.println("line " + line + ":" + charPositionInLine + " " + msg);
    }
}
