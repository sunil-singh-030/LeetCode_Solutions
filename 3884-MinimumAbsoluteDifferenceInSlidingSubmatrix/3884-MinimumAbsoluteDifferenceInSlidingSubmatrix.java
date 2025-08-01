// Last updated: 8/1/2025, 7:01:04 AM
class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] out = new int[m-k+1][n-k+1];
        for (int i=0 ; i<out.length ; i++){
            for (int j=0 ; j<out[0].length ; j++){
                List<Integer> ls = new ArrayList<>();
                for (int row=i ; row<i+k ; row++){
                    for (int col=j ; col<j+k ; col++){
                        ls.add(grid[row][col]);
                    }
                }
                Collections.sort(ls);
                int ans = Integer.MAX_VALUE;
                for (int s=0 ; s<ls.size()-1 ; s++){
                    int diff = Math.abs(ls.get(s)-ls.get(s+1));
                    if (diff!=0){
                        ans = Math.min(ans,diff);
                    }
                }
                if (ans==Integer.MAX_VALUE){
                    ans = 0;
                }
                out[i][j] = ans;
            }
        }
        return out;
    }
}