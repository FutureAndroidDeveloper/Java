package by.bntu.fitr.povt.bedouins.javalabs.lab9.taskE.controller;

import by.bntu.fitr.povt.bedouins.javalabs.lab7.lab0701.util.UserInput;
import by.bntu.fitr.povt.bedouins.javalabs.lab7.lab0701.view.Printer;
import by.bntu.fitr.povt.bedouins.javalabs.lab9.taskE.model.logic.MathTest;

/**
 * Created by Kirill on 12.12.2018.
 */
public class Lab09E {
    public static final String POSITIVE_ANSWER = "Yes";
    public static final String NEGATIVE_ANSWER = "No";

    public static void main(String[] args) {
        String answer = POSITIVE_ANSWER;

        Printer.outputToConsole("*** Checking the knowledge of the multiplication table ***\n");
        Printer.outputToConsole("Input the answer after the example and press <Enter>.\n");

        while (!answer.equals(NEGATIVE_ANSWER)) {
            Printer.outputToConsole("\nInput number of rows in the table: ");
            int rowTableCount = UserInput.consoleInputPositiveInt();

            for (int tableRow = 0; tableRow < rowTableCount; tableRow++ ) {
                Printer.outputToConsole(MathTest.generateExample());

                if (MathTest.checkUserAnswer(UserInput.consoleInputInt())) {
                    MathTest.rightAnswersCount++;
                } else {
                    Printer.outputToConsole("You made a mistake! Right answer: ", MathTest.exampleAnswer);
                }
            }

            Printer.outputToConsole("Right answers: ", MathTest.rightAnswersCount);
            Printer.outputToConsole(MathTest.getMark(rowTableCount));
            MathTest.resetRightAnswersCount();

            Printer.outputToConsole("\nDo you want to continue running of program? (Yes or No) ");
            answer = UserInput.consoleInputWord();
        }
    }
}
