// Last updated: 8/1/2025, 7:12:35 AM
class Solution {
    public void solveSudoku(char[][] board) {
        sol(board, 0, 0);
    }

    public static boolean sol(char[][] board, int row, int col) {
        if (col == 9) { 
            col = 0;
            row++;
        }
        if (row == 9) {  
            return true; // Successfully solved
        }

        if (board[row][col] != '.') {
            return sol(board, row, col + 1);
        }

        for (int i = 1; i <= 9; i++) {
            char ch = (char) (i + '0');  // Convert to '1'-'9'

            if (isValid(board, row, col, ch)) {
                board[row][col] = ch;

                if (sol(board, row, col + 1)) { // If solution is found, return true
                    return true;
                }

                board[row][col] = '.'; // Backtrack
            }
        }
        return false; // No valid number found
    }

    public static boolean isValid(char[][] board, int row, int col, char ch) {
        for (int r = 0; r < 9; r++) {
            if (board[r][col] == ch) return false;  // Check column
        }
        for (int c = 0; c < 9; c++) {
            if (board[row][c] == ch) return false;  // Check row
        }

        int rStart = row - row % 3, cStart = col - col % 3;
        for (int i = rStart; i < rStart + 3; i++) {
            for (int j = cStart; j < cStart + 3; j++) {
                if (board[i][j] == ch) return false; // Check 3x3 box
            }
        }
        return true;
    }
}
