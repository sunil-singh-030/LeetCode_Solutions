// Last updated: 3/27/2026, 6:49:29 AM
1class Solution {
2    public boolean areSimilar(int[][] mat, int k) {
3        int m = mat.length;
4        int n = mat[0].length;
5
6        k %= n;
7        for (int i=0 ; i<m ; i++){
8            if (i%2==0){
9                int[] r = mat[i];
10                int stIdx = 0;
11                int temp = k;
12                while (temp-->0){
13                    stIdx++;
14                    stIdx %= n;
15                }
16                //System.out.println(i+" "+stIdx);
17                int idx1 = 0;
18                int idx2 = stIdx;
19                while (idx1<n){
20                    //System.out.println(mat[idx1]+" "+mat[idx2]);
21                    if (r[idx1]!=r[idx2]){
22                        return false;
23                    }
24                    idx1++;
25                    idx2++;
26                    idx2 %= n;
27                }
28            }
29            else{
30                int[] r = mat[i];
31                int stIdx = 0;
32                int temp = k;
33                while (temp-->0){
34                    stIdx--;
35                    if (stIdx==-1){
36                        stIdx = n-1;
37                    }
38                }
39                //System.out.println(i+" "+stIdx);
40                int idx1 = 0;
41                int idx2 = stIdx;
42                while (idx1<n){
43                    if (r[idx1]!=r[idx2]){
44                        return false;
45                    }
46                    idx1++;
47                    idx2++;
48                    idx2 %= n;
49                }
50            }
51        }
52        return true;
53    }
54}