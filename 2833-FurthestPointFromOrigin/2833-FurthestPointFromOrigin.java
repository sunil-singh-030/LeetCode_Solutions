// Last updated: 4/24/2026, 6:36:43 AM
1class Solution {
2    public int furthestDistanceFromOrigin(String moves) {
3        int l = 0;
4        int r = 0;
5        int sp = 0;
6        for (char ch : moves.toCharArray()){
7            if (ch=='L'){
8                l++;
9            }
10            else if (ch=='R'){
11                r++;
12            }
13            else{
14                sp++;
15            }
16        }
17        return Math.abs(l-r)+sp;
18    }
19}