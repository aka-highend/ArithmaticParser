/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainanalyzer;

/**
 *
 * @author fachrur_122
 */
public class DataType {
    public enum Lexic { Blank, Operand1, Operand2, Operand3, GroupingSymbol, Operator }
    
    String substring;
    Lexic lexic;
    int tokenLexic;
    
    public DataType(String substring, Lexic lexic, int tokenLexic) {
        this.substring = substring;
        this.lexic = lexic;
        this.tokenLexic = tokenLexic;
    }
    
    public String getSubstring() { return substring; }

    public Lexic getLexic() { return lexic; }

    public int getTokenLexic() { return tokenLexic; }
}
