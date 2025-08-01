// Last updated: 8/1/2025, 7:10:29 AM
class Solution {
    public int findPeakElement(int[] nums) {
        int ans = -1;
        int left = 0;
        int right = nums.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if (left==right){
                ans = left;
                break;
            }
            else if (mid==left){
                if (nums[left]>nums[right]){
                    return left;
                }
                else{
                    return right;
                }
            }
            else if (nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }
            else{
                if (nums[mid-1]>=nums[mid+1]){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
        }
        return ans;
    }
}