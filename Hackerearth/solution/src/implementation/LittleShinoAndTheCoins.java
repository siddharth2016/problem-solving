// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/little-shino-and-coins-3/

package implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LittleShinoAndTheCoins {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt(); scanner.nextLine();
        char[] str = scanner.nextLine().toCharArray();
        int n = str.length;
        int dist = 0;
        int tempDist = dist;
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2;
        int totalSubString = 0;
        for (int i=0; i<n; i++) {
            char chr = str[i];
            int val = map.getOrDefault(chr, 0);
            if (val == 0) {
                dist++;
            }
            if (dist == k) totalSubString++;
            map.put(chr, val+1);
            tempDist = dist;
            map2 = new HashMap<>(map);
            for(int j=0; j<i+1-k; j++) {
                int val2 = map2.get(str[j]) - 1;
                if(val2 == 0) tempDist--;
                if(tempDist == k) totalSubString++;
                map2.put(str[j], val2);
            }
        }
        System.out.println(totalSubString);
    }

}
