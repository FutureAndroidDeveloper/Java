package by.bntu.fitr.povt.bedouins.javalabs.lab7.lab0701.lab0705.model.logic;

public class LetterCheck {
    public static String searchForVowels(char letter) {

        String result = "Your letter is consonant";


        switch (letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                result = "your letter is a vowel";
        }
        return result;
    }
}

