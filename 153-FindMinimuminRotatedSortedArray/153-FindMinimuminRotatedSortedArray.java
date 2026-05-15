// Last updated: 5/15/2026, 7:11:14 AM
1class Solution {
2    public int findMin(int[] nums) {
3        int left = 0;
4        int right = nums.length-1;
5        while (left<right){
6            int mid = (left+right)/2;
7            if (nums[mid]>nums[right]){
8                left = mid+1;
9            }
10            else{
11                right = mid;
12            }
13
14        }
15        return nums[left];
16    }
17}