package practiceproblems.recursion;

public class FindFibo2 {

    public int findAthFibonacci(int A) {
        if(A==0) return 0;
        if (A==1) return 1;
        return findAthFibonacci(A-1) + findAthFibonacci(A-2);
    }

}
