package src.binarysearch;

import java.util.List;

public class KthPrice {

    public int solve(final List<Integer> A, int B) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int N = A.size();
        for(int i = 0; i<N; i++){
            min = Math.min(min,A.get(i));
            max = Math.max(max,A.get(i));
        }
        int l = min;
        int h = max;
        int ans = min;

        while(l<=h){
            int m = (l+h)/2;
            int less = countless(A,m);
            int equal = counteq(A,m);
            int lowRange = less+1;
            int highRange = less+equal;
            if(B>=lowRange && B<=highRange){
                if(equal>0){
                    ans = m;
                    break;
                }
                else{
                    l = m+1;
                }
            }
            if(B<lowRange){
                h = m-1;
            }
            if(B>highRange){
                l = m+1;
            }
        }
        return ans;
    }
    public int countless(final List<Integer> A, int n){
        int N = A.size();
        int count = 0;
        for(int i = 0; i<N; i++){
            if(A.get(i)<n){
                count++;
            }
        }
        return count;
    }
    public int counteq(final List<Integer> A, int n){
        int N = A.size();
        int count = 0;
        for(int i = 0; i<N; i++){
            if(A.get(i)==n){
                count++;
            }
        }
        return count;
    }

}
