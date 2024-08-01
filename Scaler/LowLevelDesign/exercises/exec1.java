package exercises;

import java.util.Stack;

public class exec1 {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);

        // Make a call to display method as per question requirements here
        display(st);

    }

    // Write the display method as per requirements of question here
    public static void display(Iterable<?> list) {
        for(Object val: list) {
            System.out.println(val);
        }
    }

}
