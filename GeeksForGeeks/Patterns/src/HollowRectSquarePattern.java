import java.util.Scanner;

public class HollowRectSquarePattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of Rows: ");
        int rows = scanner.nextInt(); scanner.nextLine();
        System.out.println("Enter Number of Cols: ");
        int cols = scanner.nextInt(); scanner.nextLine();

        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                if (i==0 || i==(rows-1)) System.out.print("*");
                else if (j==0 || j==(cols-1)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}


/*

rows = 6, cols = 20

 ********************
 *                  *
 *                  *
 *                  *
 *                  *
 ********************

 */