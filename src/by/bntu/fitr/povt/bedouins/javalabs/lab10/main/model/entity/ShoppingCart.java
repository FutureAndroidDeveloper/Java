package by.bntu.fitr.povt.bedouins.javalabs.lab10.main.model.entity;

import java.util.ArrayList;

public class ShoppingCart {
    public static final String LIST_INFO_TITLE = "List of vegetables:\n";

    private ArrayList<Vegetable> vegetablesList;        // массив
    // capacity

    // default constructor
    public ShoppingCart() {
        vegetablesList = new ArrayList<Vegetable>();
    }

    // конструктор с параметрами

    // !!! copy constructor
    public ShoppingCart(ShoppingCart shoppingCart) {
        this.vegetablesList = shoppingCart.getVegetablesList();
    }

    public void add(Vegetable vegetable) {
        vegetablesList.add(vegetable);
    }

    // ƒобавление нескольких элементов

    public void delete(Vegetable vegetable) {
        if (vegetablesList.contains(vegetable)) {
            vegetablesList.remove(vegetable);
        }
    }

    public int size() {
        return vegetablesList.size();
    }

    public ArrayList<Vegetable> getVegetablesList() {
        return vegetablesList;
    }

    @Override
    public String toString() {                      // String
        StringBuffer cartInfo = new StringBuffer(LIST_INFO_TITLE);

        for (Vegetable vegetable : vegetablesList) {
            cartInfo.append(vegetable).append("\n");
        }

        return cartInfo.toString();
    }

    // перебор
}
