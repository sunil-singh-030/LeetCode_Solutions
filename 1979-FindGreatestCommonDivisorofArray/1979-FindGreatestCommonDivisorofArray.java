// Last updated: 7/18/2026, 6:20:14 AM
1class Solution {
2    public int findGCD(int[] nums) {
3        int min = 1001;
4        int max = 0;
5        for (int num : nums){
6            min = Math.min(min,num);
7            max = Math.max(max,num);
8        }
9
10        for (int i=Math.min(min,max) ; i>=2 ; i--){
11            if (min%i==0 && max%i==0){
12                return i;
13            }
14        }
15        return 1;
16    }
17}