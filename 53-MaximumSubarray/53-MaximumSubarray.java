// Last updated: 5/20/2026, 3:01:20 PM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int n = nums.length;
4        int max = Integer.MIN_VALUE;
5        int ci = 0;
6        int currsum = 0;
7        while (ci<n){
8            currsum += nums[ci];
9            max = Math.max(max,currsum);
10            if (currsum<=0){
11                currsum = 0;
12            }
13            ci++;
14        }
15        return max;
16    }
17}