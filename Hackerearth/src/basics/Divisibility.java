// https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/divisible-or-not-81b86ad7/

package src.basics;

import java.util.Scanner;

public class Divisibility {

    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int N = 0;
        N = s.nextInt();

        int[] data = new int[N];
        for(int i=0; i<N; i++){
            data[i] = s.nextInt();
        }

        String ans = data[N-1]%10 == 0 ? "Yes" : "No";

        System.out.println(ans);
    }

}
