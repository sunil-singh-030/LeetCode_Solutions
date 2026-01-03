// Last updated: 1/3/2026, 9:39:25 PM
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        int count=0;
4        for (int len=1;len<=nums.length;len++){
5            int sum=0;
6            for (int i=0;i<len;i++){
7                sum+=nums[i];
8            }
9            if(sum==k){
10                count++;
11            }
12            for (int j=len;j<nums.length;j++){
13                sum+=nums[j];
14                sum-=nums[j-len];
15                if(sum==k){
16                count++;
17            }
18            }
19        }
20        return count;
21    }
22}