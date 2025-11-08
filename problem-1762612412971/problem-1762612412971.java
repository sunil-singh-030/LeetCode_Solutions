// Last updated: 11/8/2025, 8:03:32 PM
class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int ans = 0;
        for (int i=0 ; i<n ; i++){
            if (nums[i]==nums[n-1]){
                break;
            }
            ans += nums[n-1]-nums[i];
        }
        return ans;
    }
}