// Last updated: 8/1/2025, 7:09:28 AM
class Solution {
    public void moveZeroes(int[] nums) {
        int c=0;
        int ind=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==0){
                c++;
            }
            else{
                nums[ind]=nums[i];
                ind++;
            }
        }
        for (int i=ind;i<nums.length;i++){
            nums[i]=0;
        }
    }
}