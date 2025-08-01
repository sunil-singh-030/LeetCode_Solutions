// Last updated: 8/1/2025, 7:02:27 AM
class Solution {
    public boolean isArraySpecial(int[] nums) {
        for (int i=1 ; i<nums.length ; i++){
            if (nums[i]%2==nums[i-1]%2) return false;
        }
        return true;
    }
}