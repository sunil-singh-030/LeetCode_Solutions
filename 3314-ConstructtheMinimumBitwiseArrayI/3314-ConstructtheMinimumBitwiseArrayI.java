// Last updated: 1/20/2026, 10:23:02 AM
1class Solution {
2    public int[] minBitwiseArray(List<Integer> nums) {
3        int n = nums.size();
4        int[] ans = new int[n];
5        Arrays.fill(ans,-1);
6        for (int i=0 ; i<n ; i++){
7            int num = nums.get(i);
8            if (num%2==1){
9                for (int j=0 ; j<num ; j++){
10                    if ((j|(j+1))==num){
11                        ans[i] = j;
12                        break;
13                    }
14                }
15            }
16        }
17        return ans;
18    }
19}