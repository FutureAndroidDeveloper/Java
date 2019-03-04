
import by.bntu.fitr.povt.kirill.javatask.Task02.task04.model.MatrixHandler;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Kirill on 19.12.2018.
 */
public class MyTest {
    @Test
    public void testNull() {
        int[][] nullArray = null;

        int actual = MatrixHandler.findMinColumn(nullArray, 4);

        Assert.assertEquals(-1, actual);
    }

}
