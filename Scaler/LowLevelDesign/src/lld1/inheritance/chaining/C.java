package src.lld1.inheritance.chaining;

public class C extends B {

    public C() {
        System.out.println("C Called");
    }

    public C(String name) {
        super(name);
        System.out.println("C Called with name " + name);
    }

}
