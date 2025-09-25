// Last updated: 9/25/2025, 8:02:39 AM
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] dp = new int[n];
        for (int i=n-1 ; i>=0 ; i--){
            for (int j=0 ; j<=i ; j++){
                if (i==n-1){
                    dp[j] = triangle.get(i).get(j);
                    continue;
                }
                int min = Math.min(dp[j],dp[j+1]);
                dp[j] = triangle.get(i).get(j) + min;
            }
        }
        return dp[0];
    }
    
}