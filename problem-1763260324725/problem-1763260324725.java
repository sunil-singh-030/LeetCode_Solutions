// Last updated: 11/16/2025, 8:02:04 AM
class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int ans = Integer.MIN_VALUE;;
        int n = nums.length;
        for (int i=0 ; i<n ; i++){
            for (int j=0 ; j<n ; j++){
                for (int k=0 ; k<n ; k++){
                    if (i==j || j==k){
                        continue;
                    }
                    ans = Math.max(ans,nums[i]+nums[j]-nums[k]);
                }
            }
        }
        return ans;
    }
}