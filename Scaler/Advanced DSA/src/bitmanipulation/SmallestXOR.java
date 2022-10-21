package src.bitmanipulation;

public class SmallestXOR {

    public int solve(int A, int B) {
        int x=0;
        int noSetBits=0;
        for(int i=31;i>=0 ;i--)
        {
            if((A&(1<<i))!=0)
            {
                noSetBits++;
            }
        }
        if(noSetBits==B)
        {
            return A;
        }
        else if(noSetBits>B)
        {
            for(int i=31;i>=0 ;i--)
            {
                if((A&(1<<i))!=0)
                {
                    x|=1<<i;
                }

            }
            for(int i=0;i<=31 && noSetBits!=B;i++)
            {
                if((A&(1<<i))!=0)
                {
                    x&=~(1<<i);
                    noSetBits--;
                }

            }
        }
        else if(noSetBits<B)
        {
            for(int i=31;i>=0 && B>0;i--)
            {
                if((A&(1<<i))!=0)
                {
                    x|=1<<i;
                    B--;
                }

            }
            for(int i=0;i<=31 && B>0;i++)
            {
                if((A&(1<<i))==0)
                {
                    x|=1<<i;
                    B--;
                }

            }
        }
        return x;
    }

}
