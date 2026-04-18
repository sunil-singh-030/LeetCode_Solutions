// Last updated: 4/18/2026, 7:58:36 AM
1class Solution {
2    public int mirrorDistance(int n) {
3        String s = String.valueOf(n);
4        String sr = "";
5        for (int i=s.length()-1 ; i>=0 ; i--){
6            sr += s.charAt(i);
7        }
8        return Math.abs(n-Integer.valueOf(sr));
9    }
10}