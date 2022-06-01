import java.util.Scanner;

public class MinOfThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        System.out.println(Math.min(Math.min(A, B), C));
    }

}
