import java.util.*;

/**
 * Created by mrk on 3/31/14.
 */
public class CoinChanger {
    public List<Integer> makeChangeFor(int totalAmount) {
        int[] usdCoins = {25, 10, 5, 1};
        LinkedHashMap<Integer, Integer> amountsOfCoins  = new LinkedHashMap<Integer, Integer>();
        List<Integer> coins = new ArrayList<Integer>();

        for (int thisCoin : usdCoins) {
            Integer numberOfThisCoin = 0;
            while (totalAmount >= thisCoin) {
                numberOfThisCoin += 1;
                totalAmount -= thisCoin;
            }
            amountsOfCoins.put(thisCoin, numberOfThisCoin);
        }

        for (Map.Entry<Integer, Integer> entry : amountsOfCoins.entrySet()) {
            Integer thisCoin = entry.getKey();
            Integer numberOfThisCoin = entry.getValue();
            for (int i = 0; i < numberOfThisCoin; i++) {
                coins.add(thisCoin);
            }
        }

        return coins;
    }
}