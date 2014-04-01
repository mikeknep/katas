import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mrk on 4/1/14.
 */
public class RomanNumeralsTest {
    private RomanNumerals romanNumerals;

    @Before
    public void createRomanNumeralInstance() {
        romanNumerals = new RomanNumerals();
    }

    @Test
    public void testReturnsIForOne() {
        assertEquals("I", romanNumerals.convert(1));
    }

    @Test
    public void testReturnsIIForTwo() {
        assertEquals("II", romanNumerals.convert(2));
    }

    @Test
    public void testReturnsIIIForThree() {
        assertEquals("III", romanNumerals.convert(3));
    }

    @Test
    public void testReturnsIVForFour() {
        assertEquals("IV", romanNumerals.convert(4));
    }

    @Test
    public void testReturnsVForFive() {
        assertEquals("V", romanNumerals.convert(5));
    }

    @Test
    public void testReturnsVIForSix() {
        assertEquals("VI", romanNumerals.convert(6));
    }

    @Test
    public void testReturnsVIIIForEight() {
        assertEquals("VIII", romanNumerals.convert(8));
    }

    @Test
    public void testReturnsIXForNine() {
        assertEquals("IX", romanNumerals.convert(9));
    }

    @Test
    public void testReturnsXForTen() {
        assertEquals("X", romanNumerals.convert(10));
    }

    @Test
    public void testReturnsXIForEleven() {
        assertEquals("XI", romanNumerals.convert(11));
    }

    @Test
    public void testReturnsXXForTwenty() {
        assertEquals("XX", romanNumerals.convert(20));
    }

    @Test
    public void testReturnsXLForForty() {
        assertEquals("XL", romanNumerals.convert(40));
    }

    @Test
    public void testReturnsXLVIForFortySix() {
        assertEquals("XLVI", romanNumerals.convert(46));
    }

    @Test
    public void testReturnsXLIXForFortyNine() {
        assertEquals("XLIX", romanNumerals.convert(49));
    }

    @Test
    public void testReturnsLForFifty() {
        assertEquals("L", romanNumerals.convert(50));
    }

    @Test
    public void testReturnsXCForNinety() {
        assertEquals("XC", romanNumerals.convert(90));
    }

    @Test
    public void testReturnsCForOneHundred() {
        assertEquals("C", romanNumerals.convert(100));
    }

    @Test
    public void testReturnsCDForFourHundred() {
        assertEquals("CD", romanNumerals.convert(400));
    }

    @Test
    public void testReturnsDForFiveHundred() {
        assertEquals("D", romanNumerals.convert(500));
    }

    @Test
    public void testReturnsCMForNineHundred() {
        assertEquals("CM", romanNumerals.convert(900));
    }

    @Test
    public void testReturnsMForOneThousand() {
        assertEquals("M", romanNumerals.convert(1000));
    }

    @Test
    public void testReturnsMMCMXLIVForTwoThousandNineHundredFortyFour() {
        assertEquals("MMCMXLIV", romanNumerals.convert(2944));
    }
}
