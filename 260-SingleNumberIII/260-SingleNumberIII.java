// Last updated: 1/14/2026, 12:42:39 PM
1class Solution {
2    public int[] singleNumber(int[] nums) {
3        int xor = 0;
4        for (int num : nums){
5            xor ^= num;
6        }
7        int req = xor & (-xor);
8        int n1 = 0;
9        for (int num : nums){
10            if ((req&num)==0){
11                n1 ^= num;
12            }
13        }
14        int[] ans = new int[2];
15        ans[0] = n1;
16        ans[1] = xor ^ n1;
17        return ans;
18
19    }
20}