// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/passing-the-parcel/

package implementation;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PassingTheParcel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(); scanner.nextLine();
        char[] lyrics = scanner.nextLine().toCharArray();
        int length = lyrics.length;
        List<Integer> list = new LinkedList<>();
        for(int i=1; i<=num; i++) {
            list.add(i);
        }
        int j = 0;
        int i = 0;
        while(list.size() != 1) {
            if (lyrics[j] == 'a') {
                i = (i + 1) % num;
                j = (j + 1) % length;
            }
            if (lyrics[j] == 'b') {
                list.remove(i);
                num--;
                i = i % num;
                j = (j+1) % length;
            }
        }
        System.out.println(list.get(0));
    }
}
