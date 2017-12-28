import Convertor.TypeConvertor;
import createFilePL0.CreateFile;
import elements.FunctionTranslate;
import generatedParser.*;
import javafx.scene.control.Tab;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import tableClasses.ErrorHandle;
import tableClasses.TableOfCodes;
import tableClasses.TableOfSymbols;

import java.io.File;

/**
 * Created by BobrZlosyn on 17.12.2017.
 */
public class Main {

    public static void main(String[] args) throws Exception{

        //1) load file
        //2) run with gramatic files in generated parser
        if (args.length == 0) {
             //TableOfSymbols.filepath = "tests/testFiles/assigment/testAssignment.sll";
           // TableOfSymbols.filepath = "tests/testFiles/funkce/testFunction.sll";
            //TableOfSymbols.filepath = "tests/testFiles/testFile.sll";
            TableOfSymbols.filepath = "tests/testFiles/cykly/testCycles.sll";
            TableOfSymbols.destinationFilepath = TableOfSymbols.filepath;
        }else {
            TableOfSymbols.filepath = args[0];
            if (args.length > 1) {
                TableOfSymbols.destinationFilepath = args[1];
            }
        }

        //TableOfSymbols.filepath = "testFiles/zavorky/testZavorek.sll";
        //TableOfSymbols.filepath = "testFiles/cykly/testCycles.sll";

        File file = new File(TableOfSymbols.filepath);
        if (!file.exists() || file.isDirectory()) {
            System.err.println("File wasnt found!");
            return;
        }

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
            CreateFile errorFile = new CreateFile(TableOfSymbols.destinationFilepath);
            errorFile.writeToFile("");
            errorFile.close();
        } else {

            // Walk it and attach our listener
            ParseTreeWalker walker = new ParseTreeWalker();
            SLLanguageMainListener listener = new SLLanguageMainListener();
            walker.walk(listener, tree);
        }


        //cisteni dat
        TableOfCodes.clean();
        TableOfSymbols.clean();
        ErrorHandle.clean();
    }
}
