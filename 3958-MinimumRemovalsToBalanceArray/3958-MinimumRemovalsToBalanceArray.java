// Last updated: 8/3/2025, 9:55:08 PM
class Solution {
    public int minRemoval(int[] nums, int k) {
        int n = nums.length;
        if (n==1){
            return 0;
        }
        Arrays.sort(nums);
        int minans = Integer.MAX_VALUE;
        for (int i=0 ; i<n-1 ; i++){
            long num = (long)  nums[i];
            int ind = -1;
            int st = i+1;
            int end = n-1;
            while (st<=end){
                int mid = (st+end)/2;
                if ((long) nums[mid]<=k*num){
                    ind = mid;
                    st = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            if (ind!=-1){
                minans = Math.min(minans,i+(n-ind-1));
            }
        }
        if (minans==Integer.MAX_VALUE){
            return n-1;
        }
        return minans;
    }
}