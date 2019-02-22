package by.bntu.fitr.povt.bedouins.javalabs.lab7.lab0701.lab0702.model.logic;

public class DeterminationMaxNumber {
    public static double getMax(double a, double b, double c) {
        double maxValue = c;

        if (a >= b && a >= c)  {
            maxValue = a;
        } else if (b >= c) {
            maxValue = b;
        }

        return maxValue;
    }
}
