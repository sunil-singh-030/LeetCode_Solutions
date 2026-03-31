// Last updated: 3/31/2026, 11:20:56 AM
1class Solution {
2    public boolean isInterleave(String s1, String s2, String s3) {
3        int n1 = s1.length();
4        int n2 = s2.length();
5        int n3 = s3.length();
6        int[][][] dp = new int[n1+1][n2+1][n3+1];
7        for (int[][] a : dp){
8            for (int[] b : a){
9                Arrays.fill(b,-1);
10            }
11        }
12        return fn(s1,s2,s3,0,0,0,dp);
13    }
14    public boolean fn(String s1, String s2, String s3, int i, int j, int k, int[][][] dp){
15        if (k==s3.length()){
16            if (i==s1.length() && j==s2.length()){
17                return true;
18            }
19            return false;
20        }
21        
22        if (dp[i][j][k]!=-1) return dp[i][j][k]==1;
23        boolean res = false;
24        if (i<s1.length() && s1.charAt(i)==s3.charAt(k)){
25            res = res || fn(s1,s2,s3,i+1,j,k+1,dp);
26        }
27        if (j<s2.length() && s2.charAt(j)==s3.charAt(k)){
28            res = res || fn(s1,s2,s3,i,j+1,k+1,dp);
29        }
30        dp[i][j][k] = res ? 1 : 0;
31        return res;
32    }
33}