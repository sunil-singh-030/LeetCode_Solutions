// Last updated: 8/1/2025, 7:03:19 AM
class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int ind1 = n;
        while (left<=right){
            int mid = (left+right)/2;
            if (nums[mid]<=0){
                left = mid+1;
            }
            else{
                ind1 = mid;
                right = mid-1;
            }
        }
        int ind2 = -1;
        left = 0;
        right = n-1;
        while (left<=right){
            int mid = (left+right)/2;
            if (nums[mid]<0){
                ind2 = mid;
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return Math.max(n-ind1,ind2+1);
    }
}