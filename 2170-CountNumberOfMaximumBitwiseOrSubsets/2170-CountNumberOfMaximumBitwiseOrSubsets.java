// Last updated: 8/1/2025, 7:04:13 AM
class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int maxOr = 0;
        for (int num : nums){
            maxOr = maxOr | num;
        }
        return countgoodSet(nums,0,maxOr,0);
    }
    public static int countgoodSet(int[] nums, int i, int maxOr, int currOr){
        if (i==nums.length){
            return currOr==maxOr ? 1 : 0;
        }
        int notake = countgoodSet(nums,i+1,maxOr,currOr);
        int take = countgoodSet(nums,i+1,maxOr,currOr | nums[i]);
        return notake+take;
    }
    
}