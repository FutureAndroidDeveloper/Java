package by.bntu.fitr.povt.bedouins.javalabs.lab10.main.model.entity;


import java.util.ArrayList;

public class ShoppingCart {
    public static final String LIST_INFO_TITLE = "List of vegetables:\n";

    private Vegetable[] vegetablesCart;

    /**
     * Default initial capacity.
     */
    private static final int DEFAULT_CAPACITY = 10;

    /**
     * Shared empty array instance used for empty instances.
     */
    private static final Vegetable[] EMPTY_ELEMENT_DATA = {};

    /**
     * Constructs an empty array with an initial capacity of ten.
     */
    public ShoppingCart() {
        vegetablesCart = new Vegetable[DEFAULT_CAPACITY];
    }

    /**
     * Constructs an empty array with the specified initial capacity.
     */
    public ShoppingCart(int initialCapacity) {
        if (initialCapacity > 0) {
            vegetablesCart = new Vegetable[initialCapacity];
        } else if (initialCapacity == 0) {
            this.vegetablesCart = EMPTY_ELEMENT_DATA;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: "+
                    initialCapacity);
        }
    }

    // copy constructor
    public ShoppingCart(ShoppingCart shoppingCart) {
        if (shoppingCart.length() > 0) {
            vegetablesCart = new Vegetable[shoppingCart.length()];

            for (int i = 0; i < shoppingCart.length(); i++) {
                vegetablesCart[i] = shoppingCart.vegetablesCart[i];
            }

        } else {
            vegetablesCart = EMPTY_ELEMENT_DATA;
        }
    }

    public void add(Vegetable vegetable) {
        if (size() < length()) {
            vegetablesCart[size()] = vegetable;
        } else {
            int newCapacity = grow();
            Vegetable[] newVegetablesCart = new Vegetable[newCapacity];

            for (int i = 0; i < size(); i++) {
                newVegetablesCart[i] = vegetablesCart[i];
            }

            newVegetablesCart[size()] = vegetable;
            vegetablesCart = newVegetablesCart;
        }
    }

    public void add(Vegetable... vegetables) {

        // System.arraycopy(vegetables, 0, vegetablesCart, 0 + freeSpace, size(vegetables));
        int freeSpace = length() - size();

        if (freeSpace < size(vegetables)) {

            for (int i = 0; i < size(vegetables); i++) {
                vegetablesCart[i + freeSpace] = vegetables[i];
            }

        } else {
            while (length() < size(vegetables) + size()) {
                grow();
            }

            Vegetable[] newVegetablesCart = new Vegetable[length()];

            for (int i = 0; i < size(); i++) {
                newVegetablesCart[i] = vegetablesCart[i];
            }

            for (int i = 0; i < size(vegetables); i++) {
                newVegetablesCart[size()] = vegetables[i];
            }

        }
    }

    public boolean remove(Object obj) {
        if (obj != null) {
            for (int index = 0; index < size(); index++)
                if (obj.equals(vegetablesCart[index])) {
                    fastRemove(index);
                    return true;
                }
        }

        return false;
    }

    public boolean remove(int index) {
        if (rangeCheck(index)) {
            fastRemove(index);
            return true;
        }

        return false;
    }

    private boolean rangeCheck(int index) {
        if (index >= size())
            return false;

        return true;
    }

    private void fastRemove(int index) {
        vegetablesCart[index] = null;

        for (; index < size() - 1; index++) {
            vegetablesCart[index] = vegetablesCart[index + 1];
        }

        vegetablesCart[size() - 1] = null;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            for (int i = 0; i < size(); i++)
                if (vegetablesCart[i] == null)
                    return i;
        } else {
            for (int i = 0; i < size(); i++)
                if (obj.equals(vegetablesCart[i]))
                    return i;
        }

        return -1;
    }

    public Object get(int index) {
        if (rangeCheck(index)) {
            return vegetablesCart[index];
        }

        return null;
    }

    private int grow() {
        return vegetablesCart.length * 3 / 2 + 1;
    }

    private int size(Vegetable[] vegetables) {
        int size = 0;

        for (Vegetable vegetable: vegetables) {
            if (vegetable != null) {
                size++;
            }
        }

        return  size;
    }

    public int size() {
        int size = 0;

        for (Vegetable vegetable: vegetablesCart) {
            if (vegetable != null) {
                size++;
            }
        }

        return size;
    }

    public Vegetable[] getVegetablesList() {
        return vegetablesCart;
    }

    public int length() {
        return vegetablesCart.length;
    }

    @Override
    public String toString() {
        StringBuilder cartInfo = new StringBuilder(LIST_INFO_TITLE);

        for (Vegetable vegetable : vegetablesCart) {
            if (vegetable != null) {
                cartInfo.append(vegetable.toString()).append("\n");
            }
        }

        return cartInfo.toString();
    }
}
