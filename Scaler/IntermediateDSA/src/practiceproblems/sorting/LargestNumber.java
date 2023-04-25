package practiceproblems.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestNumber {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(30);
        list.add(34);
        list.add(5);
        list.add(9);

        System.out.println(largestNumber(list));
    }

    public static String largestNumber(final List<Integer> A) {
        ArrayList<Integer> temp = new ArrayList<>(A);
        Collections.sort(temp, (a, b) -> {
            String num1 = "" + a + b;
            String num2 = "" + b + a;
            return num1.compareTo(num2);
        });
        Collections.reverse(temp);
        String result = "";
        for(int elem: temp) {
            result += elem;
        }
        if(result.charAt(0) == '0') result = "0";
        return result;
    }

}
