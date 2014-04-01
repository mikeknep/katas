import java.util.ArrayList;

import static java.lang.Math.sqrt;

/**
 * Created by mrk on 4/1/14.
 */
public class PrimeFactors {
    public ArrayList<Integer> getFactorsFor (int value) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        int divisor = 2;

        while (divisor <= sqrt(value)) {
            while (value % divisor == 0) {
                factors.add(divisor);
                value /= divisor;
            }
            divisor += 1;
        }

        if (value != 1) {
            factors.add(value);
        }

        return factors;
    }
}
