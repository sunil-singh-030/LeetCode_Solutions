// Last updated: 5/1/2026, 8:52:10 AM
1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        int m = text1.length();
4        int n = text2.length();
5        int[] prev = new int[n+1];
6        int[] curr = new int[n+1];
7        
8        for (int i=1 ; i<=m ; i++){
9            for (int j=1 ; j<=n ; j++){
10                char ch1 = text1.charAt(i-1);
11                char ch2 = text2.charAt(j-1);
12                if (ch1==ch2){
13                    curr[j] = 1 + prev[j-1];
14                }
15                else{
16                    curr[j] = Math.max(prev[j],curr[j-1]);
17                }
18            }
19            prev = curr.clone();
20        }
21        return curr[n];
22    }
23    
24}