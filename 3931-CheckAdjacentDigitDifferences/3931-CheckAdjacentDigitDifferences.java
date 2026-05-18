// Last updated: 5/18/2026, 10:05:50 PM
1class Solution {
2    public boolean isAdjacentDiffAtMostTwo(String s) {
3        int n = s.length();
4        for (int i=1 ; i<n ; i++){
5            char ch1 = s.charAt(i-1);
6            char ch2 = s.charAt(i);
7            if (Math.abs(ch1-ch2)>2) return false;
8        }
9        return  true;
10
11    }
12}