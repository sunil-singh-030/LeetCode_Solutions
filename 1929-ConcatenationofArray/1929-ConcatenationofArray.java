// Last updated: 2/2/2026, 12:33:22 PM
1class Solution {
2    public int[] getConcatenation(int[] nums) {
3        int[] ans = new int[nums.length*2];
4        for (int i=0 ; i<nums.length ; i++){
5            ans[i] = nums[i];
6        }
7        for (int i=0 ; i<nums.length ; i++){
8            ans[i+nums.length] = nums[i];
9        }
10        return ans;
11    }
12}