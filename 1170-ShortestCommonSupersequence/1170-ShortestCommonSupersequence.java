// Last updated: 8/1/2025, 7:06:05 AM
class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int[][] dp = new int[n+1][m+1];
        for (int i=1 ; i<=n ; i++){
            for (int j=1 ; j<=m ; j++){
                if (str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    int case1 = dp[i-1][j];
                    int case2 = dp[i][j-1];
                    dp[i][j] = Math.max(case1,case2);
                }
            }
        }
        int i = n;
        int j = m;
        StringBuilder out = new StringBuilder();
        while (i>=1 &&  j>=1){
            if (str1.charAt(i-1)==str2.charAt(j-1)){
                out.append(str1.charAt(i-1));
                i--;
                j--;
            }
            else{
                if (dp[i-1][j]==dp[i][j]){
                    out.append(str1.charAt(i-1));
                    i--;
                }
                else{
                    out.append(str2.charAt(j-1));
                    j--;
                }
            }
        }
        while (i > 0) {
            out.append(str1.charAt(i - 1));
            i--;
        }

        while (j > 0) {
            out.append(str2.charAt(j - 1));
            j--;
        }
        return out.reverse().toString();
    }
    
}