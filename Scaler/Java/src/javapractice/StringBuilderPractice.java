package javapractice;

public class StringBuilderPractice {

    public static void appendString(int n) {
        String s = "";
        for(int i=0; i<n; i++) {
            s = s + "A";
        }
    }

    public static void appendStringBuilder(int n) {
        StringBuilder sb = new StringBuilder();
        sb.ensureCapacity(n);
        for(int i=0; i<n; i++) {
            sb.append("A");
        }
    }

    public static void main(String[] args) {
        int n = 10000;
        long startTime = System.currentTimeMillis();
        appendStringBuilder(n);
        long endTime = System.currentTimeMillis();
        System.out.println("Time StringBuilder Took - " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        appendString(n);
        endTime = System.currentTimeMillis();
        System.out.println("Time String Took - " + (endTime - startTime));
    }

}
