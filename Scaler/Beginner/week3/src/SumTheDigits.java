import java.util.Scanner;

public class SumTheDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test--!=0) {
            int sum = 0;
            int N = scanner.nextInt();
            while(N != 0) {
                sum += N % 10;
                N /= 10;
            }
            System.out.println(sum);
        }
    }

}
