import java.util.Scanner;

public class NumericTrianglePattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        for (int i=0; i<N; i++) {

            for(int j=0; j < (2*N - 2*(i+1))/2; j++) {
                System.out.print(" ");
            }

            for (int j=i+1; j<=(2*i + 1); j++) {
                System.out.print(j);
            }

            for (int j=2*i; j>=i+1; j--) {
                System.out.print(j);
            }

            for(int j=0; j < (2*N - 2*(i+1))/2; j++) {
                System.out.print(" ");
            }

            System.out.println();

        }
    }

}
