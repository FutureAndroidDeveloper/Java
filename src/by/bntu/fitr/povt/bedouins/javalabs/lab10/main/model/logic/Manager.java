package by.bntu.fitr.povt.bedouins.javalabs.lab10.main.model.logic;

import by.bntu.fitr.povt.bedouins.javalabs.lab10.main.model.entity.ShoppingCart;
import by.bntu.fitr.povt.bedouins.javalabs.lab10.main.model.entity.Vegetable;

/**
 * Created by Kirill on 26.12.2018.
 */
public class Manager {
    public static double calculateAvgCost(ShoppingCart cart) {
        int total = 0;
        int avg = 0;

        for (Vegetable vegetable : cart.getVegetablesList()) {
            if (vegetable != null) {
                total += vegetable.getCost();
            }
        }

        if (cart.size() != 0 ) {
            avg = total / cart.size();
        }

        return avg;
    }

    public static double getTotalSum(ShoppingCart cart) {
        double sum = 0;

        for (Vegetable vegetable: cart.getVegetablesList()) {
            if (vegetable != null) {
                sum += vegetable.getCost();
            }
        }

        return sum;
    }

    public static void sortByCost(ShoppingCart cart) {

        int distance = cart.size();
        Vegetable[] list = cart.getVegetablesList();
        distance = distance / 2;

        while (distance > 0) {
            for (int i = 0; i < cart.size() - distance; i++) {

                for (int j = i; j >= 0 && list[j].getCost() > list[j + distance].getCost(); j--){
                    Vegetable tmp = list[j];
                    list[j] = list[j + distance];
                    list[j + distance] = tmp;
                }
            }

            distance = distance / 2;
        }
    }
}
