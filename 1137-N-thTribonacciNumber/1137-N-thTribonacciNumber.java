// Last updated: 1/6/2026, 10:32:22 AM
1class Solution {
2    public int tribonacci(int n) {
3        if (n<2){
4            return n;
5        }
6        if (n==2){
7            return 1;
8        }
9        int n0 = 0;
10        int n1 = 1;
11        int n2 = 1;
12        for (int i=3 ; i<=n ; i++){
13            int temp1 = n0 + n1 + n2;
14            int temp2 = n1;
15            n1 = n2;
16            n0 = temp2;
17            n2 = temp1;
18        }
19        return n2;
20    }
21}