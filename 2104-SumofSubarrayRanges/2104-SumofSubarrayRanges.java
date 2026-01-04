// Last updated: 1/4/2026, 11:25:47 AM
1class Solution {
2    public long subArrayRanges(int[] nums) {
3        long ans = 0;
4        int n = nums.length;
5        for (int i=0 ; i<n ; i++){
6            TreeSet<Integer> set = new TreeSet<>();
7            for (int j=i ; j<n ; j++){
8                set.add(nums[j]);
9                ans += set.last()-set.first();
10            }
11        }
12        return ans;
13    }
14}