import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by mrk on 4/1/14.
 */
public class RomanNumerals {
    public String convert(int arabic) {
        String romanString = "";
        LinkedHashMap<Integer, String> conversionKey = new LinkedHashMap<Integer, String>();
        conversionKey.put(1000, "M");
        conversionKey.put(900, "CM");
        conversionKey.put(500, "D");
        conversionKey.put(400, "CD");
        conversionKey.put(100, "C");
        conversionKey.put(90, "XC");
        conversionKey.put(50, "L");
        conversionKey.put(40, "XL");
        conversionKey.put(10, "X");
        conversionKey.put(9, "IX");
        conversionKey.put(5, "V");
        conversionKey.put(4, "IV");
        conversionKey.put(1, "I");

        while (arabic > 0) {
            for (Map.Entry<Integer, String> entry : conversionKey.entrySet()) {
                int arabicKey = entry.getKey();
                String romanValue = entry.getValue();
                while (arabic >= arabicKey) {
                    romanString += romanValue;
                    arabic -= arabicKey;
                }
            }
        }

        return romanString;
    }
}
