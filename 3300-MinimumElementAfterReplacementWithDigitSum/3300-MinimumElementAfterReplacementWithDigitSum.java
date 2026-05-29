// Last updated: 5/29/2026, 6:41:12 AM
1class Solution {
2    public int minElement(int[] nums) {
3        int ans = 10001;
4        for (int num : nums){
5            int temp = num;
6            int sum = 0;
7            while (temp>0){
8                sum += temp%10;
9                temp /= 10;
10            }
11            ans = Math.min(ans,sum);
12        }
13        return ans;
14    }
15}