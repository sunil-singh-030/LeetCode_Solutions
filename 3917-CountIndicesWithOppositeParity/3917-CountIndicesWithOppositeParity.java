// Last updated: 5/3/2026, 4:16:52 PM
1class Solution {
2    public int[] minCost(int[] nums, int[][] queries) {
3        int n = nums.length;
4
5        int[] right = new int[n+1];
6        right[1] = 1;
7        for (int i=1 ; i<n-1 ; i++){
8            right[i+1] = right[i];
9            if (Math.abs(nums[i]-nums[i+1])<Math.abs(nums[i]-nums[i-1])){
10                right[i+1]++;
11            }
12            else{
13                right[i+1] += Math.abs(nums[i]-nums[i+1]);
14            }
15        }
16
17        int[] left = new int[n+1];
18        left[n-1] = 1;
19        for (int i=n-2 ; i>0 ; i--){
20            left[i] = left[i+1];
21            if (Math.abs(nums[i]-nums[i-1])<=Math.abs(nums[i]-nums[i+1])){
22                left[i]++;
23            }
24            else{
25                left[i] += Math.abs(nums[i]-nums[i-1]);
26            }
27        }
28
29        int[] ans = new int[queries.length];
30        for (int i=0 ; i<queries.length ; i++){
31            int st = queries[i][0];
32            int end = queries[i][1];
33            if (st<=end){
34                ans[i] = right[end]-right[st];
35            }
36            else{
37                ans[i] = left[end+1]-left[st+1];
38            }
39        }
40        // System.out.println(Arrays.toString(right));
41        // System.out.println(Arrays.toString(left));
42        return ans;
43
44    }
45}