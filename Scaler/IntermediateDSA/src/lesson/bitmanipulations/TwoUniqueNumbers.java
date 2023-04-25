package lesson.bitmanipulations;

import java.util.Scanner;

public class TwoUniqueNumbers {


    private static int getXOR(int[] arr) {
        int xor = 0;
        for(int elem:arr) {
            xor ^= elem;
        }
        return xor;
    }

    private static int getUniqueSetBit(int n) {
        int count = 0;
        while(n > 0) {
            if((n&1) == 1) {
                break;
            }
            n >>= 1;
            count++;
        }
        return count;
    }

    private static int getFirstUnique(int[] arr, int setBit) {
        int first = 0;
        for(int elem:arr) {
            if(((elem>>setBit) & 1) == 1) first ^= elem;
        }
        return first;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }
        int twoUniqXor = getXOR(arr);
        int firstUniqeSetBit = getUniqueSetBit(twoUniqXor);
        int firstUnique = getFirstUnique(arr, firstUniqeSetBit);
        int secondUnique = firstUnique ^ twoUniqXor;
        System.out.println(firstUnique + " " + secondUnique);
    }

}
