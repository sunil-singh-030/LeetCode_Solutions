// Last updated: 2/5/2026, 2:16:09 PM
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int ans = 0;
4        int c = 0;
5        for (int num : nums){
6            if (num==0){
7                c = 0;
8            }
9            else{
10                c++;
11                ans = Math.max(ans,c);
12            }
13        }
14        return ans;
15    }
16}