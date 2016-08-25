package main.java.romannumerals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Mircea
 */
public class RomanNumeralsConversion {
    StringBuffer result;
    final HashMap romanMap = new HashMap<String, Integer>() {{
        put("I", 1);
        put("IV", 4);
        put("V", 5);
        put("IX", 9);
        put("X", 10);
        put("XL", 40);
        put("L", 50);
        put("XC", 90);
        put("C", 100);
        put("D", 500);
        put("M", 1000);
    }};
    final HashMap integerMap = new HashMap<Integer, String>() {{
        put(1, "I");
        put(4, "IV");
        put(5, "V");
        put(9, "IX");
        put(10, "X");
        put(40, "XL");
        put(50, "L");
        put(90, "XC");
        put(100, "C");
        put(500, "D");
        put(1000, "M");
    }};
    List<Integer> vals = Arrays.asList(1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000);
    private final List<String> SYMBOLS = Arrays.asList("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I");

    public static void main(String[] args) {
    }

    public String convertToRoman(int inputNumber) {
        result = new StringBuffer();
        for (int i = vals.size() - 1; i >= 0; i--) {
            final int currentMaxTranslation = vals.get(i);
            while (inputNumber >= currentMaxTranslation) {
                result.append(integerMap.get(currentMaxTranslation));
                inputNumber -= currentMaxTranslation;
            }
        }
        return result.toString();

    }

    /**
     * Initial version
     * @param inputNumber
     * @return
     */
    public String convertToRomanNaiveSolution(int inputNumber) {
        result = new StringBuffer();
        while (inputNumber >= 1000) {
            result.append(integerMap.get(1000));
            inputNumber -= 1000;
        }
        if (inputNumber == 900) {
            result.append(integerMap.get(900));
            inputNumber -= 900;
        }
        while (inputNumber >= 500) {
            result.append(integerMap.get(500));
            inputNumber -= 500;
        }
        if (inputNumber == 400) {
            result.append(integerMap.get(400));
            inputNumber -= 400;
        }
        while (inputNumber >= 100) {
            result.append(integerMap.get(100));
            inputNumber -= 100;

        }
        if (inputNumber >= 90) {
            result.append(integerMap.get(90));
            inputNumber -= 90;
        }
        if (inputNumber >= 50) {
            result.append(integerMap.get(50));
            inputNumber -= 50;
        }
        if (inputNumber >= 40) {
            result.append(integerMap.get(40));
            inputNumber -= 40;
        }
        while (inputNumber >= 10) {
            result.append(integerMap.get(10));
            inputNumber -= 10;
        }
        if (inputNumber == 9) {
            result.append(integerMap.get(9));
            inputNumber -= 9;
        }

        if (inputNumber >= 5) {
            result.append(integerMap.get(5));
            inputNumber -= 5;

        }
        if (inputNumber == 4) {
            result.append(integerMap.get(4));
            inputNumber -= 4;
        }
        while (inputNumber > 0) {
            result.append("I");
            inputNumber -= 1;
        }
        return result.toString();
    }

    public int convertToArabic(String inputNumber) {
        int number = 0;
        int i = 0;
        while (i < inputNumber.length()) {
            if (i + 1 < inputNumber.length()) {
                if (isGreaterThanNext(inputNumber, i)) {
                    number += (int) romanMap.get(String.valueOf(inputNumber.charAt(i)));
                    i++;
                } else {
                    number += (int) romanMap.get(inputNumber.substring(i, i + 2));
                    i += 2;
                }

            } else {
                number += (int) romanMap.get(String.valueOf(inputNumber.charAt(i)));
                i++;
            }
        }
        return number;
    }

    private boolean isGreaterThanNext(String inputNumber, int i) {
        return (int) romanMap.get(String.valueOf(inputNumber.charAt(i))) >= (int) romanMap.get(String.valueOf(inputNumber.charAt(i + 1)));
    }
}
