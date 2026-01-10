// Last updated: 1/10/2026, 12:04:10 PM
1class Solution {
2    public int minimumDeleteSum(String s1, String s2) {
3        int[][] dp = new int[s1.length()][s2.length()];
4        for (int[] a : dp){
5            Arrays.fill(a,-1);
6        }
7        return helper(s1,s2,0,0,dp);
8    }
9    public int helper(String s1, String s2, int i, int j, int[][] dp){
10        if (i==s1.length()){
11            int ascSum = 0;
12            for (int idx=j ; idx<s2.length() ; idx++){
13                ascSum += s2.charAt(idx) - 'a';
14                ascSum += 97;
15            }
16            return ascSum;
17        }
18        if (j==s2.length()){
19            int ascSum = 0;
20            for (int idx=i ; idx<s1.length() ; idx++){
21                ascSum += s1.charAt(idx) - 'a';
22                ascSum += 97;
23            }
24            return ascSum;
25        }
26        if (dp[i][j]!=-1){
27            return dp[i][j];
28        }
29        char ch1 = s1.charAt(i);
30        char ch2 = s2.charAt(j);
31        if (ch1==ch2){
32            return dp[i][j] = helper(s1,s2,i+1,j+1,dp);
33        }
34        else{
35            int skipA = (ch1-'a') + helper(s1,s2,i+1,j,dp);
36            int skipB = (ch2-'a') + helper(s1,s2,i,j+1,dp);
37            return dp[i][j] = Math.min(skipA,skipB)+97;
38        }
39    }
40}