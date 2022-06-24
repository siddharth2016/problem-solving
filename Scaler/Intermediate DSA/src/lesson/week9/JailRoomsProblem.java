package lesson.week9;

import java.util.Scanner;

public class JailRoomsProblem {

    private static int getSqrtCountLinear(int n) {
        int i=1;
        while(i*i<=n) {
            i++;
        }
        return i-1;
    }

    private static int getSqrtCountBinary(int n) {
        int low = 1;
        int high = n;
        int mid = n / 2;
        while(low<=high) {
            if(mid * mid < n) low = mid + 1;
            else if(mid * mid > n) high = mid - 1;
            else break;
            mid = (low + high) / 2;
        }
        return mid;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(getSqrtCountLinear(n));
        System.out.println(getSqrtCountBinary(n));
    }

}
