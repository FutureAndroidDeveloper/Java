package by.bntu.fitr.povt.kirill.javatask.Task02.task04.view;

/**
 * Created by Kirill on 25.02.2019.
 */
public class Printer {
    public static void showArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }

            System.out.println();
        }
    }

    public static void printColumnByIndex(int[][] array, int index) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][index]);
            }
    }
}
