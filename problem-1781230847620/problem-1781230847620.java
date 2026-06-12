// Last updated: 6/12/2026, 7:50:47 AM
1class Solution {
2    public int sumOfGoodIntegers(int n, int k) {
3        int ans = 0;
4        int st = Math.max(0,n-k);
5        int end = n+k;
6        while (st<=end){
7            if ((st&n)==0) ans += st;
8            st++;
9        }
10        return ans;
11    }
12}