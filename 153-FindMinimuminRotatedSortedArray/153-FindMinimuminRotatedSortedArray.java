// Last updated: 5/16/2026, 6:35:04 AM
1class Solution {
2    public int findMin(int[] nums) {
3        int n = nums.length;
4        int st = 0;
5        int end = n-1;
6        while (st<end){
7            int mid = (st+end)/2;
8            if (nums[mid]>nums[end]){
9                st = mid+1;
10            }
11            else{
12                end = mid;
13            }
14        }
15        return nums[st];
16    }
17}