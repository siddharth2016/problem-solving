// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/update-the-array-3fcbf307/

package src.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class UpdateTheArray {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String[] arr_A = br.readLine().split(" ");
            int[] A = new int[N];
            for(int i_A = 0; i_A < arr_A.length; i_A++)
            {
                A[i_A] = Integer.parseInt(arr_A[i_A]);
            }
            int K = Integer.parseInt(br.readLine().trim());

            int out_ = minUpdates(N, A, K);
            System.out.println(out_);

        }

        wr.close();
        br.close();
    }
    static int minUpdates(int N, int[] A, int K){
        int result = 0;
        Map<Integer, Integer> distinctK = new HashMap<>();
        Map<Integer, Integer> values = new HashMap<>();
        int repeatEven = 0;
        int repeatOdd = 0;
        for(int i=1; i<=K; i++) {
            distinctK.put(i, 1);
        }
        for(int i=0; i<N; i++) {
            if(distinctK.containsKey(A[i]) && distinctK.get(A[i]) != 0) {
                distinctK.remove(A[i]);
            }
            if(values.containsKey(A[i]) && A[i] % 2 == 0) repeatEven++;
            else if(values.containsKey(A[i]) && A[i] % 2 != 0) repeatOdd++;
            values.putIfAbsent(A[i], 1);
        }
        for(Integer val: distinctK.keySet()) {
//            System.out.println("val - " + val);
//            System.out.println("repeatEven - " + repeatEven +
//                    " repeatOdd - " + repeatOdd);
            if(repeatEven == 0 && repeatOdd == 0) break;
            if(val % 2 == 0) {
                if(repeatOdd > repeatEven) repeatOdd--;
                else repeatEven--;
            }
            else {
                if(repeatEven > repeatOdd) repeatEven--;
                else repeatOdd--;
            }
            result++;
        }
        if(repeatEven == 0 && repeatOdd == 0) return result;
        return -1;
    }

}
