// Last updated: 5/18/2026, 10:15:39 PM
1class Solution {
2    public int countKthRoots(int l, int r, int k) {
3        System.out.println(helper(r+1,k));
4        return helper(r+1,k)-helper(l,k);
5    }
6    public int helper(int num , int k){
7        if (num==0) return 0;
8        int st = 0;
9        int end = num;
10        int cnt = 0;
11        while (st<=end){
12            int mid = (st+end)/2;
13            int val = (int) Math.pow(mid,k);
14            if (val<num){
15                cnt = mid;
16                st = mid+1;
17            }
18            else{
19                end = mid-1;
20            }
21
22        }
23        return cnt+1;
24    }
25}