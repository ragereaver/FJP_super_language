import generatedParser.SLLanguageLexer;
import generatedParser.SLLanguageParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;

/**
 * Created by BobrZlosyn on 17.12.2017.
 */
public class Main {

    public static void main(String[] args) throws Exception{

        //1) load file
        //2) run with gramatic files in generated parser
        File file = new File("testFile.sll");


        CharStream input = CharStreams.fromFileName(file.getPath());
        SLLanguageLexer lexer = new SLLanguageLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SLLanguageParser parser = new SLLanguageParser(tokens);
        parser.setBuildParseTree(true);
        ParserRuleContext tree = parser.compilationUnit();

        for(ParseTree child : tree.children) {
            System.out.println(child.getText());
        }


        /*File file = new File("");
        try {

            BufferedReader fileReader = new BufferedReader(new FileReader(file));

        } catch (IOException e){
            e.printStackTrace();
        }*/


    }
}
