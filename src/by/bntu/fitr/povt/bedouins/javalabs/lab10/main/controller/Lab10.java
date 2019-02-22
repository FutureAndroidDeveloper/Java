package by.bntu.fitr.povt.bedouins.javalabs.lab10.main.controller;

import by.bntu.fitr.povt.bedouins.javalabs.lab10.main.model.entity.ShoppingCart;
import by.bntu.fitr.povt.bedouins.javalabs.lab10.main.model.entity.Vegetable;
import by.bntu.fitr.povt.bedouins.javalabs.lab10.main.model.logic.Manager;
import by.bntu.fitr.povt.bedouins.javalabs.lab7.lab0701.view.Printer;

/**
 * calculate the average cost of a product in your shopping cart.
 * lab 10
 * version 1.0
 * @author Klimenkov K.R.
 * @author Karaliuk A.
 * @author ∆” Œ¬— »… ƒ»Ã¿
 * Old bedouins and Jukovsky
 * group 10701217
 * 26.12.2018
 */

public class Lab10 {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.push(new Vegetable("Cucumber", 10));
        cart.push(new Vegetable("Cabbage", 20));
        cart.push(new Vegetable("Tomato", 30));

        double avgVegetablesCost = Manager.calculateAvgCost(cart);

        Printer.outputToConsole(cart.toString());
        Printer.outputToConsole("\nAvg cost of vegetables: ", avgVegetablesCost);
    }
}
