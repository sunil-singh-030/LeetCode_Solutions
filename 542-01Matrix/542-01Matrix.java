// Last updated: 4/7/2026, 11:32:53 AM
1class Solution {
2    public int[][] updateMatrix(int[][] mat) {
3        int m = mat.length;
4        int n = mat[0].length;
5        int[][] ans = new int[m][n];
6        for (int[] arr : ans){
7            Arrays.fill(arr,Integer.MAX_VALUE);
8        }
9        Queue<int[]> q = new LinkedList<>();
10        for (int i=0 ; i<m ; i++){
11            for (int j=0 ; j<n ; j++){
12                if (mat[i][j]==0){
13                    ans[i][j] = 0;
14                    q.add(new int[]{i,j,0});
15                }
16            }
17        }
18        int[] r = {-1,0,1,0};
19        int[] c = {0,1,0,-1};
20        while (!q.isEmpty()){
21            int[] cp = q.poll();
22
23            for (int i=0 ; i<4 ; i++){
24                int newR = cp[0]+r[i];
25                int newC = cp[1]+c[i];
26                if (newR<0 || newC<0 || newR>=m || newC>=n) continue;
27                int newDis = cp[2]+1;
28                if (newDis<ans[newR][newC]){
29                    ans[newR][newC] = newDis;
30                    q.add(new int[]{newR,newC,cp[2]+1});
31                }
32            }
33        }
34        return ans;
35    }
36}