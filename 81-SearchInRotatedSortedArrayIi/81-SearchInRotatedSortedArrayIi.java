// Last updated: 8/1/2025, 7:11:40 AM
class Solution {
    public boolean search(int[] nums, int target) {
        int ans = -1;
        int left = 0;
        int right = nums.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if (nums[mid]==target){
                return true;
            }
            else{
                boolean flag = true;
                for (int i=0 ; i<mid ; i++){
                    if (nums[i]>nums[i+1]){
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    if (nums[0]<=target && nums[mid]>target){
                        right = mid-1;
                    }
                    else{
                        left = mid+1;
                    }
                }
                else{
                    if (nums[mid]<target && nums[nums.length-1]>=target){
                        left = mid+1;
                    }
                    else{
                        right = mid-1;
                    }
                }
            }
        }
        return ans>=0;
    }
}