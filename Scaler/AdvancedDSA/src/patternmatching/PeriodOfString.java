package src.patternmatching;

public class PeriodOfString {

    public static int[] LPS(String p){
        int N=p.length();
        int[] lps = new int[N];
        lps[0] = 0;
        int len = 0;
        int i = 1;
        while(i<N){
            if(p.charAt(i) == p.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }
            else{
                if(len != 0)
                    len = lps[len-1];
                else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    public int solve(String A) {
        int c0=0,c2=0;
        int lps[]=new int[A.length()];
        lps=LPS(A);
        for(int i=0;i<A.length();i++){
            if(lps[i]==0)c0=i;//string failed
            if(lps[i]==2)c2=i;//string started forming
        }
        if(c0<c2)return c2-1;
        return c0+1;
    }

}
