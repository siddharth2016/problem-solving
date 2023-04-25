// https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/seven-segment-display-nov-easy-e7f87ce0/

package src.basics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SevenSegmentDisplay {

    public static void main(String[] args) {
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 6);
        mp.put(1, 2);
        mp.put(2, 5);
        mp.put(3, 5);
        mp.put(4, 4);
        mp.put(5, 5);
        mp.put(6, 6);
        mp.put(7, 3);
        mp.put(8, 7);
        mp.put(9, 6);

        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while(testCases--!=0) {
            int num = scanner.nextInt();
            int totalSticks = getTotalSticks(mp, num);
            String res = "";
            if(totalSticks % 2 == 0) {
                for(int i=0; i<totalSticks; i+=2) {
                    res += "1";
                }
            } else {
                for(int i=0; i<totalSticks-3; i+=2) {
                    res += "1";
                }
                res = "7" + res;
            }
            System.out.println(res);
        }
    }

    static int getTotalSticks(Map<Integer, Integer> mp, int num) {
        int total = mp.getOrDefault(num, 0);
        if (total == 0) {
            while (num != 0) {
                total += mp.get(num % 10);
                num = num / 10;
            }
        }
        return total;
    }
}
