// Last updated: 3/22/2026, 9:58:00 AM
1class Solution {
2    public boolean uniformArray(int[] nums1) {
3        int n = nums1.length;
4        int ce = 0;
5        int co = 0;
6        for (int num : nums1){
7            if (num%2==1){
8                co++;
9            }
10            else{
11                ce++;
12            }
13        }
14        if (ce==n || co==n) return true;
15        if (co>1) return true;
16        if (ce>0 && co>0) return true;
17        return false;
18    }
19}