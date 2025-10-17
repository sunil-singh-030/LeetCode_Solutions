// Last updated: 10/17/2025, 12:41:42 PM
class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        int fresh = 0;
        
        // Step 1: Add all rotten oranges initially to queue
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new Pair(i, j, 0));
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        // Step 2: BFS from all rotten oranges simultaneously
        int time = 0;
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, -1, 0, 1};
        while (!q.isEmpty()) {
            Pair p = q.poll();
            int r = p.r;
            int c = p.c;
            int dis = p.dis;
            time = Math.max(time, dis);

            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];
                if (nr >= 0 && nc >= 0 && nr < m && nc < n && grid[nr][nc] == 1) {
                    grid[nr][nc] = 2; // rot the fresh orange
                    fresh--;
                    q.offer(new Pair(nr, nc, dis + 1));
                }
            }
        }

        // Step 3: If any fresh orange remains, return -1
        return fresh == 0 ? time : -1;
    }
}

class Pair {
    int r, c, dis;
    Pair(int r, int c, int dis) {
        this.r = r;
        this.c = c;
        this.dis = dis;
    }
}
