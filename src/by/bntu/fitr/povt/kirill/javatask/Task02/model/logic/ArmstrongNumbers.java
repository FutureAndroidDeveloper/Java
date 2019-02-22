package by.bntu.fitr.povt.kirill.javatask.Task02.model.logic;

/**
 * Created by Kirill on 08.11.2018.
 */
public class ArmstrongNumbers {
    public static final int HELP_NUMBER = 10;
    public static final int START_VALUE = 1;

    public static void getArmstrongNumbers(final int digitCount) {
        int minValue = START_VALUE;
        int maxValue = START_VALUE;


        for (int i = 0; i < (digitCount - START_VALUE); i ++) {
            minValue *= HELP_NUMBER;
        }


        for (int i = 0; i < digitCount; i++) {
            maxValue *= HELP_NUMBER;
        }


        maxValue -= START_VALUE;


        for (int nowValue = minValue; nowValue <= maxValue; nowValue++) {
            int sum = 0;
            int cyfra;
            int tail = nowValue;

            for (int i = 0; i < digitCount; i++) {
                cyfra = tail % HELP_NUMBER;
                sum += Math.pow(cyfra, 3);

                tail /= HELP_NUMBER;
            }

            if (sum == nowValue) {
                System.out.println(nowValue);
            }
        }

    }
}
