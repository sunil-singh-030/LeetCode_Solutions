// Last updated: 8/1/2025, 7:10:14 AM
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n==1){
            return nums[0];
        }
        int prev = nums[1];
        int prev2 = nums[0];
        int prev3 = -1;
        for (int i=2 ; i<n ; i++){
             if (i>2){
                int temp1 = prev;
                int temp2 = prev2;
                prev = nums[i] + Math.max(prev2,prev3);
                prev2 = temp1;
                prev3 = temp2;
             }
             else{
                int temp1 = prev;
                int temp2 = prev2;
                prev = nums[i] + prev2;
                prev2 = temp1;
                prev3 = temp2;;
             }
        }
        return Math.max(prev2,prev);
    }
}