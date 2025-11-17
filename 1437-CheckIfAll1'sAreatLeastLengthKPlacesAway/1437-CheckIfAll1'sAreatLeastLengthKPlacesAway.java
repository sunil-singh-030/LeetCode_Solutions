// Last updated: 11/17/2025, 9:46:17 AM
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int n = nums.length;
        int prevIdx = -1;
        for (int i=0 ; i<n ; i++){
            if (nums[i]==1){
                if (prevIdx==-1){
                    prevIdx = i;
                }
                else{
                    if (i-prevIdx-1<k) return false;
                    prevIdx = i;
                }
            }
        }
        return true;
    }
}