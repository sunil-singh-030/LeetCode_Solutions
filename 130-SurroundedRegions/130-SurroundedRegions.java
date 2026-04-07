// Last updated: 4/7/2026, 12:24:07 PM
1class Solution {
2    int[] r = {-1,0,1,0};
3    int[] c = {0,1,0,-1};
4    public void solve(char[][] board) {
5        int m = board.length;
6        int n = board[0].length;
7        
8        for (int i=0 ; i<m ; i++){
9            for (int j=0 ; j<n ; j++){
10                if (board[i][j]=='O'){
11                    boolean[][] vis = new boolean[m][n];
12
13                    if (isgdRg(board,i,j,vis)){
14                        update(board,i,j);
15                    }
16                }
17            }
18        }
19    }
20    public boolean isgdRg(char[][] board, int row , int col, boolean[][] vis){
21        if (row==board.length-1 || col==board[0].length-1 || row==0 || col==0){
22            return false;
23        }
24        boolean res = true;
25        vis[row][col] = true;
26        for (int i=0 ; i<4 ; i++){
27            int newR = r[i]+row;
28            int newC = c[i]+col;
29            if (newR<0 || newC<0 || newR>=board.length || newC>=board[0].length){
30                continue;
31            }
32            if (board[newR][newC]=='X' || vis[newR][newC]) continue;
33            res = res & isgdRg(board,newR,newC,vis);
34        }
35        return res;
36    }
37    public void update(char[][] board, int row , int col){
38
39        board[row][col] = 'X';
40        for (int i=0 ; i<4 ; i++){
41            int newR = r[i]+row;
42            int newC = c[i]+col;
43            if (newR<0 || newC<0 || newR>=board.length || newC>=board[0].length){
44                continue;
45            }
46            if (board[newR][newC]=='X') continue;
47            update(board,newR,newC);
48        }
49        return;
50    }
51}