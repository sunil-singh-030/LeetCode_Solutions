// Last updated: 1/20/2026, 10:39:28 AM
1class Solution {
2    public int numTeams(int[] rating) {
3        int n = rating.length;
4        int ans = 0;
5        int[] bada = new int[n];
6        int[] chota = new int[n];
7        for (int i=n-2 ; i>=0 ; i--){
8            int cntB = 0;
9            int cntC = 0;
10            for (int j=i+1 ; j<n ; j++){
11                if (rating[j]>rating[i]){
12                    cntB++;
13                }
14                else if (rating[j]<rating[i]){
15                    cntC++;
16                }
17            }
18            bada[i] = cntB;
19            chota[i] = cntC;
20        }
21        for (int i=0 ; i<n-2 ; i++){
22            for (int j=i+1 ; j<n-1 ; j++){
23                if (rating[j]>rating[i]){
24                    ans += bada[j];
25                }
26                else if (rating[i]>rating[j]){
27                    ans += chota[j];
28                }
29            }
30        }
31        return ans;
32        
33        
34    }
35}