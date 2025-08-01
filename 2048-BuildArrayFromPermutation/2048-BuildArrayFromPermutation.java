// Last updated: 8/1/2025, 7:04:31 AM
class Solution {
    public int[] buildArray(int[] nums) {
        int[] out = new int[nums.length];
        for (int i=0 ; i<nums.length ; i++){
            out[i] = nums[nums[i]];
        }
        return out;
    }
}