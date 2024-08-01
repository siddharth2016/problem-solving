package src.lld1.inheritance.chaining;

public class B extends A {

    public B() {
        System.out.println("B Called");
    }

    public B(String name) {
        System.out.println("B Called with name " + name);
    }
}
