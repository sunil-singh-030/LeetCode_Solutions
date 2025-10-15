// Last updated: 10/15/2025, 6:44:33 AM
class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        int[] cntBada = new int[n];
        Arrays.fill(cntBada,1);
        for (int i=n-2 ; i>=0 ; i--){
            if (nums.get(i+1)>nums.get(i)){
                cntBada[i] = cntBada[i+1] + 1;
            }
        }
        for (int i=0 ; i<=n-2*k ; i++){
            if (cntBada[i]>=k && cntBada[i+k]>=k){
                return true;
            }
        }
        return false;
    }
}