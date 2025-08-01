// Last updated: 8/1/2025, 7:12:36 AM
class Solution {
    public boolean isValidSudoku(char[][] board) {
        return sol(board,0,0);
    }
    public static boolean sol(char[][] board, int row, int col) {
        if (col == 9) { 
            col = 0;
            row++;
        }
        if (row == 9) {  
            return true; 
        }

        if (board[row][col] == '.' || isValid(board,row,col)) {
            return sol(board, row, col + 1);
        }
        return false;
        
    }
    public static boolean isValid(char[][] board, int row, int col) {
        char ch = board[row][col];
        board[row][col] = '.';
        for (int r = 0; r < 9; r++) {
            if (board[r][col] == ch) return false;  
        }
        for (int c = 0; c < 9; c++) {
            if (board[row][c] == ch) return false;  
        }

        int rStart = row - row % 3, cStart = col - col % 3;
        for (int i = rStart; i < rStart + 3; i++) {
            for (int j = cStart; j < cStart + 3; j++) {
                if (board[i][j] == ch) return false; 
            }
        }
        board[row][col] = ch;
        return true;
    }
}