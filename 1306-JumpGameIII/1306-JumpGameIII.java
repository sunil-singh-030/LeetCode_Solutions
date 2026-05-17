// Last updated: 5/17/2026, 7:01:21 AM
1class Solution {
2    public boolean canReach(int[] arr, int start) {
3        boolean[] vis = new boolean[arr.length];
4        return helper(arr,start,vis);
5        
6    }
7    public boolean helper(int[] arr, int st, boolean[] vis){
8        if (st<0 || st>=arr.length || vis[st]){
9            return false;
10        }
11        if (arr[st]==0){
12            return true;
13        }
14
15        vis[st] = true;
16        int back = st-arr[st];
17        int ahead = st+arr[st];
18        boolean res = false;
19
20        
21        
22        res = res || helper(arr,back,vis);
23        res = res || helper(arr,ahead,vis);
24        return res;
25        
26    }
27}