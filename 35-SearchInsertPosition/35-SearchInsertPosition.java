// Last updated: 8/1/2025, 7:12:38 AM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans = -1;
        int left = 0;
        int right = nums.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if (nums[mid]>target){
                right = mid-1;
            }
            else if (nums[mid]<target){
                ans = mid;
                left = mid+1;
            }
            else{
                return mid;
            }
        }
        return ans+1;
    }
}