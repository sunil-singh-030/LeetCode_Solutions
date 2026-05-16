// Last updated: 5/16/2026, 4:15:09 PM
1class Solution {
2    public int[] concatWithReverse(int[] nums) {
3        int n = nums.length;
4        int[] ans = new int[2*n];
5        for (int i=0 ; i<n ; i++){
6            ans[i] = nums[i];
7        }
8        int idx = n;
9        for (int i=n-1 ; i>=0 ; i--){
10            ans[idx] = nums[i];
11            idx++;
12        }
13        return ans;
14    }
15}