import java.util.Scanner;

public class MinOfTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        System.out.println(Math.min(A, B));
        scanner.close();
    }

}
