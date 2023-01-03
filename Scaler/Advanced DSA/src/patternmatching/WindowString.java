package src.patternmatching;

import java.util.HashMap;


/***
 * WRONG SOLUTION
 */

public class WindowString {

    public static void main(String[] args) {
        System.out.println(
                minWindow("xiEjBOGeHIMIlslpQIZ6jERaAVoHUc9Hrjlv7pQpUSY8oHqXoQYWWll8Pumov89wXDe0Qx6bEjsNJQAQ0A6K21Z0BrmM96FWEdRG69M9CYtdBOrDjzVGPf83UdP3kc4gK0uHVKcPN4HPdccm9Qd2VfmmOwYCYeva6BSG6NGqTt1aQw9BbkNsgAjvYzkVJPOYCnz7U4hBeGpcJkrnlTgNIGnluj6L6zPqKo5Ui75tC0jMojhEAlyFqDs7WMCG3dmSyVoan5tXI5uq1IxhAYZvRQVHtuHae0xxwCbRh6S7fCLKfXeSFITfKHnLdT65K36vGC7qOEyyT0Sm3Gwl2iXYSN2ELIoITfGW888GXaUNebAr3fnkuR6VwjcsPTldQSiohMkkps0MH1cBedtaKNoFm5HbH15kKok6aYEVsb6wOH2w096OwEyvtDBTQwoLN87JriLwgCBBavbOAiLwkGGySk8nO8dLHuUhk9q7f0rIjXCsQeAZ1dfFHvVLupPYekXzxtWHd84dARvv4Z5L1Z6j8ur2IXWWbum8lCi7aErEcq41WTo8dRlRykyLRSQxVH70rUTz81oJS3OuZwpI1ifBAmNXoTfznG2MXkLtFu4SMYC0bPHNctW7g5kZRwjSBKnGihTY6BQYItRwLUINApd1qZ8W4yVG9tnjx4WyKcDhK7Ieih7yNl68Qb4nXoQl079Vza3SZoKeWphKef1PedfQ6Hw2rv3DpfmtSkulxpSkd9ee8uTyTvyFlh9G1Xh8tNF8viKgsiuCZgLKva32fNfkvW7TJC654Wmz7tPMIske3RXgBdpPJd5BPpMpPGymdfIw53hnYBNg8NdWAImY3otYHjbl1rqiNQSHVPMbDDvDpwy01sKpEkcZ7R4SLCazPClvrx5oDyYolubdYKcvqtlcyks3UWm2z7kh4SHeiCPKerh83bX0m5xevbTqM2cXC9WxJLrS8q7XF1nh",
                        "dO4BRDaT1wd0YBhH88Afu7CI4fwAyXM8pGoGNsO1n8MFMRB7qugS9EPhCauVzj7h")
        );
    }

    public static boolean containsAll(String str, HashMap<Character, Integer> mapB, HashMap<Character, Integer> mapA) {
        boolean contains = true;
        for(char chr1: str.toCharArray()) {
            System.out.println(chr1 + " " + mapA.get(chr1) + " " + mapB.get(chr1));
            if(!mapA.containsKey(chr1) || (mapA.containsKey(chr1) && !mapB.get(chr1).equals(mapA.get(chr1)))) {
                contains = false;
                break;
            }
        }
        System.out.println("Contains " + contains);
        return contains;
    }

    public static String minWindow(String A, String B) {
        if(A.length() < B.length()) return "";
        HashMap<Character, Integer> mapB = new HashMap<>();
        HashMap<Character, Integer> mapA = new HashMap<>();
        for(char chr: B.toCharArray()) {
            mapB.put(chr, mapB.getOrDefault(chr, 0) + 1);
        }
        System.out.println(mapB);
        int i = 0;
        int j = 0;
        int start = 0;
        int end = 0;
        int len = Integer.MAX_VALUE;

        while(i < A.length() || j < A.length()) {

            while(j < A.length() && !containsAll(B, mapB, mapA)) {
                mapA.put(A.charAt(j), mapA.getOrDefault(A.charAt(j), 0) + 1);
                j++;
            }

            System.out.println(i + " " + j);
            System.out.println(A.substring(i, j));

            if(containsAll(B, mapB, mapA) && len > (j - i)) {
                System.out.println("Inside updation..., len = " + (j - i));
                start = i;
                end = j;
                len = j - i;
                System.out.println(A.substring(start, end));
            }

            mapA.put(A.charAt(i), mapA.get(A.charAt(i)) - 1);
            i++;
        }

        return A.substring(start, end);
    }

}
