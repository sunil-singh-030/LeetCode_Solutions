// Last updated: 5/23/2026, 11:00:20 AM
1class Solution {
2    public boolean check(int[] nums) {
3        int n = nums.length;
4        boolean flag = false;
5        int idx = -1;
6        for (int i=0 ; i<n-1 ; i++){
7            if (nums[i]>nums[i+1]){
8                idx = i;
9                if (flag) return false;
10                flag = true;
11            }
12        }
13        if (flag && nums[n-1]>nums[0]) return false;
14        return true;
15    }
16}