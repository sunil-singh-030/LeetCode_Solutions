// Last updated: 1/3/2026, 4:00:39 PM
1class Solution {
2    public int maxScore(int[] cardPoints, int k) {
3        int n = cardPoints.length;
4        int[] psum = new int[n+1];
5        for (int i=0 ; i<n ; i++){
6            psum[i+1] = psum[i] + cardPoints[i];
7        }
8        int sc = 0;
9        int st = 0;
10        int end = n-1;
11        while (k>0){
12            int lsum = psum[st+k]-psum[st];
13            int rsum = psum[end+1]-psum[end-k+1];
14            if (lsum>=rsum){
15                sc += cardPoints[st];
16                st++;
17            }
18            else{
19                sc += cardPoints[end];
20                end--;
21            }
22            k--;
23        }
24        return sc;
25    }
26}