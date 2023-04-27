package src;

import java.util.Scanner;

public class SetBits {

    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner scan = new Scanner(System.in);
        long test = scan.nextLong(); scan.nextLine();
        while(test > 0) {
            long L = scan.nextLong();
            long K = scan.nextLong();
            long setBitsL = getSetBits(L-1L);
            long end = 2L * (long)Math.pow(10, 15);
            long start = L;
            long ans = -1;
            while(start <= end) {
                long mid = start + (end - start) / 2;
                long setBitsR = getSetBits(mid);
                System.out.println(start + " " + end + " " + mid + " " + setBitsR);
                if((setBitsR - setBitsL) >= K) {
                    ans = mid;
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            System.out.println(ans);
            test--;
        }
    }

    public static long getSetBits(long A) {
        if(A == 0L) return 0L;
        long ans = 0L;
        long remainingOnes;
        long groupOnes;
        for(int i=0; i<64; i++) {

            if(A < (1L<<i)) break;

            if((A & (1L<<i)) != 0) remainingOnes = (A % (1L<<i)) + 1L;
            else remainingOnes = 0L;

            groupOnes = (long)(A / (1L<<(i+1))) * (1L<<i);

            ans += remainingOnes + groupOnes;
            System.out.println("ones = " + ans);
        }
        return ans;
    }

}
