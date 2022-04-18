package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int index = 0; index < board.length; index++) {
            if (board[index][index] == 'X' && (horizontal(board, index) || vertical(board, index))) {
                rsl = true;
                break;
            }
        }
        return rsl;
    }

    public static boolean horizontal(int[][] board, int row) {
        boolean rsl = true;
        for (int index = 0; index < board.length; index++) {
            if (board[row][index] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean vertical(int[][] board, int cell) {
        boolean rsl = true;
        for (int[] ints : board) {
            if (ints[cell] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
