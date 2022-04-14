package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int index = 0; index < board.length; index++) {
            if (Horizontal(board, index) || Vertical(board, index)) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }

    public static boolean Horizontal(int[][] board, int row) {
        boolean rsl = true;
        for (int index = 0; index < board.length; index++) {
            if (board[row][index] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean Vertical(int[][] board, int cell) {
        boolean rsl = true;
        for (int index = 0; index < board.length; index++) {
            if (board[index][cell] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
