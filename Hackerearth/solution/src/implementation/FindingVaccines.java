// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/find-the-vaccine-a60e06ee/

package implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindingVaccines {

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = scanner.nextInt(); scanner.nextLine();
        String rna = scanner.nextLine();
        for(Character chr: rna.toCharArray()) {
            map.put(chr, map.getOrDefault(chr, 0) + 1);
        }
        int maxi = 0;
        int interaction = 0;
        for(int i=0; i<n; i++) {
            Map<Character, Integer> vmap = new HashMap<>();
            int m = scanner.nextInt(); scanner.nextLine();
            String vrna = scanner.nextLine();
            for(Character chr: vrna.toCharArray()) {
                vmap.put(chr, vmap.getOrDefault(chr, 0) + 1);
            }
            int in = vmap.getOrDefault('G', 0) * map.getOrDefault('C', 0)
                    + vmap.getOrDefault('C', 0) * map.getOrDefault('G', 0);
            if(interaction < in) {
                interaction = in;
                maxi = i + 1;
            }
        }
        System.out.println(maxi);
    }

}
