// Last updated: 7/21/2026, 9:53:33 PM
1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        
4        int m = text1.length();
5        int n = text2.length();
6        
7        int[] prev = new int[n+1];
8        int[] curr = new int[n+1];
9        
10        for (int i=m-1 ; i>=0 ; i--){
11            for (int j=n-1 ; j>=0 ; j--){
12                char ch1 = text1.charAt(i);
13                char ch2 = text2.charAt(j);
14
15                if (ch1==ch2){
16                    curr[j] = 1 + prev[j+1];
17                }
18                else{
19                    int skipA = 0 + prev[j];
20                    int skipB = 0 + curr[j+1];
21                    
22                    curr[j] = Math.max(skipA,skipB);
23                }
24            }
25            prev = curr.clone();
26        }
27        
28        return curr[0];
29    }
30
31    
32
33}