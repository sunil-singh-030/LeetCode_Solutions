// Last updated: 5/3/2026, 8:59:15 AM
1class Solution {
2    public boolean rotateString(String s, String goal) {
3        int n = s.length();
4        for (int i=0 ; i<n ; i++){
5            StringBuilder sb = new StringBuilder(s.substring(i));
6            sb.append(s.substring(0,i));
7            if (goal.equals(sb.toString())) return true;
8
9        }
10        return false;
11    }
12}