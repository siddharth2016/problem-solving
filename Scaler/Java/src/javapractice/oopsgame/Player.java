package javapractice.oopsgame;

public class Player {
    private final String name;
    private int guess;

    public Player(String name) {
        this.name = name;
    }

    public void makeGuess() {
        this.guess = (int) (Math.random() * 10);
        System.out.println(name + " guessed " + guess);
    }

    public int getGuess() {
        return guess;
    }

    public String getName() {
        return name;
    }
}
