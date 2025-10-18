// Last updated: 10/18/2025, 12:13:53 PM
class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if (n==1) return 0;
        int st = 0;
        int end = n-1;
        while (st<=end){
            int mid = (st+end)/2;
            if (mid==0){
                if (nums[0]>nums[1]){
                    return 0;
                }
                else{
                    st = mid+1;
                }
            }
            else if (mid==n-1){
                if (nums[n-1]>nums[n-2]){
                    return n-1;
                }
                else{
                    end = mid-1;
                }
            }
            else{
                if (nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                    return mid;
                }
                else if (nums[mid]<nums[mid-1]){
                    end = mid-1;
                }
                else{
                    st = mid+1;
                }
            }
        }
        return -1;
    }
}