// Last updated: 12/19/2025, 11:58:25 AM
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int n = nums.length;
        int prevIdx = -1;
        for (int i=0 ; i<n ; i++){
            if (nums[i]==1){
                prevIdx = i;
                break;
            }
        }
        for (int i=prevIdx+1 ; i<n ; i++){
            if (nums[i]==0) continue;
            if (i-prevIdx-1<k) return false;
            prevIdx = i;
        }
        return true;
    }
}