import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by mrk on 3/31/14.
 */
public class CoinChangerTest {
    @Test
    public void testReturnsOnePenny() {
        CoinChanger coinChanger = new CoinChanger();
        List<Integer> coins = new ArrayList<Integer>();
        coins.add(1);
        assertEquals(coins, coinChanger.makeChangeFor(1));
    }

    @Test
    public void testReturnsTwoPennies() {
        CoinChanger coinChanger = new CoinChanger();
        List<Integer> coins = new ArrayList<Integer>();
        coins.add(1);
        coins.add(1);
        assertEquals(coins, coinChanger.makeChangeFor(2));
    }

    @Test
    public void testReturnsThreePennies() {
        CoinChanger coinChanger = new CoinChanger();
        List<Integer> coins = new ArrayList<Integer>();
        coins.add(1);
        coins.add(1);
        coins.add(1);
        assertEquals(coins, coinChanger.makeChangeFor(3));
    }

    @Test
    public void testReturnsFourPennies() {
        CoinChanger coinChanger = new CoinChanger();
        List<Integer> coins = new ArrayList<Integer>();
        coins.add(1);
        coins.add(1);
        coins.add(1);
        coins.add(1);
        assertEquals(coins, coinChanger.makeChangeFor(4));
    }

    @Test
    public void testReturnsOneNickel() {
        CoinChanger coinChanger = new CoinChanger();
        List<Integer> coins = new ArrayList<Integer>();
        coins.add(5);
        assertEquals(coins, coinChanger.makeChangeFor(5));
    }

    @Test
    public void testReturnsOneNickelAndOnePenny() {
        CoinChanger coinChanger = new CoinChanger();
        List<Integer> coins = new ArrayList<Integer>();
        coins.add(5);
        coins.add(1);
        assertEquals(coins, coinChanger.makeChangeFor(6));
    }

    @Test
    public void testReturnsOneNickelAndFourPennies() {
        CoinChanger coinChanger = new CoinChanger();
        List<Integer> coins = new ArrayList<Integer>();
        coins.add(5);
        coins.add(1);
        coins.add(1);
        coins.add(1);
        coins.add(1);
        assertEquals(coins, coinChanger.makeChangeFor(9));
    }

    @Test
    public void testReturnsOneDime() {
        CoinChanger coinChanger = new CoinChanger();
        List<Integer> coins = new ArrayList<Integer>();
        coins.add(10);
        assertEquals(coins, coinChanger.makeChangeFor(10));
    }

    @Test
    public void testReturnsOneDimeOneNickelTwoPennies() {
        CoinChanger coinChanger = new CoinChanger();
        List<Integer> coins = new ArrayList<Integer>();
        coins.add(10);
        coins.add(5);
        coins.add(1);
        coins.add(1);
        assertEquals(coins, coinChanger.makeChangeFor(17));
    }

    @Test
    public void testReturnsTwoDimes() {
        CoinChanger coinChanger = new CoinChanger();
        List<Integer> coins = new ArrayList<Integer>();
        coins.add(10);
        coins.add(10);
        assertEquals(coins, coinChanger.makeChangeFor(20));
    }

    @Test
    public void testReturnsOneQuarter() {
        CoinChanger coinChanger = new CoinChanger();
        List<Integer> coins = new ArrayList<Integer>();
        coins.add(25);
        assertEquals(coins, coinChanger.makeChangeFor(25));
    }

    @Test
    public void testReturnsTwoQuartersOneDimeOneNickelTwoPennies() {
        CoinChanger coinChanger = new CoinChanger();
        List<Integer> coins = new ArrayList<Integer>();
        coins.add(25);
        coins.add(25);
        coins.add(10);
        coins.add(5);
        coins.add(1);
        coins.add(1);
        assertEquals(coins, coinChanger.makeChangeFor(67));
    }
}
