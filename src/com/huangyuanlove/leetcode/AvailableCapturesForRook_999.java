package com.huangyuanlove.leetcode;

public class AvailableCapturesForRook_999 {

    public static void main(String[] args) {

    }

    public int numRookCaptures(char[][] board) {

            int x = 0;
            int y = 0;
            int result = 0;
            boolean find = false;
            for (int i = 0; i < board.length; i++) {
                if (find) {
                    break;
                }
                for (int j = 0; j < board[i].length; j++) {
                    if (board[i][j] == 'R') {
                        x = i;
                        y = j;
                        find = true;
                        break;
                    }
                }
            }

            for (int i = x; i >= 0; i--) {
                if (board[i][y] == 'B') {
                    break;
                }
                if (board[i][y] == 'p') {
                    result++;
                    break;
                }
            }

            for (int i = x; i < board.length; i++) {
                if (board[i][y] == 'B') {
                    break;
                }
                if (board[i][y] == 'p') {
                    result++;
                    break;
                }
            }

            for (int i = y; i >= 0; i--) {
                if (board[x][i] == 'B') {
                    break;
                }
                if (board[x][i] == 'p') {
                    result++;
                    break;
                }
            }

            for (int i = y; i < board[x].length; i++) {
                if (board[x][i] == 'B') {
                    break;
                }
                if (board[x][i] == 'p') {
                    result++;
                    break;
                }
            }

            return result;

    }
}
