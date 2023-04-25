package src.queue;

import java.util.Deque;
import java.util.LinkedList;

public class PerfectNumbers {

    static class Pattern {
        String first;
        String second;
        public Pattern(String first, String second) {
            this.first = first;
            this.second = second;
        }

        public String join() {
            return this.first + this.second;
        }
    }

    public String solve(int A) {
        Pattern initial = new Pattern("1", "1");
        Pattern secondary = new Pattern("2", "2");
        if(A==1) return initial.join();
        if(A==2) return secondary.join();

        Deque<Pattern> result = new LinkedList<>();
        result.addLast(initial);
        result.addLast(secondary);

        int count = 2;

        while(count < A) {
            Pattern head = result.peekFirst();
            Pattern temp = new Pattern(head.first + "1", "1" + head.second);
            count++;
            if(count >= A) return temp.join();
            result.addLast(temp);
            temp = new Pattern(head.first + "2", "2" + head.second);
            count++;
            if(count >= A) return temp.join();
            result.addLast(temp);
            result.removeFirst();
        }

        return "";
    }

}
