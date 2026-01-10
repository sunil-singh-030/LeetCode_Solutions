// Last updated: 1/10/2026, 12:33:21 PM
1class Solution {
2    public int minimumDeleteSum(String s1, String s2) {
3        int m = s1.length();
4        int n = s2.length();
5        int[] prev = new int[n+1];
6        for (int i=n-1 ; i>=0 ; i--){
7            prev[i] = prev[i+1] + 97 + (s2.charAt(i)-'a');
8        }
9        int[] curr = new int[n+1];
10        int ascSum = 0;
11        for (int i=m-1 ; i>=0 ; i--){
12            for (int j=n ; j>=0 ; j--){
13                if (j==n){
14                    ascSum += 97 + (s1.charAt(i)-'a');
15                    curr[n] = ascSum;
16                    continue;
17                }
18                char ch1 = s1.charAt(i);
19                char ch2 = s2.charAt(j);
20                if (ch1==ch2){
21                    curr[j] = prev[j+1];
22                }
23                else{
24                    int skipA = (ch1-'a') + prev[j];
25                    int skipB = (ch2-'a') + curr[j+1];
26                    curr[j] = Math.min(skipA,skipB)+97;
27                }
28            }
29            prev = curr.clone();
30        }
31        return curr[0];
32        
33    }
34}