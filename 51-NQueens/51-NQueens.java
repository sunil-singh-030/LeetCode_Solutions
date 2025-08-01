// Last updated: 8/1/2025, 7:12:14 AM
import java.util.ArrayList;
import java.util.List;

class Solution {
    private List<List<String>> ls = new ArrayList<>();  // Now it's an instance variable

    public List<List<String>> solveNQueens(int n) {
        ls = new ArrayList<>();  // Create a new list for each function call
        int[][] board = new int[n][n];
        allway(board, 0, new ArrayList<>());
        return ls;
    }

    private void allway(int[][] board, int queen, List<String> ans) {
        int n = board.length;
        if (queen == n) {
            ls.add(new ArrayList<>(ans));
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isvalid(board, queen, col)) {
                board[queen][col] = 1;
                StringBuilder s = new StringBuilder();
                for (int i = 0; i < n; i++) {
                    s.append(i == col ? 'Q' : '.');
                }
                ans.add(s.toString());
                allway(board, queen + 1, ans);
                ans.remove(ans.size() - 1);
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
