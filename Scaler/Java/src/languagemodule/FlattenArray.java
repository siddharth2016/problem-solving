package languagemodule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlattenArray {

    public static void main(String[] args) {
        Object[] arr = new Object[]{1, 2, new Object[]{3, 4, new Object[]{"abhi", 6}}};
        flatten(arr)
                .forEach(System.out::println);

        System.out.println(flatten2(arr));

    }


    public static Stream<Object> flatten(Object[] arr) {
        return Arrays.stream(arr)
                .flatMap(obj -> obj instanceof Object[]? flatten((Object[])obj): Stream.of(obj));
    }

    public static List<Object> flatten2(Object[] arr) {
        if(arr == null) return null;
        List<Object> result = new ArrayList<>();
        for(Object obj: arr) {
            if(obj instanceof Object[]) {
                result.addAll(flatten2((Object[])obj));
            }
            else {
                result.add(obj);
            }
        }
        return result;
    }

}
