package src.maths.combinatorics;

public class ComputeNCRmodM {

    public int solve(int A, int B, int C) {
        int[] prev = new int[B+1];
        int[] curr = new int[B+1];
        prev[0]=1;
        curr[0]=1;
        for(int i=1;i<=A;i++){
            for(int j=1;j<=B;j++){
                curr[j]=(prev[j]+prev[j-1])%C;
            }
            prev = curr.clone();
        }
        return curr[B];
    }

}
