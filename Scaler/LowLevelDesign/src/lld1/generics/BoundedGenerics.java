package src.lld1.generics;

import java.util.ArrayList;
import java.util.List;

public class BoundedGenerics {

    public static void main(String[] args) {
        List<Integer> intList = List.of(1,2,3,4,5,5,6);
        List<Long> longList = List.of(1l,2l,3l,4l,5l,5l,6l);
        List<Double> doubleList = List.of(1.1, 2.2, 3.3, 4.4, 5.5,6.9);
        List<Number> numberList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();
        System.out.println(doSum(intList));
        System.out.println(doSum(longList));
        System.out.println(doSum(doubleList));
        doAppend(numberList, 1);
        doAppend(objectList, 2);
        doPrint(numberList);
        doPrint(objectList);


    }

    private static Integer doSum(List<? extends Number> list) {
        int sum = 0;
        for(Number n: list) {
            sum += n.intValue();
        }
        return sum;
    }

    private static void doAppend(List<? super Integer> list, Integer value) {
        list.add(value);
    }

    private static void doPrint(List<?> list) {
        System.out.println(list);
    }
}
