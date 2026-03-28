// Last updated: 3/28/2026, 10:37:26 PM
1class Solution {
2    public int minAbsoluteDifference(int[] nums) {
3        int n = nums.length;
4        int idx1 = -1;
5        int idx2 = -1;
6        int ans = n+1;
7        for (int i=n-1 ; i>=0 ; i--){
8            int num = nums[i];
9            if (num==1){
10                if (idx2!=-1){
11                    ans = Math.min(ans,idx2-i);
12                }
13            }
14            else if (num==2){
15                if (idx1!=-1){
16                    ans = Math.min(ans,idx1-i);
17                }
18            }
19
20
21            if (num==1){
22                idx1 = i;
23            }
24            else if (num==2){
25                idx2 = i;
26            }
27        }
28        return ans==n+1 ? -1 : ans;
29    }
30}