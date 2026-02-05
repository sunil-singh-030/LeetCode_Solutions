// Last updated: 2/5/2026, 2:20:52 PM
1class Solution {
2    public int[] findErrorNums(int[] nums) {
3        int n = nums.length;
4        boolean[] exist = new boolean[n+1];
5        int[] ans = new int[2];
6        for (int num : nums){
7            if (exist[num]){
8                ans[0] = num;
9            }
10            else{
11                exist[num] = true;
12            }
13        }
14        for (int i=1 ; i<=n ; i++){
15            if (!exist[i]){
16                ans[1] = i;
17                break;
18            }
19        }
20        return ans;
21    }
22}