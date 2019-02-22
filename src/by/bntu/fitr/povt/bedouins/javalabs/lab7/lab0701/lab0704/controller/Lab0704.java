/**
 * checking simulates dice
 * lab 0706
 * version 1.0
 * @author Klimenkov K.R.
 * @author Karaliuk A.
 * Bedyini
 * group 10701217
 * 06.11.2018
 */


package by.bntu.fitr.povt.bedouins.javalabs.lab7.lab0701.lab0704.controller;

import by.bntu.fitr.povt.bedouins.javalabs.lab7.lab0701.lab0704.model.logic.DiceSum;
import by.bntu.fitr.povt.bedouins.javalabs.lab7.lab0701.lab0704.view.Printer;

public class Lab0704 {
    public static void main(String[] args) {
        Printer.print("The result of the sum of two dice " + DiceSum.sumOfDice());
    }
}
