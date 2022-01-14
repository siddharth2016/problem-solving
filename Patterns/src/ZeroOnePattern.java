import java.util.Scanner;

public class ZeroOnePattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        int symbol;
        for (int i=0; i<N; i++) {
            if (i % 2 == 0) symbol = 1;
            else symbol = 0;
            for (int j=0; j<i+1; j++) {
                System.out.print(symbol);
                symbol = symbol == 1 ? 0 : 1;
            }
            System.out.println();
        }
    }

}

/*

INPUT - 4
OUTPUT -

1
01
101
0101

INPUT - 11
OUTPUT -

1
01
101
0101
10101
010101
1010101
01010101
101010101
0101010101
10101010101

 */