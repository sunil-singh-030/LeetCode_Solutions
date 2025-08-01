// Last updated: 8/1/2025, 7:04:59 AM
class Solution {
    public int minCost(int n, int[] cuts) {
        List<Integer> ls = new ArrayList<>();
        ls.add(0);
        for (int num : cuts){
            ls.add(num);
        }
        ls.add(n);
        Collections.sort(ls);
        int[][] dp = new int[ls.size()][ls.size()];
        for (int i=ls.size()-2 ; i>=1 ; i--){
            for (int j=i ; j<=ls.size()-2 ; j++){
                int ans = Integer.MAX_VALUE;
                for (int ind=i ; ind<=j ; ind++){
                    int cost = (ls.get(j+1)-ls.get(i-1)) + dp[i][ind-1] + dp[ind+1][j];
                    ans = Math.min(ans,cost);
                }
                dp[i][j] = ans;
            }
        }
        return dp[1][ls.size()-2];
    }
    public static int fn(List<Integer> ls, int i, int j,int[][] dp){
        if (i>j){
            return 0;
        }
        if (dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans = Integer.MAX_VALUE;
        for (int ind=i ; ind<=j ; ind++){
            int cost = (ls.get(j+1)-ls.get(i-1)) + fn(ls,i,ind-1,dp) + fn(ls,ind+1,j,dp);
            ans = Math.min(ans,cost);
        }
        return dp[i][j] = ans;
    }
}