import java.util.Scanner;

public class FullNumericPyramid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i=1; i<=N; i++) {
            for(int j=1; j<=N-i; j++) System.out.print("0 ");

            for(int j=i; j<=2*i-1; j++) {
                System.out.print(j);
                if(j != 2*i-1) System.out.print(" ");
            }

            for(int j=2*i-2; j>=i; j--) {
                System.out.print(" " + j);
            }

            for(int j=1; j<=N-i; j++) System.out.print(" 0");

            System.out.println();
        }
    }

}
