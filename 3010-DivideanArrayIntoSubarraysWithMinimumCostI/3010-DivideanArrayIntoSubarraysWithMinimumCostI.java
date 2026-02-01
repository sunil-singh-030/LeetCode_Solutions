// Last updated: 2/1/2026, 7:59:22 AM
1class Solution {
2    public int minimumCost(int[] nums) {
3        int ans = Integer.MAX_VALUE;
4        int n = nums.length;
5        int min1 = Integer.MAX_VALUE;
6        int min2 = Integer.MAX_VALUE;
7        for (int i=1 ; i<n ; i++){
8            if (nums[i]<min1){
9                min2 = Math.min(min2,min1);
10                min1 = nums[i];
11            }
12            else{
13                min2 = Math.min(min2,nums[i]);
14            }
15            
16        }
17        return nums[0]+min1+min2;
18    }
19}