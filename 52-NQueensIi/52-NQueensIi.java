// Last updated: 8/1/2025, 7:12:13 AM
class Solution {
    static int cnt = 0;
    public int totalNQueens(int n) {
        cnt = 0;
        int[][] board = new int[n][n];
        allway(board,0);
        return cnt;
    }
    private void allway(int[][] board, int queen) {
        int n = board.length;
        if (queen == n) {
            cnt++;
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isvalid(board, queen, col)) {
                board[queen][col] = 1;
                allway(board, queen + 1);
                board[queen][col] = 0;
            }
        }
    }

    private boolean isvalid(int[][] board, int row, int col) {
        int n = board.length;

        // Check vertical column
        for (int r = 0; r < row; r++) {
            if (board[r][col] == 1) {
                return false;
            }
        }

        // Check left diagonal
        for (int r = row - 1, c = col - 1; r >= 0 && c >= 0; r--, c--) {
            if (board[r][c] == 1) {
                return false;
            }
        }

        // Check right diagonal
        for (int r = row - 1, c = col + 1; r >= 0 && c < n; r--, c++) {
            if (board[r][c] == 1) {
                return false;
            }
        }

        return true;
    }
}