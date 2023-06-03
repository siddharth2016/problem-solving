package src.june23easy;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();
        int k = scan.nextInt();
        StringBuilder sb = new StringBuilder();
        String val = String.valueOf(num);
        for(int i=0; i<k; i++) {
            sb.append(val.charAt(0));
            boolean deleted = false;
            for(int j=1; j<val.length(); j++) {
                if(!deleted && sb.charAt(sb.length()-1) < val.charAt(j)) {
                    sb.deleteCharAt(sb.length()-1);
                    sb.append(val.charAt(j));
                    deleted = true;
                }
                else {
                    sb.append(val.charAt(j));
                }
            }
            if(!deleted) sb.deleteCharAt(sb.length()-1);
            val = sb.toString();
            sb.setLength(0);
        }
        System.out.println(val);
    }

}
