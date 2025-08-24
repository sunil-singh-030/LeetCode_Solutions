// Last updated: 8/24/2025, 7:43:55 AM
class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int n = nums.length;
        long mod = 1000000007;
        long[] arr = new long[n];
        for (int i=0 ; i<n ; i++){
            arr[i] = nums[i];
        }
        int q = queries.length;
        for (int i=0 ; i<q ; i++){
            int st = queries[i][0];
            int end = queries[i][1];
            int k = queries[i][2];
            int v = queries[i][3];
            while (st<=end){
                arr[st] = (arr[st]*v) % mod;
                st += k;
            }
        }
        long ans = 0;
        for (long num : arr){
            ans ^= num;
        }
        return (int) ans;
    }
}