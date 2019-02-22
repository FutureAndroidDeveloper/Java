package by.bntu.fitr.povt.bedouins.javalabs.lab7.lab0701.util;

import java.util.Scanner;

public class UserInput {
    private static Scanner scanner = new Scanner(System.in);
    public static final String NOT_A_NUMBER_MSG = "\nThat not a number! Try again: ";
    public static final String NOT_POSITIVE_MSG = "\nNumber is not positive! Try again: ";

    public static int consoleInputPositiveInt() {
        int number = consoleInputInt();

        while (!Security.isPositiveInt(number)) {
            System.out.print(NOT_POSITIVE_MSG);
            number = consoleInputInt();
        }

        return number;
    }


    public static int consoleInputInt() {
        while (!scanner.hasNextInt()) {
            System.out.print(NOT_A_NUMBER_MSG);
            scanner.next();
        }

        return scanner.nextInt();
    }


    public static double consoleInputDouble() {
        while (!scanner.hasNextDouble()) {
            System.out.print(NOT_A_NUMBER_MSG);
            scanner.next();
        }

        return scanner.nextDouble();
    }


    public static String consoleInputWord() {
        return scanner.next();
    }
}
