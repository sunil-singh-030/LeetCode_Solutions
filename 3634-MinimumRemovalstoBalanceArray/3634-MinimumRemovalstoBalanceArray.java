// Last updated: 2/6/2026, 9:54:13 AM
1class Solution {
2    public int minRemoval(int[] nums, int k) {
3        int n = nums.length;
4        if (n==1){
5            return 0;
6        }
7        Arrays.sort(nums);
8        int minans = Integer.MAX_VALUE;
9        for (int i=0 ; i<n-1 ; i++){
10            long num = (long)  nums[i];
11            int ind = -1;
12            int st = i+1;
13            int end = n-1;
14            while (st<=end){
15                int mid = (st+end)/2;
16                if ((long) nums[mid]<=k*num){
17                    ind = mid;
18                    st = mid+1;
19                }
20                else{
21                    end = mid-1;
22                }
23            }
24            if (ind!=-1){
25                minans = Math.min(minans,i+(n-ind-1));
26            }
27        }
28        if (minans==Integer.MAX_VALUE){
29            return n-1;
30        }
31        return minans;
32    }
33}