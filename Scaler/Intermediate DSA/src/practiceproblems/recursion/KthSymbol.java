package practiceproblems.recursion;

public class KthSymbol {

//    public static long constructN(long N, long A, long C) {
//        System.out.println(N);
//        if(A == C) return N;
//        long temp = N << (1L << (C-1));
//        long mask = N ^ ((1L << (1L << (C-1))) - 1);
//        return constructN(temp ^ mask, A, C+1);
//    }
//
//    public static long bitsN(long N, long bits) {
////        System.out.println(N + " " + bits);
//        if(N == 0) return bits;
//        return bitsN(N / 2, bits + 1);
//    }
//
//    public static int solve(int A, int B) {
//        long result = constructN(0, A, 1);
////        System.out.println(result);
//        long shift = bitsN(result, 1) - B;
////        System.out.println(shift);
//        return (int)(result >> shift) & 1;
//    }

    public static String constructN2(StringBuilder str, int A) {
        if(A == 1) return str.toString();
        StringBuilder sb = new StringBuilder();
        for(char chr: str.toString().toCharArray()) {
            if(chr == '0') sb.append("01");
            else sb.append("10");
        }
        return constructN2(sb, A-1);
    }

    public static int solve(int A, int B) {
        return constructN2(new StringBuilder("0"), A).charAt(B-1) - '0';
    }

    public static void main(String[] args) {
        System.out.println(solve(1, 1));
    }

}
