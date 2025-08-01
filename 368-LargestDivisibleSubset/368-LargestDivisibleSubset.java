// Last updated: 8/1/2025, 7:09:00 AM
class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int[] dp = new int[n];
        int[] prevInd = new int[n];
        Arrays.fill(dp,1);
        Arrays.fill(prevInd,-1);
        for (int i=0 ; i<n ; i++){
            for (int j=0 ; j<i ; j++){
                if (nums[i]%nums[j]==0){
                    if (dp[i]<1+dp[j]){
                        prevInd[i] = j;
                    }
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
        }
        int maxLen = 0;
        int ind = -1;
        for (int i=0 ; i<n ; i++){
            if (dp[i]>maxLen){
                ind = i;
                maxLen = dp[i];
            }
        }
        List<Integer> ls = new ArrayList<>();
        ls.add(nums[ind]);
        while (prevInd[ind]!=-1){
            ind = prevInd[ind];
            ls.add(nums[ind]);
        }
        Collections.reverse(ls);
        return ls;
    }
}