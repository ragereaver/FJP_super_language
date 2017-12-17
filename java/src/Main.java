import generatedParser.SLLanguageLexer;
import generatedParser.SLLanguageParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;

/**
 * Created by BobrZlosyn on 17.12.2017.
 */
public class Main {

    public static void main(String[] args) throws Exception{

        //1) load file
        //2) run with gramatic files in generated parser

        ANTLRFileStream input = new ANTLRFileStream(args[0]);
        SLLanguageLexer lexer = new SLLanguageLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SLLanguageParser parser = new SLLanguageParser(tokens);
        parser.setBuildParseTree(true);

        ParserRuleContext tree = parser.compilationUnit();

        System.out.println(tree.toStringTree(parser));

        /*File file = new File("");
        try {

            BufferedReader fileReader = new BufferedReader(new FileReader(file));

        } catch (IOException e){
            e.printStackTrace();
        }*/


    }
}
