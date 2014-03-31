import java.util.ArrayList;
import java.util.List;

/**
 * Created by mrk on 3/31/14.
 */
public class CoinChanger {
    public List<Integer> makeChangeFor(int totalAmount) {
        int numberOfCoinsNeeded     = 0;
        int numberOfQuartersNeeded  = 0;
        int numberOfDimesNeeded     = 0;
        int numberOfNickelsNeeded   = 0;
        int numberOfPenniesNeeded   = 0;

        // Determine how many of each coin type are needed
        while (totalAmount >= 25) {
            numberOfQuartersNeeded += 1;
            totalAmount -= 25;
        }
        while (totalAmount >= 10) {
            numberOfDimesNeeded += 1;
            totalAmount -= 10;
        }
        if (totalAmount >= 5) {
            numberOfNickelsNeeded += 1;
            totalAmount -= 5;
        }
        for (int i = 0; i < totalAmount; i++) {
            numberOfPenniesNeeded += 1;
        }

        // Determine how many total coins are needed
        for (int i = 0; i < numberOfQuartersNeeded; i++) {
            numberOfCoinsNeeded += 1;
        }
        for (int i = 0; i< numberOfDimesNeeded; i++) {
            numberOfCoinsNeeded += 1;
        }
        for (int i = 0; i < numberOfNickelsNeeded; i++) {
            numberOfCoinsNeeded += 1;
        }
        for (int i = 0; i < numberOfPenniesNeeded; i++) {
            numberOfCoinsNeeded += 1;
        }

        // Create and populate final list of coins
        List<Integer> coins = new ArrayList<Integer>();
        for (int i = 0; i < numberOfQuartersNeeded; i++) {
            coins.add(25);
        }
        for (int i = 0; i < numberOfDimesNeeded; i++) {
            coins.add(10);
        }
        for (int i = 0; i < numberOfNickelsNeeded; i++) {
            coins.add(5);
        }
        for (int i = 0; i < numberOfPenniesNeeded; i++) {
            coins.add(1);
        }

        // Return the list of coins
        return coins;
    }
}