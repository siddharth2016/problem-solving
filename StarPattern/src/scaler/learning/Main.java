package scaler.learning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i=0; i<n; i++) {
            for (int j=0; j< (2*n - 2*(i+1))/2; j++) {
                System.out.print(" ");
            }
            for (int j=0; j<(2*(i+1)-1); j++) {
                System.out.print("*");
            }
            for (int j=0; j< (2*n - 2*(i+1))/2; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
