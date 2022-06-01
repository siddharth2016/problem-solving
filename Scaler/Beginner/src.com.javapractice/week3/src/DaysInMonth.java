import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if(N == 1 || N == 8 || N == 12 || N == 3 || N == 5 || N == 7 || N == 10) System.out.println(31);
        else if(N == 4 || N == 6 || N == 9 || N == 11) System.out.println(30);
        else System.out.println(28);
    }

}
