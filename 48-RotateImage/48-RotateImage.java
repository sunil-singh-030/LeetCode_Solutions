// Last updated: 5/4/2026, 6:43:19 AM
1class Solution {
2    public void rotate(int[][] matrix) {
3        int n = matrix.length;
4        int minr = 0;
5        int minc = 0;
6        int maxr = n-1;
7        int maxc = n-1;
8        int move = n/2;
9        int movecnt = n-1;
10        while (move-->0){
11            for (int i=0 ; i<movecnt ; i++){
12                int temp1 = matrix[minr][minc+i];
13                int temp2 = matrix[minr+i][maxc];
14                int temp3 = matrix[maxr][maxc-i];
15                int temp4 = matrix[maxr-i][minc];
16                matrix[minr][minc+i] = temp4;
17                matrix[minr+i][maxc] = temp1;
18                matrix[maxr][maxc-i] = temp2;
19                matrix[maxr-i][minc] = temp3;
20            }
21            movecnt -= 2;
22            minr++;
23            minc++;
24            maxr--;
25            maxc--;
26            // for (int[] a : matrix){
27            //     System.out.println(Arrays.toString(a));
28            // }
29        }
30        
31    }
32}