// Last updated: 5/18/2026, 10:15:45 PM
1class Solution {
2    public int countKthRoots(int l, int r, int k) {
3        return helper(r+1,k)-helper(l,k);
4    }
5    public int helper(int num , int k){
6        if (num==0) return 0;
7        int st = 0;
8        int end = num;
9        int cnt = 0;
10        while (st<=end){
11            int mid = (st+end)/2;
12            int val = (int) Math.pow(mid,k);
13            if (val<num){
14                cnt = mid;
15                st = mid+1;
16            }
17            else{
18                end = mid-1;
19            }
20
21        }
22        return cnt+1;
23    }
24}