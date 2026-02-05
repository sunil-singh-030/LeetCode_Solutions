// Last updated: 2/5/2026, 9:23:48 AM
1class Solution {
2    public int[] constructTransformedArray(int[] nums) {
3        int n = nums.length;
4        int[] ans = new int[n];
5        for (int i=0 ; i<n ; i++){
6            int num = nums[i];
7            if (num==0){
8                ans[i] = num;
9            }
10            else if (num>0){
11                int idx = i;
12                while (num>0){
13                    idx++;
14                    idx %= n;
15                    num--;
16                }
17                ans[i] = nums[idx];
18            }
19            else{
20                int idx = i;
21                while (num<0){
22                    idx--;
23                    idx += n;
24                    idx %= n;
25                    num++;
26                }
27                ans[i] = nums[idx];
28            }
29        }
30        return ans;
31    }
32}