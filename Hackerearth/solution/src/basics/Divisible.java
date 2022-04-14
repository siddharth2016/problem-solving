// https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/divisibe-or-2d8e196a/

package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Divisible {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        String[] arr_A = br.readLine().split(" ");
        int[] A = new int[N];
        for(int i_A=0; i_A<arr_A.length; i_A++)
        {
            A[i_A] = Integer.parseInt(arr_A[i_A]);
        }

        String out_ = solve(A);
        System.out.println(out_);

        wr.close();
        br.close();
    }
    static String solve(int[] A){
        int n = A.length;
        int[] arr = new int[n];
        for(int i=0; i<n/2; i++) {
            arr[i] = getFirstDigit(A[i]);
        }
        for(int i=n/2; i<n; i++) {
            arr[i] = A[i] % 10;
        }
//        System.out.println(Arrays.toString(Arrays.stream(arr).toArray()));
        int evenSum = 0;
        int oddSum = 0;
        for(int i=1; i<n; i+=2) {
            oddSum += arr[i];
        }
        for(int i=0; i<n; i+=2) {
            evenSum += arr[i];
        }
        return oddSum == evenSum ? "OUI" : "NON";
    }

    static int getFirstDigit(int n) {
        int r = 0;
        while(n!=0) {
            r = n % 10;
            n = n / 10;
        }
        return r;
    }

}
