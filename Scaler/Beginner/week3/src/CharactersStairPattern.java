import java.util.Scanner;

public class CharactersStairPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int i = 1;
        while(i<=N) {
            int j = 1;
            while(j<=i) {
                System.out.print((char)(64 + i));
                if(j!=i) System.out.print(" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
