// Last updated: 3/29/2026, 8:04:46 AM
1class Solution {
2    public boolean canBeEqual(String s1, String s2) {
3        char[] a = new char[4];
4        for (int i=0 ; i<4 ; i++){
5            a[i] = s1.charAt(i);
6        }
7        char[] b = new char[4];
8        for (int i=0 ; i<4 ; i++){
9            b[i] = s2.charAt(i);
10        }
11        if (!((a[0]==b[0] && a[2]==b[2]) || (a[0]==b[2] && a[2]==b[0]))) return false;
12        if (!((a[1]==b[1] && a[3]==b[3]) || (a[1]==b[3] && a[3]==b[1]) )) return false;
13        return true;
14    }
15}