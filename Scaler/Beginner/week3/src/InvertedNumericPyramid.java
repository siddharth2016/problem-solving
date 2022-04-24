import java.util.Scanner;

public class InvertedNumericPyramid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();;
        while(i >= 1) {
            int j = 1;
            while(j <= i) {
                System.out.print(j);
                if(j != i) System.out.print(" ");
                j++;
            }
            System.out.println();
            i--;
        }
    }

}
