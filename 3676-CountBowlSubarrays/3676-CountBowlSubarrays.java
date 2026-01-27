// Last updated: 1/27/2026, 3:28:06 PM
1class Solution {
2    public long bowlSubarrays(int[] nums) {
3        long ans = 0;
4        int n = nums.length;
5        int[] lmax = new int[n];
6        for (int i=1 ; i<n ; i++){
7            lmax[i] = Math.max(lmax[i-1],nums[i-1]);
8        }
9        int rmax = 0;
10        for (int i=n-2 ; i>0 ; i--){
11            rmax = Math.max(rmax,nums[i+1]);
12            if (lmax[i]>nums[i] && rmax>nums[i]){
13                ans++;
14            }
15        }
16        
17        return ans;
18    }
19}