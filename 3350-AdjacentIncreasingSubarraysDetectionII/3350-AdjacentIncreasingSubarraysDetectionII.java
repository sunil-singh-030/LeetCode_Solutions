// Last updated: 10/15/2025, 6:53:53 AM
class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n = nums.size();
        int[] cntBada = new int[n];
        Arrays.fill(cntBada,1);
        for (int i=n-2 ; i>=0 ; i--){
            if (nums.get(i+1)>nums.get(i)){
                cntBada[i] = cntBada[i+1] + 1;
            }
        }
        int maxAns = 1;
        for (int i=0 ; i<n ; i++){
            int max1 = cntBada[i]/2;
            int max2 = 1;
            if ((i+cntBada[i])<n){
                max2 = Math.min(cntBada[i],cntBada[i+cntBada[i]]);
            }
            maxAns = Math.max(maxAns,Math.max(max1,max2));
        }
        return maxAns;
    }
}