package src.lld1.polymorphism;

public class Main {

    public static void main(String[] args) {
        Animal a = new Dog();
        System.out.println(a.prop1());
        System.out.println(((Dog)a).prop2());
        System.out.println(
                a.prop1(true)
        );
        System.out.println(((Dog)a).a);
    }

}
