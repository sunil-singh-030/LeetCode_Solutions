// Last updated: 8/1/2025, 7:05:10 AM
class Solution {
    public int numSubseq(int[] nums, int target) {
        int n = nums.length;
        int mod = 1000000007;
        int[] power = new int[n];
        power[0] = 1;
        for (int i = 1; i < n; i++) {
            power[i] = (power[i - 1] * 2) % mod;
        }
        Arrays.sort(nums);
        int cnt = 0;
        for (int i=0 ; i<n ; i++){
            int req = target-nums[i];
            int ind = -1;
            int left = i+1;
            int right = n-1;
            while (left<=right){
                int mid = (left+right)/2;
                if (nums[mid]>req){
                    right = mid-1;
                }
                else{
                    ind = mid;
                    left = mid+1;
                }
            }
            if (ind!=-1){
                int len = ind-i;
                cnt += (power[ind-i]%mod);
                cnt %= mod;
            }
            else{
                if (nums[i]*2<=target){
                    cnt++;
                }
                else{
                    break;
                }
            }
        }
        return cnt%mod;
    }
}