package elements;

import generatedParser.SLLanguageBaseListener;
import generatedParser.SLLanguageParser;

/**
 * Created by BobrZlosyn on 17.12.2017.
 */
public class FunctionTranslate extends SLLanguageBaseListener{

    @Override
    public void exitCompilationUnit(SLLanguageParser.CompilationUnitContext ctx) {
        System.out.println("ahojky");
    }
}
