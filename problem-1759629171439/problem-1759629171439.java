// Last updated: 10/5/2025, 7:22:51 AM
class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=Maximum_sum(nums);;
        return maxsum;
    }
    public static int Maximum_sum(int [] arr) {
        int n = arr.length;
		int sum = arr[n-1];
        int ans = Integer.MIN_VALUE;
        ans = Math.max(ans,sum);
        if (sum<0){
            sum = 0;
        }
        for (int i=n-2 ; i>=0 ; i--){
            sum += arr[i];
            ans = Math.max(ans,sum);
            if (sum<0){
                sum = 0;
            }
        }
        return ans;
	}
}