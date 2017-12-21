import createFilePL0.CreateFile;
import elements.FunctionTranslate;
import generatedParser.SLLanguageBaseErrorListener;
import generatedParser.SLLanguageBaseListener;
import generatedParser.SLLanguageLexer;
import generatedParser.SLLanguageParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import tableClasses.ErrorHandle;

import java.io.File;

/**
 * Created by BobrZlosyn on 17.12.2017.
 */
public class Main {

    public static void main(String[] args) throws Exception{

        //1) load file
        //2) run with gramatic files in generated parser
        String filepath = "testFile.sll";
        File file = new File(filepath);


        CharStream input = CharStreams.fromFileName(file.getPath());
        SLLanguageLexer lexer = new SLLanguageLexer(input);
        lexer.removeErrorListeners();
        lexer.addErrorListener(SLLanguageBaseErrorListener.INSTANCE);


        CommonTokenStream tokens = new CommonTokenStream(lexer);


        SLLanguageParser parser = new SLLanguageParser(tokens);
        parser.setBuildParseTree(true);
        parser.removeErrorListeners();
        parser.addErrorListener(SLLanguageBaseErrorListener.INSTANCE);


        ParserRuleContext tree = parser.compilationUnit();


        if(ErrorHandle.hasError()) {
            CreateFile errorFile = new CreateFile(filepath);
            errorFile.writeToFile("");
        } else {

            // Walk it and attach our listener
            ParseTreeWalker walker = new ParseTreeWalker();
            SLLanguageBaseListener listener = new SLLanguageBaseListener();
            walker.walk(listener, tree);
        }

    }
}
