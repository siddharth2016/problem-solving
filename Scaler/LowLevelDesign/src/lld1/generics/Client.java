package src.lld1.generics;

public class Client {

    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Siddharth", 2);
        Pair<Integer, String> pair2 = new Pair<>(1, "Abhishek");
        Pair<Pair<Integer, Integer>, Integer> pair3 = new Pair<>(new Pair<>(1, 2), 3);
        Pair pair4 = new Pair<>('q', 10);

        System.out.println(pair1);
        System.out.println(pair2);
        System.out.println(pair3);
        System.out.println(pair4);
    }

}
