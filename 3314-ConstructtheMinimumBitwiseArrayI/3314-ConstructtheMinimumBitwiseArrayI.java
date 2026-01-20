// Last updated: 1/20/2026, 10:19:44 AM
1class Solution {
2    public int[] minBitwiseArray(List<Integer> nums) {
3        int n = nums.size();
4        int[] ans = new int[n];
5        Arrays.fill(ans,-1);
6        for (int i=0 ; i<n ; i++){
7            int num = nums.get(i);
8            for (int j=0 ; j<num ; j++){
9                if ((j|(j+1))==num){
10                    ans[i] = j;
11                    break;
12                }
13            }
14        }
15        return ans;
16    }
17}