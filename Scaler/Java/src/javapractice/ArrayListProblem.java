package javapractice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProblem {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for(int i=0 ; i<N; i++) {
            int n = scan.nextInt();
            if(n % 2 == 0) arrayList.add(n * n);
            else arrayList.add(n * n * n);
        }
        System.out.println(arrayList);
    }

}
