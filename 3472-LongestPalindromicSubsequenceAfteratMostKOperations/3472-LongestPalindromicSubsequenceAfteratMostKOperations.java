// Last updated: 10/1/2025, 3:05:28 PM
class Solution {
    public int longestPalindromicSubsequence(String s, int k) {
        int n = s.length();
        int[][][] dp = new int[n][n][k+1];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                Arrays.fill(dp[i][j], -1);

        return lps(s, 0, n - 1, k, dp);
    }

    private int lps(String s, int i, int j, int moveLeft, int[][][] dp) {
        if (i > j) return 0;
        if (i == j) return 1;

        if (dp[i][j][moveLeft] != -1) return dp[i][j][moveLeft];

        if (s.charAt(i) == s.charAt(j)) {
            dp[i][j][moveLeft] = 2 + lps(s, i + 1, j - 1, moveLeft, dp);
        } else {
            int withoutChange = Math.max(
                lps(s, i + 1, j, moveLeft, dp),
                lps(s, i, j - 1, moveLeft, dp)
            );

            int withChange = 0;
            int diff = Math.abs(s.charAt(i) - s.charAt(j));
            int req = Math.min(diff, 26 - diff);

            if (moveLeft >= req) {
                withChange = 2 + lps(s, i + 1, j - 1, moveLeft - req, dp);
            }

            dp[i][j][moveLeft] = Math.max(withoutChange, withChange);
        }

        return dp[i][j][moveLeft];
    }
}
