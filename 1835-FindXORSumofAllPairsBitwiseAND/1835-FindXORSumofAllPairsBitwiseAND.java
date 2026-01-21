// Last updated: 1/21/2026, 12:07:11 PM
1class Solution {
2    public int getXORSum(int[] arr1, int[] arr2) {
3        int xor2 = 0;
4        for (int num : arr2){
5            xor2 ^= num;
6        } 
7        int ans = 0;
8        for (int num : arr1){
9            int curr = num&xor2;
10            ans ^= curr;
11        }
12        return ans;
13    }
14}