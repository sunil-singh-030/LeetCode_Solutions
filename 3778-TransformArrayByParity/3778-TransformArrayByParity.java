// Last updated: 8/1/2025, 7:01:26 AM
class Solution {
    public int[] transformArray(int[] nums) {
        for (int i=0 ; i<nums.length ; i++){
            if (nums[i]%2==0){
                nums[i] = 0;
            }
            else{
                nums[i] = 1;
            }
        }
        Arrays.sort(nums);
        return nums;
    }
}