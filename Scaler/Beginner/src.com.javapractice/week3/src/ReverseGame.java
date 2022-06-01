import java.util.Scanner;

public class ReverseGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        while(test--!=0) {
            int n = scanner.nextInt();
            int rev = 0;
            while(n > 0) {
                rev = rev * 10 + n % 10;
                n /= 10;
            }
            System.out.println(rev);
        }
    }

}
