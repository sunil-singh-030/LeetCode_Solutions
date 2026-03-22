// Last updated: 3/22/2026, 10:10:23 AM
1class Solution {
2    public boolean uniformArray(int[] nums1) {
3        int n = nums1.length;
4        int ce = 0;
5        int co = 0;
6        for (int num : nums1){
7            if (num%2==0){
8                ce++;
9            }
10            else{
11                co++;
12            }
13        }
14        if (ce==0 || co==0) return true;
15
16        
17        // odd
18        int mine = Integer.MAX_VALUE;
19        int mino = Integer.MAX_VALUE;
20        for (int num : nums1){
21            if (num%2==0){
22                mine = Math.min(mine,num);
23            }
24            else{
25                mino = Math.min(mino,num);
26            }
27        }
28        if (mino<mine) return true;
29        return false;
30    }
31}