// Last updated: 8/1/2025, 7:07:17 AM
class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int start = -1; 
        int end = -1;   
        int res = 0;    
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > right) {
                start = end = i; 
            } else if (nums[i] >= left) {
                end = i; 
            }
            
            res += end - start;
        }
        return res;
    }
}