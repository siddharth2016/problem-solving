package src.circuit;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class XorSubsequences {

    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); scan.nextLine();
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = scan.nextInt();
        }
        int[] result = new int[N];
        Set<Integer> firstSet = new HashSet<>();
        Set<Integer> secondSet = new HashSet<>();
        result[0] = 1;
        firstSet.add(arr[0]);
        for(int i=1; i<N; i++) {
            int val = arr[i];
            for(int setVal: firstSet) {
                secondSet.add(setVal ^ val);
            }
            secondSet.add(val);
            secondSet.addAll(firstSet);
            result[i] = secondSet.size();
            firstSet = secondSet;
            secondSet = new HashSet<>();
        }
        for(int val: result) {
            System.out.print(val + " ");
        }
    }

}
