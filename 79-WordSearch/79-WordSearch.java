// Last updated: 9/29/2025, 1:48:24 PM
class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for (int i=0 ; i<m ; i++){
            for (int j=0 ; j<n ; j++){
                int[][] isvalid = new int[m][n];
                boolean[] found = new boolean[1];
                if (isExist(board,i,j,word,0,isvalid,found)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isExist(char[][] board, int i, int j, String word, int idx, int[][] isvalid, boolean[] found ){
        if (found[0]){
            return true;
        }
        if (idx==word.length()){
            return true;
        }
        if (i<0 || i>=board.length || j<0 || j>=board[0].length || isvalid[i][j]==1){
            return false;
        }
        
        if (board[i][j]==word.charAt(idx)){
            isvalid[i][j] = 1;
            int[] r = {0,1,0,-1};
            int[] c = {1,0,-1,0};
            for (int k=0 ; k<4 ; k++){
                boolean currans = isExist(board,i+r[k],j+c[k],word,idx+1,isvalid,found);
                if (currans){
                    found[0] = true;
                    return true;
                }
            }
            isvalid[i][j] = 0;
        }
        return false;
    }
    
}