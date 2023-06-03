package src.june23easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AliceAndGCD {

    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); scan.nextLine();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n-1; i++) {
            int maxGCD = 1;
            for(int j=i+1; j<n; j++) {
                maxGCD = Integer.max(maxGCD, gcd(arr[i], arr[j]));
            }
            list.add(maxGCD);
        }
        Collections.sort(list);
        System.out.println(list);
        long round = 1L;
        long ans = 0L;
        for(int i=n/2-1; i<n-1; i++) {
            ans = ans + list.get(i) * round;
            round++;
        }
        System.out.println(ans);
    }

    public static int gcd(int a, int b) {
        if(a == 0) return b;
        return gcd(b%a, a);
    }

}
