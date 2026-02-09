// Last updated: 2/9/2026, 12:13:17 PM
1class Solution {
2    public long maxScore(int[] nums1, int[] nums2, int k) {
3        long[][][] dp = new long[nums1.length][nums2.length][k+1];
4        for (long[][] a : dp){
5            for (long[] b : a){
6                Arrays.fill(b,Long.MIN_VALUE);
7            }
8        }
9        return jaiBabaKi(nums1, nums2, 0, 0, k,dp);
10    }
11
12    public long jaiBabaKi(int[] n1, int[] n2, int i, int j, int k, long[][][] dp) {
13        if (k == 0) return 0;
14        if (Math.min(n1.length-i,n2.length-j)<k){
15            return Long.MIN_VALUE;
16        }
17        if (i >= n1.length || j >= n2.length) {
18            return Long.MIN_VALUE;
19        }
20        if (dp[i][j][k]!=Long.MIN_VALUE){
21            return dp[i][j][k];
22        }
23        long take = Long.MIN_VALUE;
24        long next = jaiBabaKi(n1, n2, i + 1, j + 1, k - 1,dp);
25
26        
27        if (next != Long.MIN_VALUE) {
28            take = (long) n1[i] * n2[j] + next;
29        }
30
31        long notake1 = jaiBabaKi(n1, n2, i + 1, j, k,dp);
32        long notake2 = jaiBabaKi(n1, n2, i, j + 1, k,dp);
33
34        return dp[i][j][k] = Math.max(take, Math.max(notake1, notake2));
35    }
36}
37