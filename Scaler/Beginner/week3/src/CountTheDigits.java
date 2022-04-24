import java.util.Scanner;

public class CountTheDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test--!=0) {
            int N = scanner.nextInt();
            int count = 1;
            while(N > 9) {
                count++;
                N /= 10;
            }
            System.out.println(count);
        }
    }

}
