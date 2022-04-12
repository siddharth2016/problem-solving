// https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/maximum-border-9767e14c/

package basics;

import java.util.Scanner;

public class MaximumBorders {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Integer test = scanner.nextInt();

        while (test != 0) {

            int n = scanner.nextInt();
            int m = scanner.nextInt();

            char[][] arr = new char[n][m];
            int max = Integer.MIN_VALUE;
            int count;

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.next().toCharArray();
            }

            for (int i = 0; i < n; i++) {
                count = 0;
                for (int j = 1; j < m; j++) {
                    if (arr[i][j - 1] == arr[i][j] && arr[i][j] == '#') {
                        count++;
                    } else {
                        max = Integer.max(max, count + 1);
                        count = 0;
                    }
                }
            }

            for (int j = 0; j < m; j++) {
                count = 0;
                for (int i = 1; i < n; i++) {
                    if (arr[i - 1][j] == arr[i][j] && arr[i][j] == '#') {
                        count++;
                    } else {
                        max = Integer.max(max, count + 1);
                        count = 0;
                    }
                }
            }

            System.out.println(max);
            test--;
        }
    }
}
