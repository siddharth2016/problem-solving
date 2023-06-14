package src.java;

import java.util.ArrayList;

public class Generics {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        ((ArrayList) list).add("String");
        System.out.println(list);
    }

}
