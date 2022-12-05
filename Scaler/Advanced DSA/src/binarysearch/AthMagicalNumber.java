package src.binarysearch;

public class AthMagicalNumber {

    public static void main(String[] args) {
        System.out.println(solve(19, 11, 13));
    }

    public static long gcd(long a, long b) {
        if(a == 0) return b;
        return gcd(b%a, a);
    }

    public static long check(long a, long b, long c, long m) {
        long countB = m/b;
        long countC = m/c;
        long lcm = (c * b) / gcd(b, c);
        long both = m/lcm;
        return countB + countC - both;
    }

    public static int solve(int A, int B, int C) {
        long s = (long)Math.min(B, C);
        long e = (long)A * (long)B * (long)C;
        long ans = s;
        while(s <= e) {
            long mid = s + (e-s)/2;
            System.out.println(s + " " + mid + " " + e);
            long total = check((long)A, (long)B, (long)C, mid);
            if(total == A) {
                ans = mid;
                e = mid - 1;
            }
            else if (total < A) s = mid + 1;
            else e = mid - 1;
            System.out.println("total " + total + " ans " + ans);
        }
        return (int)(ans % 1000000007);
    }

}
