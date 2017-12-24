package elements;

import generatedParser.SLLanguageParser;

/**
 * Created by BobrZlosyn on 23.12.2017.
 */
public class CallFunctionTranslate {

    public void doFunctionCalling(SLLanguageParser.FunctionCallContext ctx) {
        System.out.println("aaaaaaaaaaaaaa " + ctx.getText());

    }
}
