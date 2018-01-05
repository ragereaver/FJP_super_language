import createFilePL0.CreateFile;
import generatedParser.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
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
            //TableOfSymbols.filepath = "tests/testFiles/pole/testPole.sll";
           TableOfSymbols.filepath = "tests/testFiles/testFile.sll";
            //TableOfSymbols.filepath = "tests/testFiles/cykly/testCycles2.sll";
           //TableOfSymbols.filepath = "tests/testFiles/zavorky/testZavorek.sll";
            //TableOfSymbols.filepath = "tests/testFiles/funkce/testFunction.sll";
            TableOfSymbols.destinationFilepath = TableOfSymbols.filepath;
        }else {
            TableOfSymbols.filepath = args[0];
            if (args.length > 1) {
                TableOfSymbols.destinationFilepath = args[1];
            }else {
                TableOfSymbols.destinationFilepath = args[0];
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


        if(!compile(tree)) {
            CreateFile errorFile = new CreateFile(TableOfSymbols.destinationFilepath);
            errorFile.writeToFile("");
            errorFile.close();
        }

        //cisteni dat
        TableOfCodes.clean();
        TableOfSymbols.clean();
        ErrorHandle.clean();
    }


    private static boolean compile(ParserRuleContext tree){
        //register functions
        ParseTreeWalker walker = new ParseTreeWalker();
        SLLanguageRegisterFunctions register = new SLLanguageRegisterFunctions();
        walker.walk(register, tree);

        if (ErrorHandle.hasError()) {
            return false;
        }


        SLLanguageMainListener listener = new SLLanguageMainListener();
        listener.setCompileFunctions(false);
        walker.walk(listener, tree);


        listener.setCompileFunctions(true);
        walker.walk(listener, tree);

        return !ErrorHandle.hasError();
    }
}
