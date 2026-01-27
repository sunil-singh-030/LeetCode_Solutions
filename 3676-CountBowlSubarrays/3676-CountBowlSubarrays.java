// Last updated: 1/27/2026, 3:25:23 PM
1class Solution {
2    public long bowlSubarrays(int[] nums) {
3        long ans = 0;
4        int n = nums.length;
5        int[] lmax = new int[n];
6        for (int i=1 ; i<n ; i++){
7            lmax[i] = Math.max(lmax[i-1],nums[i-1]);
8        }
9        int[] rmax = new int[n];
10        for (int i=n-2 ; i>=0 ; i--){
11            rmax[i] = Math.max(rmax[i+1],nums[i+1]);
12        }
13        for (int i=0 ; i<n ; i++){
14            if (lmax[i]>nums[i] && rmax[i]>nums[i]){
15                ans++;
16            }
17        }
18        return ans;
19    }
20}