package by.bntu.fitr.povt.bedouins.javalabs.lab9.taskE.model.logic;

import java.util.Random;

/**
 * Created by Kirill on 12.12.2018.
 */
public class MathTest {
    public static final int SATISFACTORY_PERCENT = 40;
    public static final int GOOD_PERCENT = 60;
    public static final int VERY_GOOD_PERCENT = 80;
    public static final int EXCELLENT_PERCENT = 100;

    public static final String BAD_MARK = "BAD";
    public static final String SATISFACTORY_MARK = "SATISFACTORY";
    public static final String GOOD_MARK = "GOOD";
    public static final String VERY_GOOD_MARK = "VERY GOOD";
    public static final String EXCELLENT_MARK = "EXCELLENT";

    public static final Random random = new Random();
    public static final int MAX_NUMBER_OF_TABLE = 10;
    public static final int CONVERT_TO_PERCENT = 100;

    public static int exampleAnswer;
    public static int rightAnswersCount;

    public static String generateExample() {
        int firstNumber = random.nextInt(MAX_NUMBER_OF_TABLE) + 1;
        int secondNumber = random.nextInt(MAX_NUMBER_OF_TABLE) + 1;
        exampleAnswer = firstNumber * secondNumber;

        return (Integer.toString(firstNumber) + " * " + Integer.toString(secondNumber) + " = ");
    }

    public static boolean checkUserAnswer(int answer) {
        return exampleAnswer == answer;
    }

    public static void resetRightAnswersCount() {
        rightAnswersCount = 0;
    }

    public static String getMark(double rowTableCount) {
        String mark = BAD_MARK;
        double markPercent = (rightAnswersCount / rowTableCount) * CONVERT_TO_PERCENT;

        if (markPercent == EXCELLENT_PERCENT) {
            mark = EXCELLENT_MARK;
        } else if (markPercent >= VERY_GOOD_PERCENT) {
            mark = VERY_GOOD_MARK;
        } else if (markPercent >= GOOD_PERCENT) {
            mark = GOOD_MARK;
        } else if (markPercent >= SATISFACTORY_PERCENT) {
            mark = SATISFACTORY_MARK;
        }

        return mark;
    }
}
