// Last updated: 1/4/2026, 11:27:09 AM
1class Solution {
2    public long subArrayRanges(int[] nums) {
3        long ans = 0;
4        int n = nums.length;
5        for (int i=0 ; i<n ; i++){
6            int min = nums[i];
7            int max = nums[i];
8            for (int j=i ; j<n ; j++){
9                min = Math.min(min,nums[j]);
10                max = Math.max(max,nums[j]);
11                ans += max - min;
12            }
13        }
14        return ans;
15    }
16}