// Last updated: 8/1/2025, 7:04:34 AM
class Solution {
    static int ans = 0;
    public int subsetXORSum(int[] nums) {
        ans = 0;
        lets(nums,0,0);
        return ans;
    }
    public static void lets(int[] nums , int ind, int xor){
        if (ind==nums.length){
            ans += xor;
            return;
        }
        lets(nums,ind+1,xor);
        lets(nums,ind+1,xor^nums[ind]);
    }
}