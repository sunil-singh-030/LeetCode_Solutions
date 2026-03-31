// Last updated: 3/31/2026, 11:25:29 AM
1class Solution {
2    public boolean isInterleave(String s1, String s2, String s3) {
3        int n1 = s1.length();
4        int n2 = s2.length();
5        int n3 = s3.length();
6        int[][] dp = new int[n1+1][n2+1];
7        for (int[] a : dp){
8            Arrays.fill(a,-1);
9        }
10        return fn(s1,s2,s3,0,0,dp);
11    }
12    public boolean fn(String s1, String s2, String s3, int i, int j, int[][] dp){
13        if (i+j==s3.length()){
14            if (i==s1.length() && j==s2.length()){
15                return true;
16            }
17            return false;
18        }
19            
20        if (dp[i][j]!=-1) return dp[i][j]==1;
21        boolean res = false;
22        if (i<s1.length() && s1.charAt(i)==s3.charAt(i+j)){
23            res = res || fn(s1,s2,s3,i+1,j,dp);
24        }
25        if (j<s2.length() && s2.charAt(j)==s3.charAt(i+j)){
26            res = res || fn(s1,s2,s3,i,j+1,dp);
27        }
28        dp[i][j] = res ? 1 : 0;
29        return res;
30    }
31}