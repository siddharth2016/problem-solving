package src.lld1.collections;

import java.util.*;

public class Client {

    public static void main(String[] args) {
        Set<Integer> integerHashSet = new HashSet<>();
        Set<Integer> integerTreeSet = new TreeSet<>();
        SortedSet<Integer> sortedSet = new TreeSet<>();
        Set<Integer> linkSet = new LinkedHashSet<>();
        Set<Names> enumSet = EnumSet.allOf(Names.class);
        System.out.println(enumSet);

        Queue<Integer> integerQueue = new LinkedList<>();
        Deque<Integer> integerDeque = new LinkedList<>();

        List<Integer> integerList = new ArrayList<>();
        List<Integer> integerList1 = new LinkedList<>();
        List<Integer> integerList2 = new Stack<>();
        Stack<Integer> integerStack = new Stack<>();

        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new TreeMap<>();
        Map<Integer, Integer> map3 = new LinkedHashMap<>();
    }

}

enum Names {
    SIDDHARTH,
    ABISHEK
}
