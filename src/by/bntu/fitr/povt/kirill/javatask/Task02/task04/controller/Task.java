package by.bntu.fitr.povt.kirill.javatask.Task02.task04.controller;

import by.bntu.fitr.povt.kirill.javatask.Task02.task04.model.MatrixHandler;
import by.bntu.fitr.povt.kirill.javatask.Task02.task04.view.Printer;

/**
 * Created by Kirill on 25.02.2019.
 */
public class Task {
    public static void main(String[] args) {
        int[][] myMatrix = {{1, 2, 1}, {-3, 2, -1}, {0, 5, 2}};
        Printer.showArray(myMatrix);

        System.out.println();

        int answer = MatrixHandler.findMinColumn(myMatrix, 4);
        Printer.printColumnByIndex(myMatrix, answer);

    }
}
