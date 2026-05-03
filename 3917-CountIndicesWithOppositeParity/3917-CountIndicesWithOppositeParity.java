// Last updated: 5/3/2026, 3:48:12 PM
1class Solution {
2    public int[] countOppositeParity(int[] nums) {
3        int e = 0;
4        int o = 0;
5        int[] ans = new int[nums.length];
6        for (int i=nums.length-1 ; i>=0 ; i--){
7            if (nums[i]%2==0){
8                ans[i] = o;
9                e++;
10            }
11            else{
12                ans[i] = e;
13                o++;
14            }
15        }
16        return ans;
17    }
18}