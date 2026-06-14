// Last updated: 6/14/2026, 8:01:31 AM
1class Solution {
2    public boolean checkGoodInteger(int n) {
3        int sum = 0;
4        int sqSum = 0;
5        while (n>0){
6            int dig = n%10;
7            sum += dig;
8            sqSum += (dig*dig);
9            n /= 10;
10        }
11        return sqSum-sum>=50 ;
12    }
13}