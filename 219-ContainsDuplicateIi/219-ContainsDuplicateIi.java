// Last updated: 8/1/2025, 7:09:58 AM
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length && j<=i+k;j++){
                if (nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}