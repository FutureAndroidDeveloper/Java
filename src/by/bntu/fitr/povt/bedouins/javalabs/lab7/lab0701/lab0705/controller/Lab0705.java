/**
 * determining the date of the next day
 * lab 0706
 * version 1.0
 * @author Klimenkov K.R.
 * @author Karaliuk A.
 * Bedyini
 * group 10701217
 * 06.11.2018
 */

package by.bntu.fitr.povt.bedouins.javalabs.lab7.lab0701.lab0705.controller;

import by.bntu.fitr.povt.bedouins.javalabs.lab7.lab0701.lab0704.view.Printer;
import by.bntu.fitr.povt.bedouins.javalabs.lab7.lab0701.lab0705.model.logic.LetterCheck;
import by.bntu.fitr.povt.bedouins.javalabs.lab7.lab0701.lab0705.util.Converter;
import by.bntu.fitr.povt.bedouins.javalabs.lab7.lab0701.lab0705.util.InputProtection;
import by.bntu.fitr.povt.bedouins.javalabs.lab7.lab0701.lab0705.util.UserInput;

public class Lab0705 {
    public static void main(String[] args) {
        Printer.print("Enter your letter for check");
        String string = UserInput.input();
        InputProtection.lengthCheck(string);
        char letter = Converter.convertToChar(string);
        InputProtection.charCheck(letter);
        String result = LetterCheck.searchForVowels(letter);
        Printer.print(result);
    }
}
