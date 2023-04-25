// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/simon-cant-sleep-3beb3241/

package src.implementation;

import java.util.Scanner;

public class SimonCantSleep {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] hrsMins = scanner.nextLine().split(":");
        int hrs = Integer.parseInt(hrsMins[0]);
        int mins = Integer.parseInt(hrsMins[1]);
        int count = 0;
        if (hrs >= 12) {
            count = 11;
            hrs -= 12;
        }
        count += hrs;
        double hrHandDeg = ((hrs % 12) * 30) + (mins * (1.0/2.0));
        double minHandDeg = (double) mins * 6;
//        System.out.println(hrHandDeg + " " + minHandDeg);
        if (minHandDeg >= hrHandDeg) count++;
        System.out.println(count);
    }

}
