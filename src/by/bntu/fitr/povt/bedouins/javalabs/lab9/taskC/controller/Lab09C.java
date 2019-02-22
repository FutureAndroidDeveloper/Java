package by.bntu.fitr.povt.bedouins.javalabs.lab9.taskC.controller;

import by.bntu.fitr.povt.bedouins.javalabs.lab7.lab0701.util.UserInput;
import by.bntu.fitr.povt.bedouins.javalabs.lab7.lab0701.view.Printer;
import by.bntu.fitr.povt.bedouins.javalabs.lab9.taskC.model.logic.HappyTicketsCalculator;

/**
 * Created by Kirill on 11.12.2018.
 */
public class Lab09C {
    public static final String POSITIVE_ANSWER = "Yes";
    public static final String NEGATIVE_ANSWER = "No";

    public static void main(String[] args) {
        String answer = POSITIVE_ANSWER;
        Printer.outputToConsole("*** Counting Happy Tickets ***\n");

        while (!answer.equals(NEGATIVE_ANSWER)) {
            Printer.outputToConsole("\nInput count of digit in bus ticket number: ");

            int digitCount = UserInput.consoleInputInt();
            int happyTicketsCount = HappyTicketsCalculator.countHappyTickets(digitCount);

            Printer.outputToConsole("Count of happy tickets: ", happyTicketsCount);

            Printer.outputToConsole("\nDo you want to continue running of program? (Yes or No) ");
            answer = UserInput.consoleInputWord();
        }
    }
}
