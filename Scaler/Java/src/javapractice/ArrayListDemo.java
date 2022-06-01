package javapractice;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(5);

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(1, 20);
        arrayList.add(0);

        System.out.println(arrayList.size());
        System.out.println(arrayList);

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));

        arrayList.set(1, 24);
        System.out.println(arrayList);

        arrayList.remove(1);
        System.out.println(arrayList);

        if(!arrayList.contains(24)) {
            System.out.println("Does not contain 24");
        }
    }

}
