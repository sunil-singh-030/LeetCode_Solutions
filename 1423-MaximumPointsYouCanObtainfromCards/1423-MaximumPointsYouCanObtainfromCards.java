// Last updated: 1/3/2026, 4:22:35 PM
1class Solution {
2    public int maxScore(int[] cardPoints, int k) {
3        // 0 1 3 6 10 15 21 22
4        int n = cardPoints.length;
5        int[] psum = new int[n+1];
6        for (int i=0 ; i<n ; i++){
7            psum[i+1] = psum[i] + cardPoints[i];
8        }
9        int sc = 0;
10        int st = 0;
11        int end = n-1;
12        while (k>0){
13            int lsum = psum[st+k]-psum[st];
14            int rsum = psum[end+1]-psum[end-k+1];
15            if (lsum>=rsum){
16                sc += cardPoints[st];
17                st++;
18            }
19            else{
20                sc += cardPoints[end];
21                end--;
22            }
23            k--;
24        }
25        return sc;
26    }
27}