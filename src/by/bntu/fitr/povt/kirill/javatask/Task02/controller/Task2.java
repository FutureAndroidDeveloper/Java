package by.bntu.fitr.povt.kirill.javatask.Task02.controller;

import by.bntu.fitr.povt.kirill.javatask.Task02.model.logic.ArmstrongNumbers;
import by.bntu.fitr.povt.bedouins.javalabs.lab7.lab0701.util.UserInput;
import by.bntu.fitr.povt.bedouins.javalabs.lab7.lab0701.view.Printer;

/**
 * Created by Kirill on 08.11.2018.
 */
public class Task2 {
    public static void main(String[] args) {
        Printer.outputToConsole("***Armstrong Numbers***");
        Printer.outputToConsole("\nInput count of digit: "); //  343  + 125 + 27

        int digitCount = UserInput.consoleInputInt();

        ArmstrongNumbers.getArmstrongNumbers(digitCount);

        //Armstrong
    }
}
