// Last updated: 8/1/2025, 7:10:46 AM
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int out=Integer.MIN_VALUE;
        for (int i=1;i<nums.length;i++){
            if (nums[i]!=nums[i-1]){
                out=nums[i-1];
                break;
            }
            else{
                i++;
            }
        }
        if (out==Integer.MIN_VALUE){
            return nums[nums.length-1];
        }
        return out;
         //1 1 2 2 4
    }
}