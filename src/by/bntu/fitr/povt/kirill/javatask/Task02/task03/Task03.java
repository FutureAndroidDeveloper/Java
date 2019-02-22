package by.bntu.fitr.povt.kirill.javatask.Task02.task03;

/**
 * Created by Kirill on 19.12.2018.
 */
public class Task03 {
    public static int[] myVector;

    public static int getSumOfPositiveElements(int[] vector) {
        int sum = 0;

        for (int item : vector) {
            if (item > 0) {
                sum += item;
            }
        }

        return sum;
    }
}
