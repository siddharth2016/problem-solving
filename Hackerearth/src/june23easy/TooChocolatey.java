package src.june23easy;

import java.util.*;

public class TooChocolatey {

    public static String solve(int n, int[] arr){
        // Write your code here
        String result = "Alex";
        int oddSum = 0;
        int evenSum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int val: arr) {
            if(!map.containsKey(val) || map.get(val) < 2) {
                map.put(val, map.getOrDefault(val, 0) + 1);
                list.add(val);
            }
        }
        list.sort(Collections.reverseOrder());
        for(int i=0; i<list.size(); i++) {
            if(i % 2 == 0) evenSum += list.get(i);
            else oddSum += list.get(i);
        }
        if(evenSum > oddSum) return result;
        return "Bob";
    }

}
