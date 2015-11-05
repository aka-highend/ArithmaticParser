/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import mainanalyzer.DataType;

/**
 *
 * @author fachrur_122
 */
public class OutputFile extends JFrame implements ActionListener {
    JPanel panel;
    JTable table;
    JScrollPane scrollPane;
    JButton buttonBack;
    
    public OutputFile(String stringInput) {
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
        
        this.setTitle("Teori Komputasi");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        
        // Table
        Object[][] objectData = new Object[substringList.size()][3];
        for (int i = 0; i < substringList.size(); i++) {
            objectData[i][0] = substringList.get(i).getSubstring();
            objectData[i][1] = substringList.get(i).getLexic();
            objectData[i][2] = substringList.get(i).getTokenLexic();
        }
        String[] stringTitle = new String[3];
        stringTitle[0] = "String";
        stringTitle[1] = "Besaran Lexic";
        stringTitle[2] = "Token Lexic";
        table = new JTable(objectData, stringTitle);
        table.setAutoscrolls(true);
        table.setColumnSelectionAllowed(false);
        table.setShowGrid(true);
        table.setShowHorizontalLines(true);
        table.setShowVerticalLines(true);
        table.setPreferredSize(new Dimension(800, 300));
        scrollPane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setPreferredSize(new Dimension(800, 300));
        addItem(panel, scrollPane, 0, 0, 1, 1, 500, 50, GridBagConstraints.CENTER);
        
        // Back button
        buttonBack = new JButton("Back");
        buttonBack.setPreferredSize(new Dimension(100, 25));
        buttonBack.addActionListener(this);
        addItem(panel, buttonBack, 0, 1, 1, 1, 150, 50, GridBagConstraints.CENTER);
        
        this.add(panel);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setBackground(Color.WHITE);
        this.setForeground(Color.WHITE);
        this.setResizable(false);
    }
    
    
    
    private void addItem(JPanel panel, JComponent component, int x, int y, int width, int height, int weightX, int weightY, int align) {
        GridBagConstraints gridBagConstraint = new GridBagConstraints();
        gridBagConstraint.gridx = x;
        gridBagConstraint.gridy = y;
        gridBagConstraint.gridwidth = width;
        gridBagConstraint.gridheight = height;
        gridBagConstraint.weightx = weightX;
        gridBagConstraint.weighty = weightY;
        gridBagConstraint.anchor = align;
        gridBagConstraint.fill = GridBagConstraints.NONE;
        gridBagConstraint.insets = new Insets(5, 5, 5, 5);
        panel.add(component, gridBagConstraint);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonBack) {
            new InputFrame();
            this.dispose();
        }
    }
 }

