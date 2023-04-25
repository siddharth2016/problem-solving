// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/cannibal-characters-d30e8a5f/

package src.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class CannibalCharacters {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();

            int out_ = Minimum_Operations(n, s);
            System.out.println(out_);

        }

        wr.close();
        br.close();
    }
    static int Minimum_Operations(int n, String s){
        int result = 0;
        Map<Character, Integer> distinct = new HashMap<>();
        Map<Character, Integer> repeating = new HashMap<>();
        for(Character chr: s.toCharArray()) {
            if(distinct.containsKey(chr)) {
                repeating.put(chr, repeating.getOrDefault(chr, 0) + 1);
                if(repeating.get(chr) == 2) {
                    result++;
                    repeating.replace(chr, 0);
                }
            }
            else {
                distinct.put(chr, 1);
            }
        }
        for(Integer rep: repeating.values()) {
            result+=rep;
        }
        return result;
    }

}
