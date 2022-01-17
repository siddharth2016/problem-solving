import java.util.Scanner;

public class PrintPattern102030 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Value of N: ");
        int n = scanner.nextInt(); scanner.nextLine();
        printPattern(n);
    }

    private static void printPattern(int n) {
        int count1 = 1;
        int count2 = n*n+1;
        int i, j;
        for (i=0; i<n; i++) {
            for (j=0; j<2*i; j++) System.out.print("*");
            for (j=0; j<n-i; j++) {
                System.out.print(count1);
                System.out.print("0");
                count1++;
            }
            for (j=0; j<n-i; j++) {
                System.out.print(count2+j);
                if (j!=n-i-1) System.out.print("0");
            }
            count2 = count2 - n + i + 1;
            System.out.println();
        }
    }
}

/*

Enter Value of N:
5
102030405026027028029030
**6070809022023024025
****10011012019020021
******13014017018
********15016

Enter Value of N:
6
10203040506037038039040041042
**70809010011032033034035036
****12013014015028029030031
******16017018025026027
********19020023024
**********21022

 */
