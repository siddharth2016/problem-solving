import java.util.Scanner;

public class AverageOf5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        double avg = (double)(a + b + c + d + e) / 5.0;
        System.out.format("%.2f", avg);
    }

}
