import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RomanNumbers {
    static Map<String, Integer> arabianNumbersMap = new HashMap<>() {{
        put("I", 1);
        put("II", 2);
        put("III", 3);
        put("IV", 4);
        put("V", 5);
        put("VI", 6);
        put("VII", 7);
        put("VIII", 8);
        put("IX", 9);
        put("X", 10);
        put("XI", 11);
        put("XII", 12);
        put("XIII", 13);
        put("XIV", 14);
        put("XV", 15);
        put("XVI", 16);
        put("XVII", 17);
        put("XVIII", 18);
        put("XIX", 19);
        put("XX", 20);
        put("XXI", 21);
        put("XXIV", 24);
        put("XXV", 25);
        put("XXVII", 27);
        put("XXVIII", 28);
        put("XXX", 30);
        put("XXXII", 32);
        put("XXXV", 35);
        put("XXXVI", 36);
        put("XL", 40);
        put("XLII", 42);
        put("XLV", 45);
        put("XLVIII", 48);
        put("XLIX", 49);
        put("L", 50);
        put("LIV", 54);
        put("LVI", 56);
        put("LX", 60);
        put("LXIII", 63);
        put("LXIV", 64);
        put("LXX", 70);
        put("LXXII", 72);
        put("LXXX", 80);
        put("LXXXI", 81);
        put("XC", 90);
        put("C", 100);
    }};

    static Set<String> arabianNumbers = arabianNumbersMap.keySet();

    static String arabianToRoman(int num) {
        String romanNum = "0";
        for (String key : arabianNumbersMap.keySet()) {
            if (arabianNumbersMap.get(key).equals(Math.abs(num)))
                romanNum = key;
        }
        if(num < 0)
            return "-" + romanNum;
        else
            return romanNum;
    }

    static int romanToArabian(String num) {
        return arabianNumbersMap.get(num);
    }
}
