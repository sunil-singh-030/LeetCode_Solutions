// Last updated: 5/17/2026, 7:21:26 AM
1class Solution {
2    public int jump(int[] nums) {
3        int n = nums.length;
4        int jump = 0;
5        int st = 0;
6        int end = 0;
7        while (end<n-1){
8            jump++;
9            int newSt = end+1;
10            int newEnd = newSt;
11            for (int i=st ; i<=end ; i++){
12                newEnd = Math.max(newEnd,i+nums[i]);
13            }
14            st = newSt;
15            end = newEnd;
16        }
17        return jump;
18    }
19}