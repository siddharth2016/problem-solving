package practiceproblems.strings;

import java.util.Arrays;
import java.util.Scanner;

public class ChangeCharacter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.nextLine();
        int B = scan.nextInt();
        System.out.println(solve(A, B));
    }

    public static int calculateFreq(String A, int[] arr) {
        int distinct = 0;
        for(char elem: A.toCharArray()) {
            if(arr[elem - 'a'] == 0) distinct++;
            arr[elem - 'a']++;
        }
        return distinct;
    }

    public static int solve(String A, int B) {
        int[] arr = new int[26];
        int distinct = calculateFreq(A, arr);
        Character[] str = new Character[A.length()];
        int i = 0;
        for(char elem: A.toCharArray()) {
            str[i] = elem;
            i++;
        }
        Arrays.sort(str, (a, b) -> {
            if(arr[a - 'a'] < arr[b - 'a']) return -1;
            else if(arr[a - 'a'] > arr[b - 'a']) return 1;
            else {
                if(a < b) return -1;
                else if (a > b) return 1;
                return 0;
            }
        });
        for(i=0; i<B; i++) {
            arr[str[i] - 'a']--;
            if(arr[str[i] - 'a'] == 0) distinct--;
        }
        return distinct;
    }

}
