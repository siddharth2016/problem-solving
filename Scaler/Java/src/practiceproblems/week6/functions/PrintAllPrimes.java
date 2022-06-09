package practiceproblems.week6.functions;

import java.util.Scanner;

public class PrintAllPrimes {

    private static void getPrimes(boolean[] arr, int n) {
        for(int i=2; i<=n; i++) {
            if(!arr[i]) {
                for(int j=i*2; j<=n; j+=i) {
                    arr[j] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n<=1) System.out.println("There are no prime numbers less than or equal to " + n);
        else {
            boolean[] arr = new boolean[n+1];
            getPrimes(arr, n);
            for(int i=2; i<=n; i++) {
                if(!arr[i]) {
                    System.out.print(i + " ");
                }
            }
        }
    }

}
