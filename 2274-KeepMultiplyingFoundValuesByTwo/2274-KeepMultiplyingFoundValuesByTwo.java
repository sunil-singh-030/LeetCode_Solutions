// Last updated: 12/19/2025, 11:57:06 AM
class Solution {
    public int findFinalValue(int[] nums, int original) {
        int n = nums.length;
        boolean flag = true;
        while (flag){
            flag = false;
            for (int i=0 ; i<n ; i++){
                if (nums[i]==original){
                    flag = true;
                    original *= 2;
                }
            }
        }
        return original;
    }
}