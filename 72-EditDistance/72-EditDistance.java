// Last updated: 1/4/2026, 12:25:28 PM
1class Solution {
2    public int minDistance(String word1, String word2) {
3        int n = word1.length();
4        int m = word2.length();
5        if (n==0){
6            return m;
7        }
8        if (m==0){
9            return n;
10        }
11        int[] curr = new int[m+1];
12        int[] prev = new int[m+1];
13        for (int i=0 ; i<=m ; i++){
14            prev[i] = i;
15        }
16        for (int i=1 ; i<=n ; i++){
17            for (int j=0 ; j<=m ; j++){
18                if (j==0){
19                    curr[j] = i;
20                    continue;
21                }
22                if (word1.charAt(i-1)==word2.charAt(j-1)){
23                    curr[j] = prev[j-1];
24                }
25                else{
26                    int ans1 = 1 + prev[j];
27                    int ans2 = 1 + prev[j-1];
28                    int ans3 = 1 + curr[j-1];
29                    curr[j] =  Math.min(Math.min(ans1,ans2),ans3);
30                }
31            }
32            prev = curr.clone();
33        }
34        return curr[m];
35    }
36}