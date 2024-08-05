package exercises;

public class Counter {

    private int count;

    public Counter(int count) {
        this.count = count;
    }

    public synchronized void incValue(int offset) {
        count += offset;
    }

    public synchronized int getValue() {
        return count;
    }

    public synchronized void decValue(int offset) {
        count -= offset;
    }
}
