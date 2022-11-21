package src.sorting.two;

public class LargestNumber {

    public String largestNumber(final List<Integer> A) {
        Collections.sort(A, (a, b) -> {
            String val1 = "" + a + b;
            String val2 = "" + b + a;
            return val2.compareTo(val1);
        });
        StringBuilder sb = new StringBuilder();
        for(Integer val: A) {
            sb.append(val);
        }
        String result = sb.toString();
        return result.charAt(0) == '0' ? "0" : result;
    }

}
