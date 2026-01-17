// Last updated: 1/17/2026, 11:00:43 AM
1class Solution {
2    public int[] resultsArray(int[] nums, int k) {
3        int n = nums.length;
4        int[] ans = new int[n-k+1];
5        int prevIdx = -1;
6        for (int i=1 ; i<k ; i++){
7            if (nums[i]-nums[i-1]!=1){
8                prevIdx = i-1;
9            }
10        }
11        if (prevIdx!=-1){
12            ans[0] = -1;
13        }
14        else{
15            ans[0] = nums[k-1];
16        }
17        for (int i=k ; i<n ; i++){
18            if (nums[i]-nums[i-1]!=1){
19                prevIdx = i-1;
20            }
21            if (prevIdx>i-k){
22                ans[i-k+1] = -1;
23            }
24            else{
25                ans[i-k+1] = nums[i];
26            }
27        }
28        return ans;
29    }
30}