import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by mrk on 4/1/14.
 */
public class PrimeFactorsTest {
    private PrimeFactors primeFactors;
    private ArrayList<Integer> factors;

    @Before
    public void createInstances() {
        primeFactors = new PrimeFactors();
        factors = new ArrayList<Integer>();
    }

    @Test
    public void testReturnsEmptyArrayFor1() {
        assertEquals(factors, primeFactors.getFactorsFor(1));
    }

    @Test
    public void testReturns2For2() {
        factors.add(2);
        assertEquals(factors, primeFactors.getFactorsFor(2));
    }

    @Test
    public void testReturns3For3() {
        factors.add(3);
        assertEquals(factors, primeFactors.getFactorsFor(3));
    }

    @Test
    public void testReturns2And2For4() {
        factors.add(2);
        factors.add(2);
        assertEquals(factors, primeFactors.getFactorsFor(4));
    }

    @Test
    public void testReturns5For5() {
        factors.add(5);
        assertEquals(factors, primeFactors.getFactorsFor(5));
    }

    @Test
    public void testReturns2And3For6() {
        factors.add(2);
        factors.add(3);
        assertEquals(factors, primeFactors.getFactorsFor(6));
    }

    @Test
    public void testReturns7For7() {
        factors.add(7);
        assertEquals(factors, primeFactors.getFactorsFor(7));
    }

    @Test
    public void testReturns222For8() {
        factors.add(2);
        factors.add(2);
        factors.add(2);
        assertEquals(factors, primeFactors.getFactorsFor(8));
    }

    @Test
    public void testReturns33For9() {
        factors.add(3);
        factors.add(3);
        assertEquals(factors, primeFactors.getFactorsFor(9));
    }

    @Test
    public void testReturns25For10() {
        factors.add(2);
        factors.add(5);
        assertEquals(factors, primeFactors.getFactorsFor(10));
    }

    @Test
    public void testReturnsFactorsForLargeNumber() {
        factors.add(2);
        factors.add(2);
        factors.add(2);
        factors.add(7);
        factors.add(7);
        factors.add(7);
        factors.add(17);
        factors.add(17);
        factors.add(19);
        int bigNum = 2*2*2*7*7*7*17*17*19;
        assertEquals(factors, primeFactors.getFactorsFor(bigNum));
    }
}
