import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int units = scanner.nextInt();
        double bill = 0;
        if (units > 250) {
            bill += (units - 250) * 1.5;
            bill += 50 * 0.5 + 100 * 0.75 + 100 * 1.20;
        }
        else if (units > 150) {
            bill += (units - 150) * 1.20;
            bill += 50 * 0.5 + 100 * 0.75;
        }
        else if (units > 50) {
            bill += (units - 50) * 0.75;
            bill += 50 * 0.5;
        }
        else {
            bill += units * 0.5;
        }
        bill += bill * 0.2;
        System.out.println((int)Math.floor(bill));
    }
}
