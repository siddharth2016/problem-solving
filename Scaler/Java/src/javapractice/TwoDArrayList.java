package javapractice;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoDArrayList {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        ArrayList<Integer> row0 = new ArrayList<>();
        row0.add(1);
        row0.add(2);
        row0.add(3);

        arrayList.add(row0);

        ArrayList<Integer> row1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        arrayList.add(row1);

        arrayList.add(new ArrayList<>(Arrays.asList(10, 11, 12)));

        System.out.println(arrayList);
        System.out.println(arrayList.get(0));
    }

}
