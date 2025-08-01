// Last updated: 8/1/2025, 7:02:15 AM
class Solution {
    public int maximumLength(int[] nums) {
        int n = nums.length;
        int cnteven = 0;
        int currans = 1;
        int curr = nums[0]%2;
        if (nums[0]%2==0){
            cnteven++;
        }
        for (int i=1 ; i<n ; i++){
            if (nums[i]%2==0){
                cnteven++;
            }
            if (nums[i]%2!=curr){
                currans++;
                curr = nums[i]%2;
            }
        }
        return Math.max(Math.max(cnteven,n-cnteven),currans);
    }

}