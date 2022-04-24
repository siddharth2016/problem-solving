import java.util.Scanner;

public class PrintThePrimes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i=1; i<=N; i++) {
            if(isPrime(i)) System.out.println(i);
        }
    }

    static boolean isPrime(int n) {
        if(n == 1) return false;
        boolean prime = true;
        for(int i=2; i<=n/2; i++) {
            if(n % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

}
