// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/multiple-occurence-97c00160/

package implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MultipleOccurrences {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test--!=0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            Map<Integer, Integer> map1 = new HashMap<>();
            Map<Integer, Integer> map2 = new HashMap<>();
            long sum = 0;
            for(int i=0; i<n; i++) {
                arr[i] = scanner.nextInt();
                if(map1.getOrDefault(arr[i], -1) == -1) {
                    map1.put(arr[i], i);
                    map2.put(arr[i], i);
                }
                else {
                    map2.put(arr[i], i);
                }
            }
            for(Integer key: map1.keySet()) {
                sum += Math.abs(map2.get(key) - map1.get(key));
            }
            System.out.println(sum);
        }
    }

}
