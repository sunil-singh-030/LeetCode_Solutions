// Last updated: 1/4/2026, 8:28:10 AM
1class Solution {
2    public String largestEven(String s) {
3        int n = s.length();
4        for (int i=n-1 ; i>=0 ; i--){
5            if (s.charAt(i)=='2'){
6                return s.substring(0,i+1);
7            }
8        }
9        return "";
10    }
11}