package practiceproblems.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GrayCodeWithLoop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();

        ArrayList<Integer> grayCodeSeq = new ArrayList<>(Arrays.asList(0, 1));

        for(int i=2; i<=A; i++) {
            for(int j=grayCodeSeq.size()-1; j>=0; j--) {
                grayCodeSeq.add(grayCodeSeq.get(j) | (1<<(i-1)));
            }
        }
    }

}
