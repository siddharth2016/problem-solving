package practiceproblems.linkedlist;

import java.util.ArrayList;

public class FlattenedNestedListIterator {

//     public static void main(String[] args) {

//     }

//     // This is the interface that allows for creating nested lists.
//     // You should not implement it, or speculate about its implementation.
     class NestedInteger {

         NestedInteger(int x) {
         }

         // Return true if this NestedInteger holds a single integer, rather than a nested list.
         boolean isInteger() {
             return true;
         }

         // Return the single integer that this NestedInteger holds, if it holds a single integer.
         // The result is 1e9 if this NestedInteger holds a nested list.
         int getInteger() {
            return 1;
         }

         // Return the nested list that this NestedInteger holds, if it holds a nested list.
         // The result is an empty ArrayList if this NestedInteger holds a single integer.
         ArrayList<NestedInteger> getList() {
            return new ArrayList<>();
         }
     }

    class NestedIterator {

        public ArrayList<Integer> result;
        public int counter;

        NestedIterator(ArrayList<NestedInteger> nestedList) {
            counter = 0;
            result = new ArrayList<>();
            for(NestedInteger elem: nestedList) {
                helper(elem);
            }
        }

        int next() {
            return result.get(counter++);
        }

        boolean hasNext() {
            return counter < result.size();
        }

        void helper(NestedInteger elem) {
            if(elem.isInteger()) result.add(elem.getInteger());
            else {
                for(NestedInteger item: elem.getList()) {
                    helper(item);
                }
            }
        }
    }

}
