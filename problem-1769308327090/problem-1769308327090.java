// Last updated: 1/25/2026, 8:02:07 AM
1class Solution {
2    public int minimumPrefixLength(int[] nums) {
3        int n = nums.length;
4        for (int i=n-2 ; i>=0 ; i--){
5            if (nums[i]<nums[i+1]){
6                continue;
7            }
8            return i+1;
9        }
10        return 0;
11    }
12}