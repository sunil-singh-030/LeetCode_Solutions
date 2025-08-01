// Last updated: 8/1/2025, 7:08:07 AM
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        if (n==1){
            return nums[0];
        }
        if (nums[0]!=nums[1]){
            return nums[0];
        }
        if (nums[n-1]!=nums[n-2]){
            return nums[n-1];
        }
        int low = 1;
        int high = n-2;
        while (low<=high){
            int mid = (low+high)/2;
            if (nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]){
                return nums[mid];
            }
            else if (nums[mid]==nums[mid+1]){
                if ((mid+1)%2==0){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                if ((mid+1)%2==0){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}