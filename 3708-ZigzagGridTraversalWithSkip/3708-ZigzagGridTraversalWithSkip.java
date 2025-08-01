// Last updated: 8/1/2025, 7:01:50 AM
class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> ls=new ArrayList<>();
        int maxr=grid.length;
        int maxc=grid[0].length;
        boolean flag=true;
        int row=0;
        
        while (row<maxr){
            if (row%2==0){
                for (int i=0;i<maxc;i++){
                    if(flag){
                        ls.add(grid[row][i]);
                        flag=false;
                    }
                    else{
                        flag=true;
                    }
                }
            }
            else{
                for (int i=maxc-1;i>=0;i--){
                    if(flag){
                        ls.add(grid[row][i]);
                        flag=false;
                    }
                    else{
                        flag=true;
                    }
                }
            }
            row++;
        }
        return ls;
    }
}