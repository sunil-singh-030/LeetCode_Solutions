// Last updated: 7/21/2026, 9:46:34 PM
1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        
4        int m = text1.length();
5        int n = text2.length();
6        
7        int[][] dp = new int[m][n];
8        
9        for (int[] a : dp){
10            Arrays.fill(a,-1);
11        }
12        return helper(text1,text2,0,0,dp);
13    }
14
15    public int helper(String s1, String s2, int i, int j, int[][] dp){ 
16        
17        if (i>=s1.length() || j>=s2.length()) return 0;
18        
19        if (dp[i][j]!=-1) return dp[i][j];
20        
21        char ch1 = s1.charAt(i);
22        char ch2 = s2.charAt(j);
23
24        if (ch1==ch2){
25            return dp[i][j] = 1 + helper(s1,s2,i+1,j+1,dp);
26        }
27        else{
28            int skipA = 0 + helper(s1,s2,i+1,j,dp);
29            int skipB = 0 + helper(s1,s2,i,j+1,dp);
30            
31            return dp[i][j] = Math.max(skipA,skipB);
32        }
33        
34    }
35
36}