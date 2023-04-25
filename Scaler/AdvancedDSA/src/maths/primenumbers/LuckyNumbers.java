package src.maths.primenumbers;

public class LuckyNumbers {

    public int[] generateSieve(int num) {
        int[] result = new int[num+1];
        result[0] = result[1] = 0;
        for(int i=2; i*2<=num; i++) {
            if(result[i] == 0) {
                for(int j=i*2; j<=num; j=j+i) {
                    result[j] += 1;
                }
            }
        }
        return result;
    }

    public int solve(int A) {
        int[] sieve = generateSieve(A);
        int count = 0;
        for(int elem: sieve) {
            if(elem == 2) count++;
        }
        return count;
    }

}
