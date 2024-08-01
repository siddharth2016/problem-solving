package src.lld1.inheritance;

import src.lld1.inheritance.chaining.D;

public class Main {

    public static void main(String[] args) {
        Student s = new Student();
        // System.out.println(s.name); // not accessible if private
        // System.out.println(s.name); // accessible if public

        D d = new D();
//        C c = new C("sid");

    }

}
