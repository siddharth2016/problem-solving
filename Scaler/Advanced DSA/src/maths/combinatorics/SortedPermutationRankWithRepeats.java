package src.maths.combinatorics;

public class SortedPermutationRankWithRepeats {

    public long binpow(int A, int B, int C)
    {
        if (B==0) return 1;
        long pow=binpow(A,B/2,C)%C;
        if (B%2==0)
            return (pow*pow)%C;
        else
            return ((A*pow)%C*pow)%C;
    }
    // Calculates fact for inverse of a number
    public long inv (int n,int m) {
        if(n==0)return 1;
        return (binpow(n,m-2,m)*inv(n-1,m))%m;
    }
    // gets the index acc to 0-51 range
    public int getIdx(String x,int c){
        char ch=x.charAt(c);
        if(ch>='a' && ch<='z'){
            return ((ch-'a')+26);
        }
        return ((ch-'A'));
    }
    // factorial function
    public long fact(long n){
        long prod=1;
        for(long i=1;i<=n;i++){
            prod=(prod*i)%1000003;
        }
        return prod%1000003;
    }
    public int findRank(String A) {
        int N=A.length();
        int mod=1000003;
        long ans=0;
        int[] c=new int[52];
        // Marks occurences of all the characters of the string
        for (int i = 0; i < N; i++)
        {
            int ch=getIdx(A,i);
            c[ch]++;
        }

        for(int i=0;i<N;i++)
        {
            // iterating through each and every char of string
            int sm=getIdx(A,i);
            int n=N-1-i;
            long max=0;
            for (int j = sm-1; j >=0; j--)
            {
                // Checking if any char smaller than the ith char is present in count sort array
                long possible=0;
                if(c[j]>0)
                {
                    long temp=(fact(n)*inv(c[sm],mod))%mod;

                    for(int k=0;k<52;k++)
                    {
                        // this is used to divide temp with all the repeat occurences( if any)
                        if(c[k]>0 && k!=sm)
                        {


                            if(k==j)
                            {
                                temp*=inv(c[k]-1,mod);
                                temp%=mod;
                            }
                            else
                            {
                                temp*=inv(c[k],mod);
                                temp%=mod;
                            }

                        }
                    }

                    max=max%mod+temp;
                    max%=mod;
                }
            }
            ans=ans%mod+max;
            ans%=mod;
            // decreasing the occurence of char which we have iterated through
            c[sm]--;
        }
        return (int)ans+1;
    }

}
