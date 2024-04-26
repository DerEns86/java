package de.v_ens.interfaces.gameExercise;

public class GameBoard {

    private static final int SIZE = 10; // Define the size of the gameboard
    private char[][] board;

    public GameBoard() {
        board = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = '-'; // Initialize all positions as empty
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
