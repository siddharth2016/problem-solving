package practiceproblems.matrices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AntiDiagonal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i=0; i<n; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0; j<n; j++) {
                temp.add(scan.nextInt());
            }
            arr.add(temp);
        }

        ArrayList<ArrayList<Integer>> result = diagonal(arr);
        for(int i=0; i<2*n-1; i++) {
            for(int val: result.get(i)) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int n = A.size();
        for(int i=0; i<((2*n)-1); i++) {
            result.add(new ArrayList<>());
        }
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                result.get(i+j).add(A.get(i).get(j));
            }
        }
        System.out.println(result.size() + " " + result.get(0).size());
        for(int i=0; i<2*n-1; i++) {
            int len = result.get(i).size();
            while(len < n) {
                result.get(i).add(0);
                len++;
            }
        }
        return result;
    }

}
