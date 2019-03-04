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
 * @author ��������� ����
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


        // ��������� ���������� ������� ������
        // ���� ��������� ������ ������, �������� ������, ��� ������� �������

        // ���� ��������� ������ ������, �������� ������, ��� ������� ������� (������� �� 10 �� 16)

        // ���� ��������� ������ ������, �������� ������, ��� ������� ������� (������� �� 17 �� ...)
        // (�������� ���� while, ������� ����������� ������� �������)

        // ���� ��������� ������ ��� ����� ��������. (�������� ���� 8), �������� ��� 10


        // ��������� �� �� ����� � ���������, ���������� ����� ����������� � �������� �������
        // � ��������� 0 � �������


        // ��������� ����������� �����������


        // �������� �������� �������� �� �������
        // �������� �������� �� ���-����


        // ����� ��������
        // ��������, ��� ����� ������� ���������� � �������

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
