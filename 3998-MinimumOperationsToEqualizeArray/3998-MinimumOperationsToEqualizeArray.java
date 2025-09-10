// Last updated: 9/10/2025, 12:10:04 PM
class Solution {
    public int minOperations(int[] nums) {
        boolean check = false;
        for (int i=1 ; i<nums.length ; i++){
            if (nums[i]!=nums[i-1]){
                check = true;
                break;
            }
        }
        if (check) {
            return 1;
        }
        return 0;
    }
}