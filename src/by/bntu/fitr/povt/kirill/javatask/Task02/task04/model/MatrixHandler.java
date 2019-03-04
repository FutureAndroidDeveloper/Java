package by.bntu.fitr.povt.kirill.javatask.Task02.task04.model;

import java.util.ArrayList;

/**
 * Created by Kirill on 25.02.2019.
 */
public class MatrixHandler {
    public static final int MATRIX_SIZE = 3;
    public static int[] columnNumbers = new int[MATRIX_SIZE];

    public static void findColumns(int[][] matrix, int n) {

          for (int i = 0; i < MATRIX_SIZE; i++) {

            for (int j = 0; j < MATRIX_SIZE; j++) {

                if (Math.abs(matrix[j][i]) > n) {
                    columnNumbers[i] = -1;
                    break ;
                }

                columnNumbers[i] = i;
            }
        }
    }

    public static int multiplyColumnElements(int[][] matrix, int columnIndex) {
        int multiply = 1;

        for (int i = 0; i < MATRIX_SIZE; i++) {
            multiply *= matrix[i][columnIndex];
        }

        return multiply;
    }

    public static int getCountRightColumns() {
        int count = 0;

        for (int num: columnNumbers) {
            if (num != -1) {
                count++;
            }
        }

        return count;
    }

    public static int findMin(ArrayList<Integer> list) {
        int min = 0;

        if (list == null) {
            return min;
        }

        min = list.get(0);

        for (Integer number: list) {
            if (number < min) {
                min = number;
            }
        }

        return min;
    }

    public static int findMinColumn(int[][] matrix, int n) {

        if (matrix == null) {
            return -1;
        }

        findColumns(matrix, n);
        ArrayList<Integer> listOfMultiply = new ArrayList<Integer>();

        for (int ColumnIndex = 0; ColumnIndex < columnNumbers.length; ColumnIndex++) {

            if (columnNumbers[ColumnIndex] != -1) {
                listOfMultiply.add(multiplyColumnElements(matrix, columnNumbers[ColumnIndex]));
            }
        }

        int min = findMin(listOfMultiply);
        int columnMinIndex = 0;

        for (int ColumnIndex = 0; ColumnIndex < columnNumbers.length; ColumnIndex++) {

            if (columnNumbers[ColumnIndex] != -1 && multiplyColumnElements(matrix, columnNumbers[ColumnIndex]) == min) {
                columnMinIndex =  columnNumbers[ColumnIndex];
            }
        }

        return  columnMinIndex;
    }
}
