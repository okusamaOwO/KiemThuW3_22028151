import org.junit.Assert;
import org.junit.Test;

public class BoundaryTest {

    @Test
    public void testGCDWith1000AndNegative1000() {
        Assert.assertEquals(1000, GCD.gcd(1000, -1000));
    }

    @Test
    public void testGCDWith1000AndNegative999() {
        Assert.assertEquals(1, GCD.gcd(1000, -999));

    }

    @Test
    public void testGCDWith1000And1000() {
        Assert.assertEquals(1000, GCD.gcd(1000, 1000));
    }

    @Test
    public void testGCDWith1000And2999() {
        Assert.assertEquals(1, GCD.gcd(1000, 2999));
    }

    @Test
    public void testGCDWith1000And3000() {
        Assert.assertEquals(1000, GCD.gcd(1000, 3000));
    }

    @Test
    public void testGCDWithNegative1000And1000() {
        Assert.assertEquals(1000, GCD.gcd(-1000, 1000));
    }

    @Test
    public void testGCDWithNegative999And1000() {
        Assert.assertEquals(1, GCD.gcd(-999, 1000));
    }

    @Test
    public void testGCDWith2999And1000() {
        Assert.assertEquals(1, GCD.gcd(2999, 1000));
    }

    @Test
    public void testGCDWith3000And1000() {
        Assert.assertEquals(1000, GCD.gcd(3000, 1000));
    }
}
