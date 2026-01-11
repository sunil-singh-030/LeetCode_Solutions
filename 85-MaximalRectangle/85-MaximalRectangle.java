// Last updated: 1/11/2026, 7:44:06 AM
1class Solution {
2    public int maximalRectangle(char[][] matrix) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5        int[] sumcol = new int[n];
6        int maxRectangle = 0;
7        for (int i=0 ; i<m ; i++){
8            for (int j=0 ; j<n ; j++){
9                if (matrix[i][j]-'0'==0){
10                    sumcol[j] = 0;
11                }
12                else{
13                    sumcol[j]++;
14                }
15            }
16            int[] dp = new int[n];
17            Arrays.fill(dp,-1);
18            maxRectangle = Math.max(maxRectangle,maxRecArea(n,sumcol,0,dp));
19        }
20        return maxRectangle;
21    }
22    public static int maxRecArea(int n, int[] arr, int i, int[] dp){
23        if (i==n){
24            return 0;
25        }
26        if (dp[i]!=-1){
27            return dp[i];
28        }
29        int ans = 0;
30        int min = Integer.MAX_VALUE;
31        for (int ind=i ; ind<n ; ind++){
32            min = Math.min(min,arr[ind]);
33            ans = Math.max(ans,Math.max(min*(ind-i+1),maxRecArea(n,arr,ind+1,dp)));
34        }
35        return  dp[i] = ans;
36    }
37}