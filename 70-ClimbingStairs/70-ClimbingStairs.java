// Last updated: 1/2/2026, 3:50:34 PM
1class Solution {
2    public int climbStairs(int n) {
3        if (n<3){
4            return n;
5        }
6        int n1 = 1;
7        int n2 = 2;
8        for (int i=3 ; i<=n ; i++){
9            int temp = n1+n2;
10            n1 = n2;
11            n2 = temp;
12        }
13        return n2;
14    }
15    
16}