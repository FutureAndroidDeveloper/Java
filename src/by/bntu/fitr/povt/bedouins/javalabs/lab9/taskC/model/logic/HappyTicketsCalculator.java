package by.bntu.fitr.povt.bedouins.javalabs.lab9.taskC.model.logic;

/**
 * Created by Kirill on 11.12.2018.
 */
public class HappyTicketsCalculator {
    public static final int EXCEPTION_LENGTH_CODE = 0;
    public static final int MAX_DIGIT_COUNT = 8;
    public static final int BASE = 10;
    public static final int HALF = 2;

    public static int countHappyTickets(int length) {
        if (length <= 0 || length > MAX_DIGIT_COUNT) {
            return EXCEPTION_LENGTH_CODE;
        }

        int count = 0;
        int minNumber = (int) Math.pow(BASE, length - 1);
        int maxNumber = (int) Math.pow(BASE, length) - 1;

        for (int currentNumber = minNumber; currentNumber <= maxNumber; currentNumber++) {
            int sumOfFirstPart = getSumOfNumbers(getFirstPartOfNumber(currentNumber));
            int sumOfLastPart = getSumOfNumbers(getLastPartOfNumber(currentNumber));

            if (sumOfFirstPart == sumOfLastPart) {
                count++;
                System.out.println(currentNumber);
            }
        }

        return count;
    }

    private static int getFirstPartOfNumber(int number) {
        double len = getLengthOfNumber(number);

        return (int) (number / Math.pow(BASE, Math.round(len / HALF)));
    }

    private static int getLastPartOfNumber(int number) {
        int len = getLengthOfNumber(number);

        return (int) (number % Math.pow(BASE, len / HALF));
    }

    private static int getLengthOfNumber(int number) {
        int length = 0;

        while (number != 0) {
            number /= BASE;
            length++;
        }

        return length;
    }

    private static int getSumOfNumbers(int number) {
        int sum = 0;

        while (number != 0) {
            sum += number % BASE;
            number /= BASE;
        }

        return sum;
    }
}
