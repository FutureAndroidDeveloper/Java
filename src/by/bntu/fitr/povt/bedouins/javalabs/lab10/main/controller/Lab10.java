package by.bntu.fitr.povt.bedouins.javalabs.lab10.main.controller;

import by.bntu.fitr.povt.bedouins.javalabs.lab10.main.model.entity.ShoppingCart;
import by.bntu.fitr.povt.bedouins.javalabs.lab10.main.model.entity.Vegetable;
//import by.bntu.fitr.povt.bedouins.javalabs.lab10.main.model.logic.Manager;
import by.bntu.fitr.povt.bedouins.javalabs.lab7.lab0701.view.Printer;

/**
 * calculate the average cost of a product in your shopping cart.
 * lab 10
 * version 1.0
 * @author Klimenkov K.R.
 * @author Karaliuk A.
 * @author ∆” ќ¬— »… ƒ»ћј
 * Old bedouins and Jukovsky
 * group 10701217
 * 26.12.2018
 */

public class Lab10 {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
//        cart.push(new Vegetable("Cucumber", 10));
//        cart.push(new Vegetable("Cabbage", 20));
//        cart.push(new Vegetable("Tomato", 30));
//
//        double avgVegetablesCost = Manager.calculateAvgCost(cart);
//
//        Printer.outputToConsole(cart.toString());
//        Printer.outputToConsole("\nAvg cost of vegetables: ", avgVegetablesCost);

        System.out.println(cart.length());
        System.out.println(cart.size());
        System.out.println(cart);
        System.out.println("\n");

        String[] names = {"A", "B", "C", "D", "E", "F", "G", "H", "K", "J", "L", "M", "Z"};
        int[] coasts = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        for (int i = 0; i <= 12; i++) {
            cart.add(new Vegetable(names[i], coasts[i]));
        }

        System.out.println(cart.length());
        System.out.println(cart.size());
        System.out.println(cart);;
        System.out.println("\n");


        // затестить добавление массива овощей
        // если начальный массив пустой, добавл€ю меньше, чем Ємкость массива

        // если начальный массив пустой, добавить больше, чем Ємкость массива (доавить от 10 до 16)

        // если начальный массив пустой, добавить больше, чем Ємкость массива (доавить от 17 до ...)
        // (поверить цикл while, который увеличивает Ємкость массива)

        // если начальный массив уже имеет элементы. (например есть 8), добавить еще 10


        // проделать то же самое с объектами, созданными через конструктор с указание Ємкости
        // и передава€ 0 в Ємкость


        // проверить конструктор копировани€


        // дописать удаление элемента по индексу
        // удаление элемента по хэш-коду


        // поиск элемента
        // проверка, что такой элемент существует в массиве

//
//        ShoppingCart capacityCart = new ShoppingCart(15);
//
//        System.out.println(capacityCart.length());
//        System.out.println(capacityCart.size());
//        capacityCart.toString();
//        System.out.println("\n");
//
//
//        ShoppingCart zeroCapacityCart = new ShoppingCart(0);
//        System.out.println(zeroCapacityCart.length());
//        System.out.println(zeroCapacityCart.size());
//        zeroCapacityCart.toString();





    }
}
