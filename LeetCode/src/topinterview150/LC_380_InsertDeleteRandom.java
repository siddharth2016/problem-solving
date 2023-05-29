package src.topinterview150;

import java.util.*;

public class LC_380_InsertDeleteRandom {

    static class RandomizedSet {
        private Map<Integer, Integer> map;
        private List<Integer> list;
        private Random random;
        public RandomizedSet() {
            map = new HashMap<>();
            list = new ArrayList<>();
            random = new Random();
        }

        public boolean insert(int val) {
            if(!map.containsKey(val)) {
                map.put(val, list.size());
                list.add(val);
                System.out.println(list);
                System.out.println(map);
                return true;
            }
            return false;
        }

        public boolean remove(int val) {
            if(map.containsKey(val)) {
                int index = map.get(val);
                list.set(index, list.get(list.size()-1));
                map.put(list.get(list.size()-1), index);
                list.remove(list.size()-1);
                map.remove(val);
                System.out.println(list);
                System.out.println(map);
                return true;
            }
            return false;
        }

        public int getRandom() {
            int indx = random.nextInt(list.size());
            return list.get(indx);
        }
    }

    public static void main(String[] args) {
        RandomizedSet set = new RandomizedSet();
        set.insert(0);
        set.insert(1);
        set.remove(0);
        set.insert(2);
        set.remove(1);
        System.out.println(set.getRandom());
    }



}
