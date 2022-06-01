import java.util.Scanner;

public class BankAccount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        int M = scanner.nextInt();
        while(M--!=0) {
            int type = scanner.nextInt();
            long amount = scanner.nextLong();
            if(type == 1) {
                N += amount;
            }
            if(type == 2) {
                if(N < amount) {
                    System.out.println("Insufficient Funds");
                    continue;
                }
                else {
                    N -= amount;
                }
            }
            System.out.println(N);
        }
    }

}
