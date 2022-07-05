package lesson.carryfwd;

import java.util.Scanner;

public class LeadersInArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }
        int leader = -1;
        for(int i=n-1; i>-1; i--) {
            if(leader < arr[i]) {
                leader = arr[i];
                System.out.println(leader);
            }
        }
    }

}
