// Last updated: 4/8/2026, 10:43:06 AM
1class Solution {
2    public int xorAfterQueries(int[] nums, int[][] queries) {
3        int n = nums.length;
4        long mod = 1000000007;
5        long[] arr = new long[n];
6        for (int i=0 ; i<n ; i++){
7            arr[i] = nums[i];
8        }
9        int q = queries.length;
10        for (int i=0 ; i<q ; i++){
11            int st = queries[i][0];
12            int end = queries[i][1];
13            int k = queries[i][2];
14            int v = queries[i][3];
15            while (st<=end){
16                arr[st] = (arr[st]*v) % mod;
17                st += k;
18            }
19        }
20        long ans = 0;
21        for (long num : arr){
22            ans ^= num;
23        }
24        return (int) ans;
25    }
26}