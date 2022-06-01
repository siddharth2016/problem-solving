import java.util.Scanner;

public class SumOfEvens {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt() / 2;
        System.out.println(N * (N + 1));
    }

}
