package src.arrays;

import java.util.HashMap;

public class TripletSum {

    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 1, 8, 9, 4, 5};
        int K = 10;
        int countPairs = 0;

        for(int i=0; i<arr.length-2; i++) {
            int T = K - arr[i];
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int j=i+1; j<arr.length; j++) {
                if(map.containsKey(T - arr[j])) countPairs++;
                map.put(arr[j], j);
            }
        }

        System.out.println(countPairs);
    }

}
