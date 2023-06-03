package src.june23easy;

import java.util.Scanner;

public class AliceAndApple {

    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while(test != 0) {
            int n = scan.nextInt(); scan.nextLine();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = scan.nextInt();
            }
            if(n == 1) System.out.println("Yes");
            else {
                int gcd = arr[0];
                for(int i=1; i<n; i++) {
                    gcd = getGCD(gcd, arr[1]);
                }

                boolean found = true;

                for(int i=0; i<n; i++) {
                    arr[i] = arr[i] / gcd;
                }

                for(int i=0; i<n; i++) {
                    while(arr[i] % 2 == 0) {
                        arr[i] = arr[i] / 2;
                    }

                    while(arr[i] % 3 == 0) {
                        arr[i] = arr[i] / 3;
                    }

                    if(arr[i] != 1) {
                        found = false;
                        System.out.println("No");
                        break;
                    }
                }

                if(found) System.out.println("Yes");
            }
            test--;
        }
    }

    public static int getGCD(int a, int b) {
        if(a == 0) return b;
        return getGCD(b%a, a);
    }

}
