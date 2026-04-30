// Last updated: 4/30/2026, 11:42:37 PM
1class Solution {
2    public long minOperations(int[] nums) {
3        long tsum = 0;
4        int tar = nums[0];
5        
6        int x = 0;
7        for (int i=1 ; i<nums.length ; i++){
8            if (nums[i]+x<tar){
9                tsum += tar - nums[i]-x;
10                x += tar - nums[i] - x;
11                
12            }
13            else{
14                tar = nums[i];
15                x = 0;
16
17            }
18            
19        }
20        return tsum;
21    }
22}