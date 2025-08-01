// Last updated: 8/1/2025, 7:09:22 AM
class Solution {
    public void gameOfLife(int[][] board) {
        int [][] next=new int[board.length][board[0].length];
        for (int row=0;row<board.length;row++){
            for (int col=0;col<board[0].length;col++){
                int count=0;
                if (row+1<board.length){
                    if (board[row+1][col]==1){
                        count++;
                    }
                    if (col+1<board[0].length && board[row+1][col+1]==1){
                        count++;
                    }
                    if (col-1>=0 && board[row+1][col-1]==1){
                        count++;
                    }
                }
                if (row-1>=0){
                    if (board[row-1][col]==1){
                        count++;
                    }
                    if (col+1<board[0].length && board[row-1][col+1]==1){
                        count++;
                    }
                    if (col-1>=0 && board[row-1][col-1]==1){
                        count++;
                    }
                }
                if (col-1>=0 && board[row][col-1]==1){
                        count++;
                }
                if (col+1<board[0].length && board[row][col+1]==1){
                        count++;
                }
                next[row][col]=count;
            }
        }
        for (int row=0;row<board.length;row++){
            for (int col=0;col<board[0].length;col++){
                if (board[row][col]==0 ){
                    if (next[row][col]==3){
                        board[row][col]=1;
                    }
                }
                else{
                    if (next[row][col]<2 || next[row][col]>3){
                        board[row][col]=0;
                    }
                }
            }
        }
    }
}