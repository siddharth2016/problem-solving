package exercises.generics;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetUsage {
    public static void main(String[] args) {

    }

    public Integer getJustLarger(TreeSet<Integer> treeSet, int data){
        // write the code to return value equal to or just larger than data
        Iterator<Integer> itr = treeSet.iterator();
        while(itr.hasNext()) {
            int d = itr.next();
            if(d >= data) return d;
        }
        return 0;
    }

    public Integer getJustSmaller(TreeSet<Integer> treeSet, int data) {
        // write the code to return value equal to or just smaller than data
        Iterator<Integer> itr = treeSet.iterator();
        while(itr.hasNext()) {
            int d = itr.next();
            if(d <= data) return d;
        }
        return 0;
    }
}
