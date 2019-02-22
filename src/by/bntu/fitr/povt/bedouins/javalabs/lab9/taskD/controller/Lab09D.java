package by.bntu.fitr.povt.bedouins.javalabs.lab9.taskD.controller;

import by.bntu.fitr.povt.bedouins.javalabs.lab7.lab0701.util.UserInput;
import by.bntu.fitr.povt.bedouins.javalabs.lab7.lab0701.view.Printer;
import by.bntu.fitr.povt.bedouins.javalabs.lab9.taskD.model.logic.CoinFlipper;

/**
 * Created by Kirill on 11.12.2018.
 */
public class Lab09D {
    public static final String POSITIVE_ANSWER = "Yes";
    public static final String NEGATIVE_ANSWER = "No";

    public static void main(String[] args) {
        String answer = POSITIVE_ANSWER;
        Printer.outputToConsole("*** Counting Heads and Tails ***\n");

        while (!answer.equals(NEGATIVE_ANSWER)) {
            Printer.outputToConsole("\nInput number of coin throws: ");

            int coinThrowsCount = UserInput.consoleInputInt();
            CoinFlipper.flipCoin(coinThrowsCount);

            Printer.outputToConsole("Count of Heads: ", CoinFlipper.getHeads());
            Printer.outputToConsole("Count of Tails: ", CoinFlipper.getTails());
            CoinFlipper.nullHeadsAndTails();

            Printer.outputToConsole("\nDo you want to continue running of program? (Yes or No) ");
            answer = UserInput.consoleInputWord();
        }
    }
}
