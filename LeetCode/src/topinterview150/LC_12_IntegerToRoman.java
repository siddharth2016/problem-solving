package src.topinterview150;

import java.util.HashMap;
import java.util.Map;

public class LC_12_IntegerToRoman {

    public String intToRoman(int num) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");
        StringBuilder sb = new StringBuilder();
        while(num != 0) {
            if(num >= 1000) {
                sb.append("M");
                num -= 1000;
            }
            else if(num >= 900) {
                sb.append("CM");
                num -= 900;
            }
            else if(num >= 500) {
                sb.append("D");
                num -= 500;
            }
            else if(num >= 400) {
                sb.append("CD");
                num -= 400;
            }
            else if(num >= 100) {
                sb.append("C");
                num -= 100;
            }
            else if(num >= 90) {
                sb.append("XC");
                num -= 90;
            }
            else if(num >= 50) {
                sb.append("L");
                num -= 50;
            }
            else if(num >= 40) {
                sb.append("XL");
                num -= 40;
            }
            else if(num >= 10) {
                sb.append("X");
                num -= 10;
            }
            else if(num >= 9) {
                sb.append("IX");
                num -= 9;
            }
            else if(num >= 5) {
                sb.append("V");
                num -= 5;
            }
            else if(num >= 4) {
                sb.append("IV");
                num -= 4;
            }
            else if(num >= 1) {
                sb.append("I");
                num -= 1;
            }
        }
        return sb.toString();
    }

}
