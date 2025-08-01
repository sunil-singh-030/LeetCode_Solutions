// Last updated: 8/1/2025, 7:11:48 AM
class Solution {
    public void sortColors(int[] nums) {
        for (int len=1;len<=nums.length;len++){
            for (int i=0;i<nums.length-len;i++){
                if (nums[i]>nums[i+1]){
                    int temp=nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=temp;
                }
            }
        }
    }
}