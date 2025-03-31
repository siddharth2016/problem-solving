package src.lld3.tictactoe;

import java.util.*;

public class RunGame {

//    private static final SolutionStrategy winningStrategy = new SolutionON2();

//    private static final SolutionStrategy winningStrategy = new SolutionON();

    private static final SolutionStrategy winningStrategy = new SolutionO1();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Move> moves = new ArrayList<>();

        int size = 3;
        Board board = new Board(size, size);
        List<Integer> players = new ArrayList<>();
        for(int i=0; i<size-1; i++) {
            players.add(i);
        }

        WinStatus currStatus = WinStatus.NOT_YET;
        int player = 0;
        int currPlayer = players.get(player);
        System.out.println(players);

        while(WinStatus.NOT_YET.equals(currStatus)) {
            board.printBoard();
            if(!moves.isEmpty()) {
                System.out.println("Player "+ currPlayer +" Want to perform an UNDO? (Y/N): "); scanner.nextLine();
                String input = scanner.nextLine();
                if ("y".equalsIgnoreCase(input)) {
                    Move tempMove = moves.remove(moves.size() - 1);
                    board.undoMove(tempMove);
                    winningStrategy.undoMove(board, tempMove);
                    player = player - 1 < 0 ? size - 2 : player - 1;
                    currPlayer = players.get(player);
                    continue;
                }
            }

            System.out.println("Player " + currPlayer + " make your turn: ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            Move move = new Move(row, col, currPlayer);
            if(!board.validMove(move)) {
                System.out.println("Not A Valid Move, Try Again!");
                continue;
            }
            board.makeMove(move);
            moves.add(move);

            currStatus = winningStrategy.isWinner(board, move);
            if(WinStatus.WON.equals(currStatus)) {
                System.out.println("Congrats! Player " + currPlayer + " WON");
                board.printBoard();
            }
            else if(WinStatus.DRAW.equals(currStatus)) {
                System.out.println("Its a DRAW");
                board.printBoard();
            }

            player = (player + 1) % (size-1);
            currPlayer = players.get(player);
        }
    }

}
