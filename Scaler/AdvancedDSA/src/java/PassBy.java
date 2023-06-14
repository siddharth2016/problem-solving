package src.java;

public class PassBy {

    static class Pair {
        int a;
        int b;
        public Pair(Pair p) {
            a = p.a;
            b = p.b;
        }

        public Pair() {}
    }

    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;

        System.out.println(a + " " + b);
        swap(a, b); // does not swap, treats wrapper classes over primitives as primitives during swap.
        System.out.println(a + " " + b);

        Pair p = new Pair();
        p.a = 5;
        p.b = 6;
        Pair copy = new Pair(p); // copy constructor
    }

    public static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }

}
