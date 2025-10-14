// Last updated: 10/14/2025, 10:39:30 AM
class Solution {
    public long minCost(int[] nums, int[] cost) {
        long minCost = Long.MAX_VALUE;
        int min = 1;
        int max = Integer.MAX_VALUE;
        int n = nums.length;
        for (int num : nums){
            min = Math.min(min,num);
            max = Math.max(max,num);
        }
        while (min<max){
            int mid = (min+max)/2;
            long cost1 = fn(nums,cost,mid);
            long cost2 = fn(nums,cost,mid+1);
            minCost = Math.min(cost1,cost2);
            if (cost1<cost2){
                max = mid;
            }
            else{
                min = mid + 1;
            }
        }
        return minCost;
    }
    public long fn(int[] nums, int[] cost , int x){
        long totalCost = 0;
        int n = nums.length;
        for (int i=0 ; i<n; i++){
            totalCost += (((long) Math.abs(nums[i]-x))*((long) cost[i]));
        }
        return totalCost;
    }
}