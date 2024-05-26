package src.lld1.accessmodifiers.package2;

import src.lld1.accessmodifiers.classes.Student;

public class AnotherStudent extends Student {
    public void main(String[] args) {
        System.out.println(super.name);
        System.out.println(super.marks);
//        System.out.println(super.grade);
//        System.out.println(super.age);
    }
}
