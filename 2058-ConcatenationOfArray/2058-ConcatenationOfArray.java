// Last updated: 12/19/2025, 11:57:51 AM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        for (int i=0 ; i<nums.length ; i++){
            ans[i] = nums[i];
        }
        for (int i=0 ; i<nums.length ; i++){
            ans[i+nums.length] = nums[i];
        }
        return ans;
    }
}