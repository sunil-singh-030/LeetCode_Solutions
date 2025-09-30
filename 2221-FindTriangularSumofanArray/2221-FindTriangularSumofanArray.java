// Last updated: 9/30/2025, 10:18:32 AM
class Solution {
    public int triangularSum(int[] nums) {
        return fn(nums,0);
    }
    public int fn(int[] nums, int ind){
        if (ind==nums.length-1){
            return nums[nums.length-1];
        }
        int[] temp = nums.clone();
        for (int i=ind+1 ; i<nums.length ; i++){
            nums[i] = (temp[i] + temp[i-1])%10;
        }
        return fn(nums,ind+1);
    }
}