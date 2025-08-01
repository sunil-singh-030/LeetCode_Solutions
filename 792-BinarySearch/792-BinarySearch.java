// Last updated: 8/1/2025, 7:07:22 AM
class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int ind=-1;
        while (left<=right){
            int mid=(left+right)/2;
            if (nums[mid]>target){
                right=mid-1;
            }
            else if (nums[mid]<target){
                left=mid+1;
            }
            else{
                ind=mid;
                break;
            }
        }
        return ind;
    }
}