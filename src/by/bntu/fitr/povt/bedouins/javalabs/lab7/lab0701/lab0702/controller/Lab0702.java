/**
 * Determining the maximum value.
 * lab 0702
 * version 1.0
 * @author Klimenkov K.R.
 * @author Karaliuk A.
 * Bedouins
 * group 10701217
 * 06.11.2018
 */

package by.bntu.fitr.povt.bedouins.javalabs.lab7.lab0701.lab0702.controller;

import by.bntu.fitr.povt.bedouins.javalabs.lab7.lab0701.util.UserInput;
import by.bntu.fitr.povt.bedouins.javalabs.lab7.lab0701.view.Printer;
import by.bntu.fitr.povt.bedouins.javalabs.lab7.lab0701.lab0702.model.logic.DeterminationMaxNumber;

public class Lab0702 {
    public static void main(String[] args) {
        Printer.outputToConsole("Enter first number: ");
        double firstNum = UserInput.consoleInputDouble();

        Printer.outputToConsole("Enter second number: ");
        double secondNum = UserInput.consoleInputDouble();

        Printer.outputToConsole("Enter third number: ");
        double thirdNum = UserInput.consoleInputDouble();

        double maxDouble = DeterminationMaxNumber.getMax(firstNum, secondNum, thirdNum);
        Printer.outputToConsole("Max value is: ", maxDouble);
    }
}
