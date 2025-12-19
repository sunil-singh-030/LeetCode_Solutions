// Last updated: 12/19/2025, 11:54:14 AM
class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int cnt = 0;
        for (int i=0 ; i<n ; i++){
            int cntNum = 0;
            for (int j=i ; j<n ; j++){
                if (nums[j]==target){
                    cntNum++;
                }
                if (cntNum>((j-i+1)/2)){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}