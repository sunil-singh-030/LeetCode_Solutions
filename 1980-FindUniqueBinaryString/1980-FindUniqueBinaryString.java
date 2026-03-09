// Last updated: 3/9/2026, 9:31:46 PM
1class Solution {
2    public String findDifferentBinaryString(String[] nums) {
3        StringBuilder ans = new StringBuilder();
4        for (int i=0;i<nums.length;i++){
5            String s = nums[i];
6            char ch = s.charAt(i);
7            if (ch=='1'){
8                ans.append('0');
9            }
10            else{
11                ans.append('1');
12            }
13        }
14        return ans.toString();
15    }
16}