// Last updated: 8/1/2025, 7:06:32 AM
class Solution {
    public int minIncrementForUnique(int[] nums) {
        int count=0;
        Arrays.sort(nums);
        int min=nums[0];
        for (int i=1;i<nums.length;i++){
            if (nums[i]==min){
                count++;
                min++;
            }
            else if (nums[i]<min){
                count+=min-nums[i]+1;
                min++;
            }
            else{
                min=nums[i];
            }
        }
        return count;
    }
}