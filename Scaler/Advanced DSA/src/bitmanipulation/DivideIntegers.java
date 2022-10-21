package src.bitmanipulation;

public class DivideIntegers {

    public int divide(int A, int B) {
        boolean sign = (A<0) ^ (B<0);
        long answer = 0;
        long tempA = Math.abs(A * 1L);
        long tempB = Math.abs(B * 1L);

        for (int i = 31; i >= 0; i--) {
            long power = (long) tempB<< i;
            while (power<= tempA) {
                tempA -= power;
                answer += (1l<< i);
            }
        }
        if (answer >= Integer.MAX_VALUE)
            return (sign ? -Integer.MIN_VALUE : Integer.MAX_VALUE);
        if (sign)
            return (int) answer * -1;
        return (int) answer;
    }

}
