// Last updated: 8/1/2025, 7:02:41 AM
class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = -1;
        for (int num : nums){
            max = Math.max(max,num);
        }
        int n = nums.length;
        long ans = 0;
        int si = 0;
        int ci = 0;
        int c = 0;
        while (ci<n){
            if (nums[ci]==max){
                c++;
            }
            while (c>=k){
                ans += (n-ci);
                if (nums[si]==max){
                    c--;
                }
                si++;
            }
            ci++;
        }
        return ans;
    }
}