// Last updated: 5/17/2026, 7:16:08 AM
1class Solution {
2    public boolean canJump(int[] nums) {
3        int n = nums.length;
4        int goal = n-1;
5        for (int i=n-2 ; i>=0 ; i--){
6            if (i+nums[i]>=goal){
7                goal = i;
8            }
9        }
10        return goal==0;
11    } 
12    
13    
14}