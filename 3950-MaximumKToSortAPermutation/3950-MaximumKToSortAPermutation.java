// Last updated: 8/13/2025, 11:58:53 AM
class Solution {
    public int sortPermutation(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        for (int i=0 ; i<n ; i++){
            if (nums[i]!=i){
                min = Math.min(min,i);
            }
        }
        int ans = min;
        for (int i=0 ; i<n ; i++){
            if (nums[i]!=i && nums[i]!=min){
                ans = Math.min(ans,min & nums[i]);
            }
        }
        return ans==Integer.MAX_VALUE ? 0 : ans;
    }
}