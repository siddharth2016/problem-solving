import java.util.Scanner;

public class IsItPrime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String isPrime = "YES";
        if(num == 1) isPrime = "NO";
        for(int i=2; i<=num/2; i++) {
            if(num % i == 0) {
                isPrime = "NO";
                break;
            }
        }
        System.out.println(isPrime);
    }

}
