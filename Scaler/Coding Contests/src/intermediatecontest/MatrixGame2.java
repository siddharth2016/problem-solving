package src.intermediatecontest;

import java.util.HashMap;
import java.util.Scanner;

public class MatrixGame2 {

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long m = scan.nextLong();
        long q = scan.nextLong();
        HashMap<Long, Long> rowMap = new HashMap<>();
        HashMap<Long, Long> colMap = new HashMap<>();
        for(long i=1; i<=n; i++) {
            rowMap.put(i, i);
        }
        for(long i=1; i<=m; i++) {
            colMap.put(i, i);
        }

        for(int i=0; i<q; i++) {
            int inp1 = scan.nextInt();
            if(inp1 == 1) {
                long col1 = scan.nextInt();
                long col2 = scan.nextInt();
                long temp = colMap.get(col1);
                colMap.put(col1, colMap.get(col2));
                colMap.put(col2, temp);
            }
            else if(inp1 == 2) {
                long row1 = scan.nextInt();
                long row2 = scan.nextInt();
                long temp = rowMap.get(row1);
                rowMap.put(row1, rowMap.get(row2));
                rowMap.put(row2, temp);
            }
            else {
                long x1 = scan.nextInt();
                long y1 = scan.nextInt();
                long x2 = scan.nextInt();
                long y2 = scan.nextInt();
                long val1 = rowMap.get(x1) * m - (m - colMap.get(y1));
                long val2 = rowMap.get(x2) * m - (m - colMap.get(y2));
                if(inp1 == 3) {
                    System.out.println(val1 | val2);
                }
                else {
                    System.out.println(val1 & val2);
                }
            }
        }
    }

}
