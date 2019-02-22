package by.bntu.fitr.povt.bedouins.javalabs.lab9.taskD.model.logic;

import java.util.Random;

/**
 * Created by Kirill on 11.12.2018.
 */
public class CoinFlipper {
    private static final Random random = new Random();
    private static int heads;
    private static int tails;
    public static final int EXCEPTION_COUNT = 0;

    public static void flipCoin(int count) {
        if (count <= EXCEPTION_COUNT) {
            count = EXCEPTION_COUNT;
        }
        
//        if (count <= EXCEPTION_COUNT) {
//            return;
//        }

        for (int flipNumber = 0; flipNumber < count; flipNumber++) {
            if (random.nextBoolean()) {
                heads++;
            }
        }

        tails = count - heads;
    }

    public static int getHeads() {
        return heads;
    }

    public static int getTails() {
        return tails;
    }

    public static void nullHeadsAndTails() {
        heads = 0;
        tails = 0;
    }
}
