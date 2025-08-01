// Last updated: 8/1/2025, 7:09:17 AM
class Solution {
    public int maxCoins(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        ls.add(1);
        for (int num : nums){
            ls.add(num);
        }
        ls.add(1);
        int n = ls.size();
        int[][] dp = new int[n][n];
        for (int i=n-1 ; i>=0 ; i--){
            for (int j=i+2 ; j<n ; j++){
                int maxcoins = 0;
                for (int ind=i+1 ; ind<j ; ind++){
                    int coins = dp[i][ind] + dp[ind][j] + ls.get(i)*ls.get(ind)*ls.get(j);
                    maxcoins = Math.max(maxcoins,coins);
                }
                dp[i][j] = maxcoins;
            }
        }
        return dp[0][n-1];
    }
}