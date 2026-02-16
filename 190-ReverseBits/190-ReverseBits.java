// Last updated: 2/16/2026, 10:05:44 AM
1class Solution {
2    public int reverseBits(int n) {
3        int ans = 0;
4        int pow = 31;
5        while (n>0){
6            if (n%2==1){
7                ans += (int) Math.pow(2,pow);
8            }
9            pow--;
10            n /= 2;
11        }
12        return ans;
13    }
14}