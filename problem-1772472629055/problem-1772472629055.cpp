// Last updated: 3/2/2026, 11:00:29 PM
1class Solution {
2public:
3    int minCost(int n) {
4        // 1 0
5        // 2 1
6        // 3 3
7        // 4 6
8        // 5 10
9        if (n<=2){
10            return n-1;
11        }
12        
13        int res = 1;
14        int add = 2;
15        for (int i=3 ; i<=n ; i++){
16            res += add;
17            add++;
18        }
19        return res;
20    }
21};