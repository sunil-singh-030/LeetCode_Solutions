// Last updated: 10/14/2025, 10:37:17 AM
class Solution {
    public long minCost(int[] nums, int[] cost) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        // find min and max
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        long ans = Long.MAX_VALUE;
        
        // binary search on possible target value
        while (min < max) {
            int mid = min + (max - min) / 2;
            long cost1 = totalCost(nums, cost, mid);
            long cost2 = totalCost(nums, cost, mid + 1);

            ans = Math.min(cost1, cost2);
            
            // move toward smaller cost direction
            if (cost1 < cost2) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }

        // compute final answer for convergence point
        ans = Math.min(ans, totalCost(nums, cost, min));
        return ans;
    }

    private long totalCost(int[] nums, int[] cost, long target) {
        long total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += Math.abs(nums[i] - target) * (long) cost[i];
        }
        return total;
    }
}
