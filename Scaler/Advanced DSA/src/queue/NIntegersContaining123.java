package src.queue;

import java.util.Deque;
import java.util.LinkedList;

public class NIntegersContaining123 {

    static class Number {
        String value;

        public Number(String value) {
            this.value = value;
        }

        public int getInt() {
            return Integer.parseInt(this.value);
        }
    }

    public int[] solve(int A) {
        int[] result = new int[A];
        Deque<Number> dq = new LinkedList<>();

        if(A == 1) {
            result[0] = 1;
        }
        else if(A == 2) {
            result[0] = 1;
            result[1] = 2;
        }
        else if(A == 3) {
            result[0] = 1;
            result[1] = 2;
            result[2] = 3;
        }
        else {
            dq.addLast(new Number("1"));
            dq.addLast(new Number("2"));
            dq.addLast(new Number("3"));
            int i = 0;
            int count = 3;

            while(count < A) {
                Number front = dq.peekFirst();
                dq.addLast(new Number(front.value + "1")); count++;
                if(count >= A) break;
                dq.addLast(new Number(front.value + "2")); count++;
                if(count >= A) break;
                dq.addLast(new Number(front.value + "3")); count++;
                if(count >= A) break;
                dq.removeFirst();
                result[i] = front.getInt(); i++;
            }

            while(dq.size() != 0) {
                result[i] = dq.peekFirst().getInt(); i++;
                dq.removeFirst();
            }
        }

        return result;
    }

}
