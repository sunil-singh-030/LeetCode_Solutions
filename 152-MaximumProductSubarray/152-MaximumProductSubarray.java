// Last updated: 8/1/2025, 7:10:36 AM
class Solution {
    public int maxProduct(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int n = nums.length;
        for (int i=0 ; i<n ; i++){
            int prd = 1;
            for (int j=i ; j<n ; j++){
                prd *= nums[j];
                ans = Math.max(ans,prd);
            }
        }
        return ans;
    }
}