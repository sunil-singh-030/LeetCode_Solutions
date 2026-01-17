// Last updated: 1/17/2026, 8:05:40 PM
1class Solution {
2    public int[] bestTower(int[][] towers, int[] center, int radius) {
3        int[] ans = new int[]{-1,-1};
4        int qua = -1;
5        for (int[] t : towers){
6            int dis = Math.abs(center[0]-t[0]) + Math.abs(center[1]-t[1]);
7            if (dis<=radius){
8                if (t[2]>qua){
9                    ans = new int[]{t[0],t[1]};
10                    qua = t[2];
11                }
12                else if (t[2]==qua){
13                    if (ans[0]>t[0]){
14                        ans = new int[]{t[0],t[1]};
15                    }
16                    else if (ans[0]==t[0] && ans[1]>t[1]){
17                        ans = new int[]{t[0],t[1]};
18                    }
19                }
20            }
21        }
22        return ans;
23    }
24}