package src.problems;

import java.util.Scanner;

public class ZigZagStringPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String: ");
        String S = scanner.nextLine();
        System.out.println("Enter Rows: ");
        int R = scanner.nextInt(); scanner.nextLine();

        printPattern(S, R);
    }


    private static void printPattern(String S, int R) {
        int interval = 2*(R-1);
        for (int i=0; i<R; i++) {
            int step = interval - 2*i;

            for (int j=i; j<S.length(); j += interval) {
                System.out.print(S.charAt(j));

                if (0 < step && step < interval && j + step < S.length()) {
                    for (int k=0; k<interval-R-i; k++) System.out.print(" ");

                    System.out.print(S.charAt(j+step));

                    for (int k=0; k<i-1; k++) System.out.print(" ");
                }
                else {
                    for (int k = 0; k < (interval - R); k++) System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

/*

Enter String:
123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz
Enter Rows:
9

OUPUT -

1       H       X       n
2      GI      WY      mo
3     F J     V Z     l p
4    E  K    U  a    k  q
5   D   L   T   b   j   r   z
6  C    M  S    c  i    s  y
7 B     N R     d h     t x
8A      OQ      eg      uw
9       P       f       v


 */
