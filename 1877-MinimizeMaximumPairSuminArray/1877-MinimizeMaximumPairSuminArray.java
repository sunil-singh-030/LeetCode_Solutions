// Last updated: 1/24/2026, 4:34:32 PM
1class Solution {
2    public int minPairSum(int[] nums) {
3        // 2 3 3 5
4        Arrays.sort(nums);
5        int n = nums.length;
6        int i=0;
7        int j=n-1;
8        int ans = 0;
9        while (i<n){
10            ans = Math.max(ans,nums[i]+nums[j]);
11            i++;
12            j--;
13        }
14        return ans;
15    }
16}