// Last updated: 4/18/2026, 8:33:38 AM
1class Solution {
2    public int mirrorDistance(int n) {
3        String s = String.valueOf(n);
4        StringBuilder sr = new StringBuilder();
5        for (int i=s.length()-1 ; i>=0 ; i--){
6            sr.append(s.charAt(i));
7        }
8        return Math.abs(n-Integer.valueOf(sr.toString()));
9    }
10}