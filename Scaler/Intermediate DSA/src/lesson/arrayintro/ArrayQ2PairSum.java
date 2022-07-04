package lesson.arrayintro;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayQ2PairSum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0; i<n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            if(map.getOrDefault(k - arr[i], 0) > 0 ) {
                count += map.get(k - arr[i]);
            }
        }
        System.out.println(count);
    }

}
