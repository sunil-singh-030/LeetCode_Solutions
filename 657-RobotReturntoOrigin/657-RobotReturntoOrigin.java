// Last updated: 4/5/2026, 10:45:22 AM
1class Solution {
2    public boolean judgeCircle(String moves) {
3        int updown = 0;
4        int leftright = 0;
5        for (char ch : moves.toCharArray()){
6            if (ch=='L'){
7                leftright++;
8            }
9            else if (ch=='R'){
10                leftright--;
11            }
12            else if (ch=='U'){
13                updown++;
14            }
15            else{
16                updown--;
17            }
18        }
19        return (updown==0 && leftright==0) ;
20    }
21}