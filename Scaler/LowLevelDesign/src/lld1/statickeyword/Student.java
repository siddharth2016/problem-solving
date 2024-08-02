package src.lld1.statickeyword;

public class Student {

    static String Math_Teacher = "some teacher";
    String Science_Teacher = "other teacher";

    public void accessTeachers() {
        System.out.println(Math_Teacher);
        System.out.println(Science_Teacher);
    }

    public static void accessTeacher() {
        System.out.println(Math_Teacher);
//        System.out.println(Science_Teacher); cannot access
    }

}
