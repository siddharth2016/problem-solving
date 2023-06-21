package languagemodule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlattenArray2 {

    public static void main(String[] args) {
        Object[] arr = new Object[]{1, 2, new Object[]{3, 4, new Object[]{5}, 6, 7}, 8, 9};

        Integer[] flatList = flatten(arr);

        System.out.println(Arrays.toString(flatList));
    }

    public static Integer[] flatten(Object[] arr) {
        if(arr == null) return null;

        List<Integer> result = new ArrayList<>();

        for(Object obj: arr) {
            if(obj instanceof Object[]) {
                result.addAll(Arrays.asList(flatten((Object[])obj)));
            }
            else result.add((Integer)obj);
        }

        return result.toArray(new Integer[0]);
    }

}
