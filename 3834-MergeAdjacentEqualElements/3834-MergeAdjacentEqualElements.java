// Last updated: 2/9/2026, 12:23:28 PM
1class Solution {
2    public int dominantIndices(int[] nums) {
3        int cnt = 0;
4        int n  = nums.length;
5        int sum = nums[n-1];
6        for (int i=n-2 ; i>=0 ; i--){
7            int len = n-1-i;
8            if (nums[i]>(sum/len)){
9                cnt++;
10            }
11            sum += nums[i];
12        }
13        return cnt;
14    }
15}