// Last updated: 4/18/2026, 8:35:21 AM
1class Solution {
2    public int mirrorDistance(int n) {
3        int num1 = n;
4        int num2 = 0;
5        while (n>0){
6            num2 *= 10;
7            num2 += n%10;
8            n /= 10;
9        }
10        return Math.abs(num1-num2);
11    }
12}