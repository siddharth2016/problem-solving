// https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/split-house-547be0e9/

package basics;

import java.util.Scanner;

public class SplitHouses {

    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); scanner.nextLine();
        String str = scanner.nextLine();
        boolean found = true;
        for(int i=1; i<str.length(); i++) {
            if (str.charAt(i) == str.charAt(i-1)
                    && str.charAt(i) == 'H') {
                found = false;
                break;
            }
        }
        if(found) {
            System.out.println("YES");
            System.out.println(str.replace('.', 'B'));
        }
        else {
            System.out.println("NO");
        }
    }

}
