// Last updated: 4/20/2026, 8:52:33 AM
1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3        int n = nums.length;
4        int[] minarr = new int[n];
5        minarr[n-1] = nums[n-1];
6        for (int i=n-2 ; i>=0 ; i--){
7            minarr[i] = Math.min(minarr[i+1],nums[i]);
8        }
9        int max = Integer.MIN_VALUE;
10        for (int i=0 ; i<n ; i++){
11            max = Math.max(max,nums[i]);
12            if (max-minarr[i]<=k){
13                return i;
14            }
15        }
16        return -1;
17    }
18}