/**
 * this program determines the date of the next day
 * lab 0704
 * version 1.0
 * @author Klimenkov K.R.
 * @author Karaliuk A.
 * Bedyini
 * group 10701217
 * 06.11.2018
 */


package by.bntu.fitr.povt.bedouins.javalabs.lab7.lab0701.lab0706.controller;

import by.bntu.fitr.povt.bedouins.javalabs.lab7.lab0701.lab0704.view.Printer;
import by.bntu.fitr.povt.bedouins.javalabs.lab7.lab0701.lab0706.model.logic.DateOfNextDay;
import by.bntu.fitr.povt.bedouins.javalabs.lab7.lab0701.lab0706.util.InputProtection;
import by.bntu.fitr.povt.bedouins.javalabs.lab7.lab0701.lab0706.util.UserInput;

public class Lab0706 {
    public static void main(String[] args) {
        Printer.print("Enter date");
        int day = UserInput.input();

        InputProtection.dayCheck(day);
        int month = UserInput.input();

        InputProtection.monthCheck(month);
        int year = UserInput.input();

        InputProtection.yearCheck(year);
        String result = DateOfNextDay.dateDetermination(day, month, year);

        Printer.print(result);
    }
}

