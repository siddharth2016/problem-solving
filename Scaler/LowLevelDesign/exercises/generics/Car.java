package exercises.generics;

public class Car implements Comparable<Car> {

    public int speed;
    public int power;

    public Car(int speed, int power){
        this.speed = speed;
        this.power = power;
    }

    @Override
    public String toString() {
        return "[S=" + this.speed + ", P=" + this.power + "]";
    }

    @Override
    public int compareTo(Car o) {
        return this.speed - o.speed;
    }
}
