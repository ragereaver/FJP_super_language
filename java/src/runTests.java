import createFilePL0.CreateFile;
import generatedParser.SLLanguageBaseErrorListener;
import generatedParser.SLLanguageLexer;
import generatedParser.SLLanguageMainListener;
import generatedParser.SLLanguageParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import tableClasses.ErrorHandle;
import tableClasses.TableOfSymbols;

import java.io.File;

/**
 * Created by BobrZlosyn on 17.12.2017.
 */
public class runTests {

    public static void main(String[] args) throws Exception{

        String [] paths = {"testFiles/pole/testPole.sll"};
        Main.main(paths);

    }
}
