package src.binarysearch;

public class PainterPartitionProblem {

    public static void main(String[] args) {
        System.out.println(paint(3, 10, new int[] {185, 186, 938, 558, 655, 461, 441, 234, 902, 681}));
    }

    public static long max(int[] arr, int B) {
        long maxElem = Long.MIN_VALUE;
        for(int val: arr) {
            if((long)val * (long)B > maxElem) maxElem = (long)val * (long)B;
        }
        return maxElem;
    }

    public static long sumOf(int[] arr, int B) {
        long sum = 0l;
        for(int val: arr) {
            sum = sum + (long)val * (long)B;
        }
        return sum;
    }

    public static boolean checkIfPoss(int A, int B, int[] arr, long mid) {
        int count = 1;
        long sum = 0;
        for(int val: arr) {
            if(sum + (long)val * (long)B <= mid) {
                sum = sum + (long)val * (long)B;
            }
            else {
                count++;
                sum = (long)val * (long)B;
                if(count > A) return false;
            }
        }
        return true;
    }

    public static int paint(int A, int B, int[] C) {
        int mod = (int)Math.pow(10, 7) + 3;
        long s = max(C, B);
        long e = sumOf(C, B);
        long ans = 0l;
        System.out.println(s + " " + e);
        while(s <= e) {
            long mid = s + (e-s)/2;
            if(checkIfPoss(A, B, C, mid)) {
                ans = mid;
                e = mid - 1;
            }
            else s = mid + 1;
        }
        return (int)(ans % mod);
    }

}
