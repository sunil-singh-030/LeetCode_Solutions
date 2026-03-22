// Last updated: 3/22/2026, 6:43:45 AM
1class Solution {
2    public boolean findRotation(int[][] mat, int[][] target) {
3        int m = mat.length;
4        int n = mat[0].length;
5
6        // top
7        boolean found = true;
8        for (int i=0 ; i<m ; i++){
9            for (int j=0 ; j<n ; j++){
10                if (mat[i][j]!=target[i][j]){
11                    found = false;
12                    break;
13                }
14            }
15            if (!found){
16                break;
17            }
18        }
19        if (found) return true;
20
21
22        // down
23        found = true;
24        for (int i=m-1 ; i>=0 ; i--){
25            for (int j=n-1 ; j>=0 ; j--){
26                int row = Math.abs(i-(m-1));
27                int col = Math.abs(j-(n-1));
28                if (mat[i][j]!=target[row][col]){
29                    found = false;
30                    break;
31                }
32            }
33            if (!found) break;
34        }
35        if (found) return true;
36
37        // left
38        found = true;
39        for (int i=0 ; i<n ; i++){
40            for (int j=m-1 ; j>=0 ; j--){
41                int row = i;
42                int col = m-1-j;
43                if (mat[j][i]!=target[row][col]){
44                    found = false;
45                    break;
46                }
47            }
48            if (!found) break;
49        }
50        if (found) return true;
51
52        // right
53        found = true;
54        for (int i=n-1 ; i>=0 ; i--){
55            for (int j=0 ; j<m ; j++){
56                int row = n-1-i;
57                int col = j;
58                if (mat[j][i]!=target[row][col]){
59                    found = false;
60                    break;
61                }
62            }
63            if (!found) break;
64        }
65        return found;
66    }
67}