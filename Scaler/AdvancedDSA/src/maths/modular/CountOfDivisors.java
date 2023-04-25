package src.maths.modular;

public class CountOfDivisors {

    public int noOfDiv(int num) {
        int count = 0;
        for(int i=1; i * i <= num; i++) {
            if(i * i == num) count++;
            else if (num % i == 0) count += 2;
        }
        return count;
    }

    public int[] solve(int[] A) {
        int[] count = new int[A.length];
        for(int i=0; i<A.length; i++) {
            count[i] = noOfDiv(A[i]);
        }
        return count;
    }

}
