package lesson.bitmanipulations;

import java.util.Scanner;

public class BattleLevel {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int level = scan.nextInt();
        int countJumps = 0;
        while(level > 0) {
            countJumps += level&1;
            level >>= 1;
        }
        System.out.println(countJumps);
    }

}
