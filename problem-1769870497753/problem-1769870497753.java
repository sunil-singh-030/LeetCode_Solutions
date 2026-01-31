// Last updated: 1/31/2026, 8:11:37 PM
1class Solution {
2    public int minimumK(int[] nums) {
3        int n = nums.length;
4        int ans = 1;
5        int st = 1;
6        int end = Integer.MAX_VALUE-1;
7        while (st<=end){
8            int mid = (st+end)/2;
9            if (ispossible(nums,mid)){
10                ans =  mid;
11                end = mid-1;
12            }
13            else{
14                st = mid+1;
15            }
16        }
17        return ans;
18    }
19    public boolean ispossible(int[] nums, int k){
20        long req = 0;
21        for (int num : nums){
22            req += num/k;
23            if (num%k!=0){
24                req++;
25            }
26            if (req>(((long) k)*((long) k))){
27                return false;
28            }
29        }
30        return true;
31    }
32}