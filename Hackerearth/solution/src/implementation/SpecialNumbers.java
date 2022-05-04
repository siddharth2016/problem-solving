// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/happy-numbers-4a67748e/

package implementation;

import java.util.ArrayList;
import java.util.Scanner;

public class SpecialNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        ArrayList<String> list = new ArrayList<>();
        getAll("4", n, list);
        getAll("7", n, list);
        int count = 0;
        int length = list.size();
        for(int i=0; i< length; i++) {
            for(int j=i+1; j< length; j++) {
                if(isCoPrime(Long.parseLong(list.get(i)), Long.parseLong(list.get(j)))) count++;
            }
        }
        System.out.println(count);
    }

    static boolean isCoPrime(long x, long y) {
        return gcd(x, y) == 1;
    }

    static long gcd(long x, long y) {
        if (x == 0) return y;
        return gcd(y % x, x);
    }

    static int getAll(String num, long max, ArrayList<String> list) {
        if(Long.parseLong(num) > max) return 0;
        list.add(num);
        getAll(num + "4", max, list);
        getAll(num + "7", max, list);
        return 0;
    }

}
