package practiceproblems.week6.arrays;

import java.util.Scanner;

public class SeparateOddEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while(test--!=0) {
            int n = scan.nextInt();
            int[] oddArr = new int[n];
            int[] evenArr = new int[n];
            int cE = 0;
            int cO = 0;
            for(int i=0; i<n; i++) {
                int a = scan.nextInt();
                if(a % 2 == 0) {
                    evenArr[cE] = a;
                    cE++;
                }
                else {
                    oddArr[cO] = a;
                    cO++;
                }
            }
            for(int i=0; i<cO; i++) {
                System.out.print(oddArr[i] + " ");
            }
            System.out.println();
            for(int i=0; i<cE; i++) {
                System.out.print(evenArr[i] + " ");
            }
            System.out.println();
        }
    }

}
