package javapractice.oopsgame;

public class Game {
    private int expectedGuess;
    private Player p1, p2, p3;

    public Game(String name1, String name2, String name3) {
        p1 = new Player(name1);
        p2 = new Player(name2);
        p3 = new Player(name3);
    }

    private void playerGuesses() {
        p1.makeGuess();
        p2.makeGuess();
        p3.makeGuess();
    }

    private boolean checkWinner() {
        if(p1.getGuess() == expectedGuess) {
            System.out.println("Player 1, " + p1.getName() + " wins.");
            return true;
        }
        else if(p2.getGuess() == expectedGuess) {
            System.out.println("Player 2, " + p2.getName() + " wins.");
            return true;
        }
        else if(p3.getGuess() == expectedGuess) {
            System.out.println("Player 3, " + p3.getName() + " wins.");
            return true;
        }
        return false;
    }

    public void startGame() {
        while(true) {
            expectedGuess = (int) (Math.random() * 10);
            playerGuesses();
            if (checkWinner()) {
                break;
            }
        }
    }
}
