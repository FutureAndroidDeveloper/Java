package by.bntu.fitr.povt.bedouins.javalabs.lab7.lab0701.lab0704.model.logic;

import java.util.Random;

public class DiceSum {

    public static Random random = new Random();
    public static int minNumber = 1;
    public static int maxNumber = 6;

    public static int firstDiceRoll(){
        return minNumber + random.nextInt(maxNumber);
    }




    public static int sumOfDice(){
        return firstDiceRoll() + firstDiceRoll();
    }
}
