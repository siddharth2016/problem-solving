package exercises;

public class Car implements Comparable<Car> {

    Integer price;
    Integer speed;

    @Override
    public int compareTo(Car o) {
        return Integer.compare(this.speed, ((Car) o).speed);
    }
}
