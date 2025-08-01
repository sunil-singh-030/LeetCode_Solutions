// Last updated: 8/1/2025, 7:11:44 AM
class Solution {
    static boolean flag = false;
    public boolean exist(char[][] board, String word) {
        flag = false;
        List<Integer> row = new ArrayList<>();
        List<Integer> col = new ArrayList<>();
        for (int i=0 ; i<board.length ; i++){
            for (int j=0 ; j<board[0].length ; j++){
                if (board[i][j]==word.charAt(0)){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        int [][] grid = new int[board.length][board[0].length];
        for (int i=0 ; i<row.size() ; i++){
            check(board,grid,row.get(i),col.get(i),word,0);
            if (flag){
                return true;
            }
        }
        return false;
    }
    public static void check(char [][] board , int [][] grid , int r , int c , String s , int index ){
        if (index == s.length()){
            flag = true;
            return;
        }
        if (r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]==1){
            return;
        }
        if (board[r][c]!=s.charAt(index)){
            return;
        }
        grid[r][c] = 1;
        int [] rarr = {-1,0,1,0};
        int [] carr = {0,-1,0,1};
        for (int i=0 ; i<rarr.length ; i++){
            check(board,grid,r+rarr[i],c+carr[i],s,index+1);
            if (flag){
                return;
            }
        }
        grid[r][c] = 0;
    }
}