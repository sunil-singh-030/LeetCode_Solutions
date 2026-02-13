// Last updated: 2/13/2026, 9:56:51 AM
1class Solution {
2    public int[] smallerNumbersThanCurrent(int[] nums) {
3        int n = nums.length;
4        int[] ans = new int[n];
5        for (int i=0 ; i<n ; i++){
6            int c = 0;
7            for (int j=0 ; j<n ; j++){
8                if (nums[j]<nums[i]){
9                    c++;
10                }
11            }
12            ans[i] = c;
13        }
14        return ans;
15    }
16}