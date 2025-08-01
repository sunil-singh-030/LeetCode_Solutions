// Last updated: 8/1/2025, 7:08:43 AM
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        int c=1;
        for (int i=nums.length-2;i>=0;i--){
            if (nums[i]<max){
                max=nums[i];
                c++;
            }
            if (c==3){
                break;
            }
        }
        if (c<3){
            return nums[nums.length-1];
        }
        else{
            return max;
        }
        
    }
}