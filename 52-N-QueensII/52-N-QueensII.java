// Last updated: 10/3/2025, 11:18:53 AM
import java.util.ArrayList;
import java.util.List;

class Solution {
    
    public int totalNQueens(int n) {
        int[] cnt = new int[1];
        int[][] grid = new int[n][n];
        allPossWay(grid,0,new ArrayList<>(),cnt);
        return cnt[0];
    }
    public void allPossWay(int[][] grid, int idx, List<String> ls, int[] cnt){
        if (idx==grid.length){
            cnt[0] = cnt[0] + 1;
            return;
        }
        for (int i=0 ; i<grid.length ; i++){
            if (ispossible(grid,idx,i)){
                String str = ".".repeat(i);
                str += "Q";
                str += ".".repeat(grid.length-1-i);
                int len = ls.size();
                ls.add(str);
                grid[idx][i] = 1;
                allPossWay(grid,idx+1,ls,cnt);
                grid[idx][i] = 0;
                ls.remove(len);
            }
        }
    }
    public boolean ispossible(int[][] grid, int row, int col){
        int i = row;
        int j = col;
        i--;
        while (i>=0){
            if (grid[i][j]==1){
                return false;
            }
            i--;
        }
        i = row;
        j = col;
        i--;
        j--;
        while (i>=0 && j>=0){
            if (grid[i][j]==1){
                return false;
            }
            i--;
            j--;
        }
        i = row;
        j = col;
        i--;
        j++;
        while (i>=0 && j<grid.length){
            if (grid[i][j]==1){
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
}
