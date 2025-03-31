package src.lld3.tictactoe;

public interface SolutionStrategy {

    WinStatus isWinner(Board board, Move move);
    void undoMove(Board board, Move move);

}
