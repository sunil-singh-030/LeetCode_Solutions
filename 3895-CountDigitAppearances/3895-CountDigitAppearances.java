// Last updated: 4/14/2026, 10:24:48 AM
1class Solution {
2    public int countDigitOccurrences(int[] nums, int digit) {
3        int c = 0;
4        for (int num : nums){
5            int temp = num;
6            while (temp>0){
7                int dig = temp%10;
8                if (dig==digit) c++;
9                temp /= 10;
10            }
11        }
12        return c;
13    }
14}