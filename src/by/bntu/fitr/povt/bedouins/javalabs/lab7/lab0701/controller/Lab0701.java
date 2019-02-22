/**
 * counting the heads and eyes of a dragon who is N years old.
 * lab 0701
 * version 1.0
 * @author Klimenkov K.R.
 * @author Karaliuk A.
 * Bedouins
 * group 10701217
 * 06.11.2018
 */

package by.bntu.fitr.povt.bedouins.javalabs.lab7.lab0701.controller;

import by.bntu.fitr.povt.bedouins.javalabs.lab7.lab0701.model.logic.CalculationPartsOfDragon;
import by.bntu.fitr.povt.bedouins.javalabs.lab7.lab0701.util.UserInput;
import by.bntu.fitr.povt.bedouins.javalabs.lab7.lab0701.view.Printer;

public class Lab0701 {
    public static void main(String[] args) {

        Printer.outputToConsole("Enter age of dragon: ");

        int age = UserInput.consoleInputPositiveInt();
        Printer.outputToConsole("Dragon age: ", age);

        int dragonHeads = CalculationPartsOfDragon.calcHeads(age);
        Printer.outputToConsole("\nNumber of heads: ", dragonHeads);

        int dragonEyes = CalculationPartsOfDragon.calcEyes(dragonHeads);
        Printer.outputToConsole("\nNumber of eyes: ", dragonEyes);

    }
}