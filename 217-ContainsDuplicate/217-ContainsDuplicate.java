// Last updated: 8/1/2025, 7:10:00 AM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean flag=false;
        Arrays.sort(nums);
        for (int i=0;i<nums.length-1;i++){
            if (nums[i]==nums[i+1]){
                flag=true;
                break;
            }
        }
    return flag;
    }
}