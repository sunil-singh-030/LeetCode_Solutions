// Last updated: 3/29/2026, 3:24:50 PM
1class Solution {
2    public int firstMatchingIndex(String s) {
3        int n = s.length();
4        for (int i=0 ; i<=n/2 ; i++){
5            if (s.charAt(i)==s.charAt(n-1-i)) return i;
6        }
7        
8        return -1;
9    }
10}