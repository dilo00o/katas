package romannumerals;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Mircea
 */
public class RomanNumeralsConversionTest {
    RomanNumeralsConversion romanNumeralsConversion;

    @Before
    public void setUp() {
        romanNumeralsConversion = new RomanNumeralsConversion();
    }

    @Test
    public void test0to3RomanConversion() {
        assertEquals("", romanNumeralsConversion.convertToRoman(0));
        assertEquals("I", romanNumeralsConversion.convertToRoman(1));
        assertEquals("II", romanNumeralsConversion.convertToRoman(2));
        assertEquals("III", romanNumeralsConversion.convertToRoman(3));
    }

    @Test
    public void test4To8RomanConversion() {
        assertEquals("IV", romanNumeralsConversion.convertToRoman(4));
        assertEquals("V", romanNumeralsConversion.convertToRoman(5));
        assertEquals("VI", romanNumeralsConversion.convertToRoman(6));
        assertEquals("VII", romanNumeralsConversion.convertToRoman(7));
        assertEquals("VIII", romanNumeralsConversion.convertToRoman(8));
    }

    @Test
    public void test9To14RomanConversion() {
        assertEquals("IX", romanNumeralsConversion.convertToRoman(9));
        assertEquals("X", romanNumeralsConversion.convertToRoman(10));
        assertEquals("XI", romanNumeralsConversion.convertToRoman(11));
        assertEquals("XII", romanNumeralsConversion.convertToRoman(12));
        assertEquals("XIII", romanNumeralsConversion.convertToRoman(13));
        assertEquals("XIV", romanNumeralsConversion.convertToRoman(14));
    }

    @Test
    public void test21To30ToRomanConversion() {
        assertEquals("XXI", romanNumeralsConversion.convertToRoman(21));
        assertEquals("XXII", romanNumeralsConversion.convertToRoman(22));
        assertEquals("XXIII", romanNumeralsConversion.convertToRoman(23));
        assertEquals("XXIV", romanNumeralsConversion.convertToRoman(24));
        assertEquals("XXV", romanNumeralsConversion.convertToRoman(25));
        assertEquals("XXVI", romanNumeralsConversion.convertToRoman(26));
        assertEquals("XXVII", romanNumeralsConversion.convertToRoman(27));
        assertEquals("XXVIII", romanNumeralsConversion.convertToRoman(28));
        assertEquals("XXIX", romanNumeralsConversion.convertToRoman(29));
        assertEquals("XXX", romanNumeralsConversion.convertToRoman(30));
    }

    @SuppressWarnings("SpellCheckingInspection")
    @Test
    public void test40To49ToRomanConversion() {
        assertEquals("XL", romanNumeralsConversion.convertToRoman(40));
        assertEquals("XLI", romanNumeralsConversion.convertToRoman(41));
        assertEquals("XLII", romanNumeralsConversion.convertToRoman(42));
        assertEquals("XLIII", romanNumeralsConversion.convertToRoman(43));
        assertEquals("XLIV", romanNumeralsConversion.convertToRoman(44));
        assertEquals("XLV", romanNumeralsConversion.convertToRoman(45));
        assertEquals("XLVI", romanNumeralsConversion.convertToRoman(46));
        assertEquals("XLVII", romanNumeralsConversion.convertToRoman(47));
        assertEquals("XLVIII", romanNumeralsConversion.convertToRoman(48));
        assertEquals("XLIX", romanNumeralsConversion.convertToRoman(49));

    }

    @Test
    public void test50To99ToRomanConversion() {
        assertEquals("L", romanNumeralsConversion.convertToRoman(50));
        assertEquals("LI", romanNumeralsConversion.convertToRoman(51));
        assertEquals("LII", romanNumeralsConversion.convertToRoman(52));
        assertEquals("LIII", romanNumeralsConversion.convertToRoman(53));
        assertEquals("LIV", romanNumeralsConversion.convertToRoman(54));
        assertEquals("LV", romanNumeralsConversion.convertToRoman(55));
        assertEquals("LVI", romanNumeralsConversion.convertToRoman(56));
        assertEquals("LVII", romanNumeralsConversion.convertToRoman(57));
        assertEquals("LVIII", romanNumeralsConversion.convertToRoman(58));
        assertEquals("LIX", romanNumeralsConversion.convertToRoman(59));
        assertEquals("LX", romanNumeralsConversion.convertToRoman(60));
        assertEquals("LXI", romanNumeralsConversion.convertToRoman(61));
        assertEquals("LXII", romanNumeralsConversion.convertToRoman(62));
        assertEquals("LXIII", romanNumeralsConversion.convertToRoman(63));
        assertEquals("LXIV", romanNumeralsConversion.convertToRoman(64));
        assertEquals("LXV", romanNumeralsConversion.convertToRoman(65));
        assertEquals("LXVI", romanNumeralsConversion.convertToRoman(66));
        assertEquals("LXVII", romanNumeralsConversion.convertToRoman(67));
        assertEquals("LXVIII", romanNumeralsConversion.convertToRoman(68));
        assertEquals("LXIX", romanNumeralsConversion.convertToRoman(69));
        assertEquals("LXX", romanNumeralsConversion.convertToRoman(70));
        assertEquals("LXXI", romanNumeralsConversion.convertToRoman(71));
        assertEquals("LXXII", romanNumeralsConversion.convertToRoman(72));
        assertEquals("LXXIII", romanNumeralsConversion.convertToRoman(73));
        assertEquals("LXXIV", romanNumeralsConversion.convertToRoman(74));
        assertEquals("LXXV", romanNumeralsConversion.convertToRoman(75));
        assertEquals("LXXVI", romanNumeralsConversion.convertToRoman(76));
        assertEquals("LXXVII", romanNumeralsConversion.convertToRoman(77));
        assertEquals("LXXVIII", romanNumeralsConversion.convertToRoman(78));
        assertEquals("LXXIX", romanNumeralsConversion.convertToRoman(79));
        assertEquals("LXXX", romanNumeralsConversion.convertToRoman(80));
        assertEquals("LXXXI", romanNumeralsConversion.convertToRoman(81));
        assertEquals("LXXXII", romanNumeralsConversion.convertToRoman(82));
        assertEquals("LXXXIII", romanNumeralsConversion.convertToRoman(83));
        assertEquals("LXXXIV", romanNumeralsConversion.convertToRoman(84));
        assertEquals("LXXXV", romanNumeralsConversion.convertToRoman(85));
        assertEquals("LXXXVI", romanNumeralsConversion.convertToRoman(86));
        assertEquals("LXXXVII", romanNumeralsConversion.convertToRoman(87));
        assertEquals("LXXXVIII", romanNumeralsConversion.convertToRoman(88));
        assertEquals("LXXXIX", romanNumeralsConversion.convertToRoman(89));
        assertEquals("XC", romanNumeralsConversion.convertToRoman(90));
        assertEquals("XCI", romanNumeralsConversion.convertToRoman(91));
        assertEquals("XCII", romanNumeralsConversion.convertToRoman(92));
        assertEquals("XCIII", romanNumeralsConversion.convertToRoman(93));
        assertEquals("XCIV", romanNumeralsConversion.convertToRoman(94));
        assertEquals("XCV", romanNumeralsConversion.convertToRoman(95));
        assertEquals("XCVI", romanNumeralsConversion.convertToRoman(96));
        assertEquals("XCVII", romanNumeralsConversion.convertToRoman(97));
        assertEquals("XCVIII", romanNumeralsConversion.convertToRoman(98));
        assertEquals("XCIX", romanNumeralsConversion.convertToRoman(99));
    }

    @Test
    public void roughTestToRomanConversion() {
        assertEquals("DLXXIV", romanNumeralsConversion.convertToRoman(574));
        assertEquals("DCXXXII", romanNumeralsConversion.convertToRoman(632));
        assertEquals("MMMDXCIV", romanNumeralsConversion.convertToRoman(3594));
        assertEquals("MMMDCXXV", romanNumeralsConversion.convertToRoman(3625));
    }

    @Test
    public void runRomanConversionTests() {
        test0to3RomanConversion();
        test4To8RomanConversion();
        test9To14RomanConversion();
        test21To30ToRomanConversion();
        test40To49ToRomanConversion();
        test50To99ToRomanConversion();
        roughTestToRomanConversion();
    }


    @Test
    public void testRomanToArabicConversion() {
        assertEquals(1, romanNumeralsConversion.convertToArabic("I"));
        assertEquals(2, romanNumeralsConversion.convertToArabic("II"));
        assertEquals(3, romanNumeralsConversion.convertToArabic("III"));
        assertEquals(4, romanNumeralsConversion.convertToArabic("IV"));
        assertEquals(5, romanNumeralsConversion.convertToArabic("V"));
        assertEquals(9, romanNumeralsConversion.convertToArabic("IX"));
        assertEquals(10, romanNumeralsConversion.convertToArabic("X"));
        assertEquals(12, romanNumeralsConversion.convertToArabic("XII"));
        assertEquals(19, romanNumeralsConversion.convertToArabic("XIX"));
        assertEquals(20, romanNumeralsConversion.convertToArabic("XX"));
        assertEquals(21, romanNumeralsConversion.convertToArabic("XXI"));
        assertEquals(24, romanNumeralsConversion.convertToArabic("XXIV"));
        assertEquals(25, romanNumeralsConversion.convertToArabic("XXV"));
        assertEquals(43, romanNumeralsConversion.convertToArabic("XLIII"));
        assertEquals(44, romanNumeralsConversion.convertToArabic("XLIV"));
        assertEquals(574, romanNumeralsConversion.convertToArabic("DLXXIV"));
        assertEquals(632, romanNumeralsConversion.convertToArabic("DCXXXII"));
        assertEquals(3594, romanNumeralsConversion.convertToArabic("MMMDXCIV"));//3594
        assertEquals(3625, romanNumeralsConversion.convertToArabic("MMMDCXXV"));
    }


//    @Test
//    public void runArabicConversionTests() {
//        testRomanToArabicConversion();
//    }

}