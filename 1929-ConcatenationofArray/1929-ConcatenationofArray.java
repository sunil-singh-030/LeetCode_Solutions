// Last updated: 2/5/2026, 2:14:59 PM
1class Solution {
2    public int[] shuffle(int[] nums, int n) {
3        int[] ans = new int[2*n];
4        int idx1 = 0;
5        int idx2 = n;
6        for (int i=0 ; i<2*n ; i++){
7            if (i%2==0){
8                ans[i] = nums[idx1];
9                idx1++;
10            }
11            else{
12                ans[i] = nums[idx2];
13                idx2++;
14            }
15        }
16        return ans;
17    }
18}