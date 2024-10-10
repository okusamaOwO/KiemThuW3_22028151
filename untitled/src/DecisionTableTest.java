import org.junit.Assert;
import org.junit.Test;

public class DecisionTableTest {

    @Test
    public void testGCDWithZeroAnd1000() {
        Assert.assertEquals(1000, GCD.gcd(0, 1000));
    }

    @Test
    public void testGCDWith500AndZero() {
        Assert.assertEquals(500, GCD.gcd(500, 0));
    }

    @Test
    public void testGCDWith1000AndNegative1000() {
        Assert.assertEquals(1000, GCD.gcd(1000, -1000));
    }

    @Test
    public void testGCDWith1000And2000() {
        Assert.assertEquals(1000, GCD.gcd(1000, 2000));
    }

    @Test
    public void testGCDWith5And5() {
        Assert.assertEquals(5, GCD.gcd(5, 5));
    }
}
