package by.bntu.fitr.povt.bedouins.javalabs.lab7.lab0701.lab0705.util;

import by.bntu.fitr.povt.bedouins.javalabs.lab7.lab0701.lab0704.view.Printer;

public class InputProtection {
    public static void charCheck(char letter) {
        if((letter < 65 || letter > 90) && (letter < 97 || letter > 122)){
            Printer.print("Enter the correct value");
            System.exit(0);
        }
    }

    public static void lengthCheck(String string){
        if(string.length() > 1){
            Printer.print("Enter the correct value");
            System.exit(0);
        }
    }
}
