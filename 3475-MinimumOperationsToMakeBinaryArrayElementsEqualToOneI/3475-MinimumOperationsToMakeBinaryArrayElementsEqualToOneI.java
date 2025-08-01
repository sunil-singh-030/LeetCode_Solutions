// Last updated: 8/1/2025, 7:02:18 AM
class Solution {
    public int minOperations(int[] nums) {
        int cnt = 0;
        int n = nums.length;
        for (int i=0 ; i<n-2 ; i++){
            if (nums[i]==1){
                continue;
            }
            cnt++;
            if (nums[i+1]==1){
                nums[i+1] = 0;
            }
            else if (nums[i+1]==0){
                nums[i+1] = 1;
            }
            if (nums[i+2]==1){
                nums[i+2] = 0;
            }
            else if (nums[i+2]==0){
                nums[i+2] = 1;
            }
        }
        if (nums[n-1]==0 || nums[n-2]==0){
            return -1;
        }
        return cnt;
    }
}