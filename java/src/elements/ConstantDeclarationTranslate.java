package elements;

import convertor.Validators;
import enums.EInstructionSet;
import generatedParser.SLLanguageParser;
import tableClasses.TableOfSymbols;

/**
 * Created by BobrZlosyn on 22.12.2017.
 */
public class ConstantDeclarationTranslate {

    public void doConstantDeclaration(SLLanguageParser.ConstDeclarationContext ctx){
        String type = ctx.typeSpecifier().getText();
        String ident = ctx.Identifier().getText();
        String value = ctx.constValues().getText();
        if (Validators.validateType(type, value)){
            EInstructionSet.handleVariables(value, ctx.getStart(), type, ident, type);

            TableOfSymbols.addSymbolConst(ctx.getStart(), ident, type, 0);
        }
    }
}
