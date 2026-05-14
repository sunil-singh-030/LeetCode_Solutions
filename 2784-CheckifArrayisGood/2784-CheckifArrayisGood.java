// Last updated: 5/14/2026, 10:18:25 AM
1class Solution {
2    public boolean isGood(int[] nums) {
3        Arrays.sort(nums);
4        int len = nums.length;
5        if (len==1) return false;
6        int n = nums[len-1];
7        if (len!=n+1) return false;
8        for (int i=1 ; i<len-1 ; i++){
9            if (nums[i]-nums[i-1]!=1) return false;
10        }
11        if (nums[len-1]!=nums[len-2]) return false;
12        return true;
13    }
14}