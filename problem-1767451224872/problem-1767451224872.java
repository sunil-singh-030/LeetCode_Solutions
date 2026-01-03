// Last updated: 1/3/2026, 8:10:24 PM
1class Solution {
2    public String reversePrefix(String s, int k) {
3        String ans = "";
4        for (int i=k-1 ; i>=0 ; i--){
5            ans += s.charAt(i);
6        }
7        return ans + s.substring(k);
8    }
9}