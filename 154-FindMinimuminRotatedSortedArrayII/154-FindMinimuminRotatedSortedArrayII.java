// Last updated: 5/16/2026, 6:33:13 AM
1class Solution {
2    public int findMin(int[] nums) {
3        int min=5001;
4        for (int i:nums){
5            if(i<min){
6                min=i;
7            }
8        }
9        return min;
10    }
11}