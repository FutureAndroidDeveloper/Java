import by.bntu.fitr.povt.bedouins.javalabs.lab10.main.model.entity.ShoppingCart;
import by.bntu.fitr.povt.bedouins.javalabs.lab10.main.model.entity.Vegetable;
import by.bntu.fitr.povt.bedouins.javalabs.lab10.main.model.logic.Manager;
import by.bntu.fitr.povt.kirill.javatask.Task02.task03.MyVector;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Kirill on 19.12.2018.
 */
public class MyTest {
    @Test
    public void testCorrectValues() {
        int excepted = 20;

        ShoppingCart cart = new ShoppingCart();
        cart.push(new Vegetable("Cucumber", 10));
        cart.push(new Vegetable("Cabbage", 20));
        cart.push(new Vegetable("Tomato", 30));

        double actual = Manager.calculateAvgCost(cart);

        Assert.assertSame(excepted, (int) actual);
    }

    @Test
    public void testEmptyCart() {
        int excepted = 0;
        ShoppingCart cart = new ShoppingCart();

        double actual = Manager.calculateAvgCost(cart);

        Assert.assertSame(excepted, (int) actual);
    }

    @Test
    public void testNullCart() {
        int excepted = 0;
        ShoppingCart cart = new ShoppingCart();
        cart.push(null);
        cart.push(null);

        double actual = Manager.calculateAvgCost(cart);

        Assert.assertSame(excepted, (int) actual);
    }
}
