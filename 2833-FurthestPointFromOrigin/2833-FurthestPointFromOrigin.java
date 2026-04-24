// Last updated: 4/24/2026, 6:37:33 AM
1class Solution {
2    public int furthestDistanceFromOrigin(String moves) {
3        int dis = 0;
4        int sp = 0;
5        for (char ch : moves.toCharArray()){
6            if (ch=='L'){
7                dis++;
8            }
9            else if (ch=='R'){
10                dis--;
11            }
12            else{
13                sp++;
14            }
15        }
16        return Math.abs(dis)+sp;
17    }
18}