/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.ArrayList;
import mainanalyzer.DataType;

/**
 *
 * @author fachrur_122
 */
public class OutputFrame extends javax.swing.JFrame {

    /**
     * Creates new form OutputFrame
     */
    public OutputFrame(String stringInput) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Teori Komputasi - IF3706");
        
        ArrayList<DataType> substringList = new ArrayList<>();
        DataType.Lexic lexic = DataType.Lexic.Blank;
        String substring = "";
        int tokenLexic = 0;
        for (int i = 0; i < stringInput.length(); i++) {
            switch (tokenLexic) {
                case 0 :
                    if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        lexic = DataType.Lexic.Blank;
                        substring = "";
                        tokenLexic = 0;
                    }
                    else if (stringInput.charAt(i) == '0') {
                        lexic = DataType.Lexic.Operand3;
                        substring += stringInput.charAt(i);
                        tokenLexic = 3;
                        if (i == stringInput.length() - 1) {
                            tokenLexic = 3;
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    else if (stringInput.charAt(i) == '*') {
                        lexic = DataType.Lexic.Operator;
                        substring += stringInput.charAt(i);
                        tokenLexic = 8;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    else if (stringInput.charAt(i) == '/') {
                        lexic = DataType.Lexic.Operator;
                        substring += stringInput.charAt(i);
                        tokenLexic = 9;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    else if (stringInput.charAt(i) == '1') {
                        lexic = DataType.Lexic.Operand3;
                        substring += stringInput.charAt(i);
                        tokenLexic = 3;
                        if (i == stringInput.length() - 1) {
                            tokenLexic = 3;
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    else if (stringInput.charAt(i) == '2') {
                        lexic = DataType.Lexic.Operand3;
                        substring += stringInput.charAt(i);
                        tokenLexic = 3;
                        if (i == stringInput.length() - 1) {
                            tokenLexic = 3;
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    else if (stringInput.charAt(i) == '(') {
                        lexic = DataType.Lexic.GroupingSymbol;
                        substring += stringInput.charAt(i);
                        tokenLexic = 4;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    else if (stringInput.charAt(i) == ')') {
                        lexic = DataType.Lexic.GroupingSymbol;
                        substring += stringInput.charAt(i);
                        tokenLexic = 5;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    else if (stringInput.charAt(i) == '+') {
                        lexic = DataType.Lexic.Operator;
                        substring += stringInput.charAt(i);
                        tokenLexic = 6;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    else if (stringInput.charAt(i) == '-') {
                        lexic = DataType.Lexic.Operator;
                        substring += stringInput.charAt(i);
                        tokenLexic = 7;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    else if (stringInput.charAt(i) == '3') {
                        lexic = DataType.Lexic.Operand3;
                        substring += stringInput.charAt(i);
                        tokenLexic = 3;
                        if (i == stringInput.length() - 1) {
                            tokenLexic = 3;
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    
                    else if (stringInput.charAt(i) == '4') {
                        lexic = DataType.Lexic.Operand3;
                        substring += stringInput.charAt(i);
                        tokenLexic = 3;
                        if (i == stringInput.length() - 1) {
                            tokenLexic = 3;
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    else if (stringInput.charAt(i) == '5') {
                        lexic = DataType.Lexic.Operand3;
                        substring += stringInput.charAt(i);
                        tokenLexic = 3;
                        if (i == stringInput.length() - 1) {
                            tokenLexic = 3;
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    else if (stringInput.charAt(i) == '6') {
                        lexic = DataType.Lexic.Operand3;
                        substring += stringInput.charAt(i);
                        tokenLexic = 3;
                        if (i == stringInput.length() - 1) {
                            tokenLexic = 3;
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    else if (stringInput.charAt(i) == '7') {
                        lexic = DataType.Lexic.Operand3;
                        substring += stringInput.charAt(i);
                        tokenLexic = 3;
                        if (i == stringInput.length() - 1) {
                            tokenLexic = 3;
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    else if (stringInput.charAt(i) == '8') {
                        lexic = DataType.Lexic.Operand3;
                        substring += stringInput.charAt(i);
                        tokenLexic = 3;
                        if (i == stringInput.length() - 1) {
                            tokenLexic = 3;
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    else if (stringInput.charAt(i) == '9') {
                        lexic = DataType.Lexic.Operand3;
                        substring += stringInput.charAt(i);
                        tokenLexic = 3;
                        if (i == stringInput.length() - 1) {
                            tokenLexic = 3;
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    else if (stringInput.charAt(i) == 'a' || stringInput.charAt(i) == 'b' || stringInput.charAt(i) == 'c' || stringInput.charAt(i) == 'd' || stringInput.charAt(i) == 'e' || stringInput.charAt(i) == 'f' || stringInput.charAt(i) == 'g' || stringInput.charAt(i) == 'h' || stringInput.charAt(i) == 'x' || stringInput.charAt(i) == 'j') {
                        lexic = DataType.Lexic.Operand1;
                        substring += stringInput.charAt(i);
                        tokenLexic = 1;
                        if (i == stringInput.length() - 1) {
                            tokenLexic = 1;
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    else {
                        lexic = DataType.Lexic.Operand2;
                        substring += stringInput.charAt(i);
                        tokenLexic = 2;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 1 :
                    if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new DataType(substring, lexic, tokenLexic));
                        lexic = DataType.Lexic.Blank;
                        substring = "";
                        tokenLexic = 0;
                    }
                    else if (stringInput.charAt(i) == 'e' || stringInput.charAt(i) == 'E') {
                        lexic = DataType.Lexic.Operand2;
                        substring += stringInput.charAt(i);
                        tokenLexic = 1;
                        if (i == stringInput.length() - 1) {
                            tokenLexic = 2;
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    else if (stringInput.charAt(i) == 'h' || stringInput.charAt(i) == 'H') {
                        lexic = DataType.Lexic.Operand1;
                        substring += stringInput.charAt(i);
                        tokenLexic = 1;
                        if (i == stringInput.length() - 1) {
                            tokenLexic = 2;
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    else if (stringInput.charAt(i) == 'i' || stringInput.charAt(i) == 'I') {
                        lexic = DataType.Lexic.Operand1;
                        substring += stringInput.charAt(i);
                        tokenLexic = 1;
                        if (i == stringInput.length() - 1) {
                            tokenLexic = 2;
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    else {
                        lexic = DataType.Lexic.Operand3;
                        substring += stringInput.charAt(i);
                        tokenLexic = 3;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 2 :
                    if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new DataType(substring, lexic, tokenLexic));
                        lexic = DataType.Lexic.Blank;
                        substring = "";
                        tokenLexic = 0;
                    }
                    else if (stringInput.charAt(i) == 'k' || stringInput.charAt(i) == 'K') {
                        lexic = DataType.Lexic.Operand1;
                        substring += stringInput.charAt(i);
                        tokenLexic = 1;
                        if (i == stringInput.length() - 1) {
                            tokenLexic = 2;
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    else {
                        lexic = DataType.Lexic.Operand3;
                        substring += stringInput.charAt(i);
                        tokenLexic = 3;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 3 :
                    if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new DataType(substring, lexic, tokenLexic));
                        lexic = DataType.Lexic.Blank;
                        substring = "";
                        tokenLexic = 0;
                    }
                    else if (stringInput.charAt(i) == 'e' || stringInput.charAt(i) == 'E') {
                        lexic = DataType.Lexic.Operand1;
                        substring += stringInput.charAt(i);
                        tokenLexic = 1;
                        if (i == stringInput.length() - 1) {
                            tokenLexic = 1;
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    else if (stringInput.charAt(i) == 'r' || stringInput.charAt(i) == 'R') {
                        lexic = DataType.Lexic.Operand1;
                        substring += stringInput.charAt(i);
                        tokenLexic = 1;
                        if (i == stringInput.length() - 1) {
                            tokenLexic = 1;
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    else if (stringInput.charAt(i) == 'o' || stringInput.charAt(i) == 'O') {
                        lexic = DataType.Lexic.Operand1;
                        substring += stringInput.charAt(i);
                        tokenLexic = 1;
                        if (i == stringInput.length() - 1) {
                            tokenLexic = 1;
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    else if (stringInput.charAt(i) == 'i' || stringInput.charAt(i) == 'I') {
                        lexic = DataType.Lexic.Operand1;
                        substring += stringInput.charAt(i);
                        tokenLexic = 1;
                        if (i == stringInput.length() - 1) {
                            tokenLexic = 1;
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    else {
                        lexic = DataType.Lexic.Operand3;
                        substring += stringInput.charAt(i);
                        tokenLexic = 3;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 4 :
                    if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new DataType(substring, lexic, tokenLexic));
                        lexic = DataType.Lexic.Blank;
                        substring = "";
                        tokenLexic = 0;
                    }
                    else if (stringInput.charAt(i) == 'c' || stringInput.charAt(i) == 'C') {
                        lexic = DataType.Lexic.Operand1;
                        substring += stringInput.charAt(i);
                        tokenLexic = 1;
                        if (i == stringInput.length() - 1) {
                            tokenLexic = 1;
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    else if (stringInput.charAt(i) == 'o' || stringInput.charAt(i) == 'O') {
                        lexic = DataType.Lexic.Operand1;
                        substring += stringInput.charAt(i);
                        tokenLexic = 1;
                        if (i == stringInput.length() - 1) {
                            tokenLexic = 20;
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    else {
                        lexic = DataType.Lexic.Operand1;
                        substring += stringInput.charAt(i);
                        tokenLexic = 20;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 5 :
                    if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new DataType(substring, lexic, tokenLexic));
                        lexic = DataType.Lexic.Blank;
                        substring = "";
                        tokenLexic = 0;
                    }
                    else if (stringInput.charAt(i) == 'o' || stringInput.charAt(i) == 'O') {
                        lexic = DataType.Lexic.Operand1;
                        substring += stringInput.charAt(i);
                        tokenLexic = 6;
                        if (i == stringInput.length() - 1) {
                            tokenLexic = 20;
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    else {
                        lexic = DataType.Lexic.Operand3;
                        substring += stringInput.charAt(i);
                        tokenLexic = 3;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 6 :
                    if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new DataType(substring, lexic, tokenLexic));
                        lexic = DataType.Lexic.Blank;
                        substring = "";
                        tokenLexic = 0;
                    }
                    else if (stringInput.charAt(i) == 'n' || stringInput.charAt(i) == 'N') {
                        lexic = DataType.Lexic.Operand1;
                        substring += stringInput.charAt(i);
                        tokenLexic = 1;
                        if (i == stringInput.length() - 1) {
                            tokenLexic = 1;
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    else if (stringInput.charAt(i) == 'i' || stringInput.charAt(i) == 'I') {
                        lexic = DataType.Lexic.Operand1;
                        substring += stringInput.charAt(i);
                        tokenLexic = 1;
                        if (i == stringInput.length() - 1) {
                            tokenLexic = 1;
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    else {
                        lexic = DataType.Lexic.Operand3;
                        substring += stringInput.charAt(i);
                        tokenLexic = 3;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 7 :
                    if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new DataType(substring, lexic, tokenLexic));
                        lexic = DataType.Lexic.Blank;
                        substring = "";
                        tokenLexic = 0;
                    }
                    else {
                        lexic = DataType.Lexic.Operand3;
                        substring += stringInput.charAt(i);
                        tokenLexic = 3;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 8 :
                    if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new DataType(substring, lexic, tokenLexic));
                        lexic = DataType.Lexic.Blank;
                        substring = "";
                        tokenLexic = 0;
                    }
                    else {
                        lexic = DataType.Lexic.Operand3;
                        substring += stringInput.charAt(i);
                        tokenLexic = 3;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 9 :
                    if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new DataType(substring, lexic, tokenLexic));
                        lexic = DataType.Lexic.Blank;
                        substring = "";
                        tokenLexic = 0;
                    }
                    else {
                        lexic = DataType.Lexic.Operand3;
                        substring += stringInput.charAt(i);
                        tokenLexic = 3;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 10 :
                    if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new DataType(substring, lexic, tokenLexic));
                        lexic = DataType.Lexic.Blank;
                        substring = "";
                        tokenLexic = 0;
                    }
                    else {
                        lexic = DataType.Lexic.Operand3;
                        substring += stringInput.charAt(i);
                        tokenLexic = 3;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 11 :
                    if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new DataType(substring, lexic, tokenLexic));
                        lexic = DataType.Lexic.Blank;
                        substring = "";
                        tokenLexic = 0;
                    }
                    else {
                        lexic = DataType.Lexic.Operand3;
                        substring += stringInput.charAt(i);
                        tokenLexic = 3;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 12 :
                    if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new DataType(substring, lexic, tokenLexic));
                        lexic = DataType.Lexic.Blank;
                        substring = "";
                        tokenLexic = 0;
                    }
                    else {
                        lexic = DataType.Lexic.Operand3;
                        substring += stringInput.charAt(i);
                        tokenLexic = 3;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 13 :
                    if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new DataType(substring, lexic, tokenLexic));
                        lexic = DataType.Lexic.Blank;
                        substring = "";
                        tokenLexic = 0;
                    }
                    else {
                        lexic = DataType.Lexic.Operand3;
                        substring += stringInput.charAt(i);
                        tokenLexic = 3;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                    
                case 14 :
                    if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new DataType(substring, lexic, tokenLexic));
                        lexic = DataType.Lexic.Blank;
                        substring = "";
                        tokenLexic = 0;
                    }
                    else {
                        lexic = DataType.Lexic.Operand3;
                        substring += stringInput.charAt(i);
                        tokenLexic = 3;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 15 :
                    if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new DataType(substring, lexic, tokenLexic));
                        lexic = DataType.Lexic.Blank;
                        substring = "";
                        tokenLexic = 0;
                    }
                    else {
                        lexic = DataType.Lexic.Operand3;
                        substring += stringInput.charAt(i);
                        tokenLexic = 3;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 16 :
                    if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new DataType(substring, lexic, tokenLexic));
                        lexic = DataType.Lexic.Blank;
                        substring = "";
                        tokenLexic = 0;
                    }
                    else {
                        lexic = DataType.Lexic.Operand3;
                        substring += stringInput.charAt(i);
                        tokenLexic = 3;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 17 :
                    if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new DataType(substring, lexic, tokenLexic));
                        lexic = DataType.Lexic.Blank;
                        substring = "";
                        tokenLexic = 0;
                    }
                    else {
                        lexic = DataType.Lexic.Operand3;
                        substring += stringInput.charAt(i);
                        tokenLexic = 3;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 18 :
                    if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new DataType(substring, lexic, tokenLexic));
                        lexic = DataType.Lexic.Blank;
                        substring = "";
                        tokenLexic = 0;
                    }
                    else if (stringInput.charAt(i) == 'a' || stringInput.charAt(i) == 'b' || stringInput.charAt(i) == 'c' || stringInput.charAt(i) == 'd' || stringInput.charAt(i) == 'e' || stringInput.charAt(i) == 'f' || stringInput.charAt(i) == 'g' || stringInput.charAt(i) == 'h' || stringInput.charAt(i) == 'x' || stringInput.charAt(i) == 'j') {
                        lexic = DataType.Lexic.Operand1;
                        substring += stringInput.charAt(i);
                        tokenLexic = 1;
                        if (i == stringInput.length() - 1) {
                            tokenLexic = 1;
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    else {
                        lexic = DataType.Lexic.Operand3;
                        substring += stringInput.charAt(i);
                        tokenLexic = 3;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 19 :
                    if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new DataType(substring, lexic, tokenLexic));
                        lexic = DataType.Lexic.Blank;
                        substring = "";
                        tokenLexic = 0;
                    }
                    else {
                        lexic = DataType.Lexic.Operand3;
                        substring += stringInput.charAt(i);
                        tokenLexic = 3;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    break;
                case 20 :
                    if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new DataType(substring, lexic, tokenLexic));
                        lexic = DataType.Lexic.Blank;
                        substring = "";
                        tokenLexic = 0;
                    }
                    else {
                        lexic = DataType.Lexic.Operand3;
                        substring += stringInput.charAt(i);
                        tokenLexic = 3;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    break;    
                case 21 :
                    if (stringInput.charAt(i) == ' ' || stringInput.charAt(i) == '\n' || stringInput.charAt(i) == '\t') {
                        substringList.add(new DataType(substring, lexic, tokenLexic));
                        lexic = DataType.Lexic.Blank;
                        substring = "";
                        tokenLexic = 0;
                    }
                    else {
                        lexic = DataType.Lexic.Operator;
                        substring += stringInput.charAt(i);
                        tokenLexic = 21;
                        if (i == stringInput.length() - 1) {
                            substringList.add(new DataType(substring, lexic, tokenLexic));
                        }
                    }
                    break;
            }
        }
        
        for (int i = 0; i < substringList.size(); i++) {
            jTable1.setValueAt(substringList.get(i).getSubstring(), i, 0);
            jTable1.setValueAt(substringList.get(i).getLexic(), i, 1);
            jTable1.setValueAt(substringList.get(i).getTokenLexic(), i, 2);
        }
    }
    
    private OutputFrame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        InputFrame input = new InputFrame();
        input.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OutputFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OutputFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OutputFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OutputFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OutputFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
