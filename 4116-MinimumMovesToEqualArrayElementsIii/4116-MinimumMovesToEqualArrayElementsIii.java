// Last updated: 12/19/2025, 11:54:02 AM
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