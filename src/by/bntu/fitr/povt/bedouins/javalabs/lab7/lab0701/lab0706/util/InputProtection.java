package by.bntu.fitr.povt.bedouins.javalabs.lab7.lab0701.lab0706.util;

import by.bntu.fitr.povt.bedouins.javalabs.lab7.lab0701.lab0704.view.Printer;

public class InputProtection {

    public static void monthCheck(int month) {
        if(month < 1 || month > 12) {
            Printer.print("Enter the correct value");
            System.exit(0);
        }
    }


    public static void dayCheck(int day) {
        if(day < 1 || day > 31) {
            Printer.print("Enter the correct value");
            System.exit(0);
        }
    }

    public static void yearCheck(int year) {
        if(year < 1) {
            Printer.print("Enter the correct value");
            System.exit(0);
        }
    }
}

