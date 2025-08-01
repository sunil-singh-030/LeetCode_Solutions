// Last updated: 8/1/2025, 7:03:39 AM
class Solution {
    public long countSubarrays(int[] nums, long k) {
        int n = nums.length;
        long[] psum =new long[n];
        long sum = 0;
        for (int i=0 ; i<n ; i++){
            sum += nums[i];
            psum[i] = sum;
        }
        long cnt = 0;
        for (int i=0 ; i<n ; i++){
            int ind = -1;
            int left = i;
            int right = n-1;
            while (left<=right){
                int mid = (left+right)/2;
                if (isgood(psum,i,mid,k)){
                    ind = mid;
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }
            }
            if (ind!=-1){
                cnt += (ind-i+1);
            }
        }
        return cnt;
    }
    public static boolean isgood(long[] psum , int si , int ei , long k){
        long len = ei-si+1;
        if (si==0){
            long sum = psum[ei];
            if (sum*len>=k){
                return false;
            }
            return true;
        }
        else{
            long sum = psum[ei]-psum[si-1];
            if (sum*len>=k){
                return false;
            }
            return true;
        }
    }
}