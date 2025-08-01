// Last updated: 8/1/2025, 7:03:22 AM
class Solution {
    public int[] applyOperations(int[] nums) {
        for (int i=0 ; i<nums.length-1 ; i++){
            if (nums[i]==nums[i+1]){
                nums[i] *= 2;
                nums[i+1] = 0;
            }
        }
        int[] out = new int[nums.length];
        int i=0 ;
        for (int num : nums){
            if (num!=0){
                out[i] = num;
                i++;
            }
        }
        return out;
    }
}