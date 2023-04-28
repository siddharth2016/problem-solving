package src.april23circuit;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class BusyAirport {

    public static void main(String args[] ) throws Exception {
        Deque<Long> dq1 = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        long A = scan.nextLong();
        long B = scan.nextLong();
        long C = scan.nextLong();
        long D = scan.nextLong(); scan.nextLine();
        int N = scan.nextInt(); scan.nextLine();
        long[] arr = new long[N];
        for(int i=0; i<N; i++) {
            arr[i] = scan.nextLong();
        }
        ArrayList<Long> afterPassport = new ArrayList<>();
        for(long val: arr) {
            if(dq1.size() < (int)B) dq1.addLast(val);
            else {
                long first = dq1.removeFirst() + A;
                dq1.addLast(Long.max(first, val));
                afterPassport.add(first);
            }
        }

        while(dq1.size() != 0) {
            afterPassport.add(dq1.removeFirst() + A);
        }

        long ans = Long.MIN_VALUE;
        for(long val: afterPassport) {
            if(dq1.size() < (int)D) dq1.addLast(val);
            else {
                long first = dq1.removeFirst() + C;
                dq1.addLast(Long.max(first, val));
                ans = Long.max(ans, first);
            }
        }
        while(dq1.size() != 0) {
            ans = Long.max(ans, dq1.removeFirst() + C);
        }

        System.out.println(ans);

    }

}
