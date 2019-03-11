package by.bntu.fitr.povt.bedouins.javalabs.lab10.main.model.entity;

/**
 * Created by Kirill on 26.12.2018.
 */
public class Vegetable {
    public static final String DEFAULT_NAME = "indefinitely";
    public static final int DEFAULT_COST = 1;
    public static final char CURRENCY_ICON = '$';

    public static int vegetableAmount;

    private String name;
    private int cost;

    static {
        vegetableAmount = 0;
    }

    {
        vegetableAmount++;
    }

    // default constructor
    public Vegetable() {
        this.name = DEFAULT_NAME;
        this.cost = DEFAULT_COST;
    }

    // constructor with params
    public Vegetable(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    // copy constructor
    public Vegetable(Vegetable vegetable) {
        name = vegetable.name;
        cost = vegetable.cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        if (cost > 0) {
            this.cost = cost;
        }
    }

    @Override
    public String toString() {
        return String.format("Name: %10s\tcoast: %d%c", name, cost, CURRENCY_ICON);
    }

    @Override
    public int hashCode() {
        int hash = 3;

        hash = 53 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 53 * hash + this.cost;

        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            System.out.println(obj.getClass().getSimpleName());
            System.out.println(this.getClass().getSimpleName());
            return false;
        }

        Vegetable vegetable = (Vegetable) obj;
        return cost == vegetable.cost && (name == vegetable.name ||
                (name != null && name.equals(vegetable.getName())));

    }
}
