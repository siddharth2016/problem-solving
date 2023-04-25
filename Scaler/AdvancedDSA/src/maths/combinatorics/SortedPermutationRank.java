package src.maths.combinatorics;

public class SortedPermutationRank {

    public long fact(long A) {
        long ans = 1l;
        for(int i=1; i<=A; i++) {
            ans = (ans % 1000003 * i % 1000003) % 1000003;
        }
        return ans;
    }

    public int findRank(String A) {
        if(A.length() == 1) return 1;

        int count = 0;
        for(int i=1; i<A.length(); i++) {
            if(A.charAt(0) > A.charAt(i)) count++;
        }

        return ((count % 1000003 * (int)fact(A.length() - 1) % 1000003) % 1000003 +
                findRank(A.substring(1, A.length())) % 1000003) % 1000003 ;

    }

}
