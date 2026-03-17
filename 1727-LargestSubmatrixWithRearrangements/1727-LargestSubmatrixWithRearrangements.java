// Last updated: 3/17/2026, 10:42:03 AM
1class Solution {
2    public int largestSubmatrix(int[][] matrix) {
3        int maxAns = 0;
4        int m = matrix.length;
5        int n = matrix[0].length;
6        int[] arr = new int[n];
7        for (int i=0 ; i<m ; i++){
8            for (int j=0 ; j<n ; j++){
9                if (matrix[i][j]==0){
10                    arr[j] = 0;
11                }
12                else{
13                    arr[j]++;
14                }
15            }
16            int[] temp = arr.clone();
17            
18            Arrays.sort(temp);
19            for (int j=0 ; j<n ; j++){
20                maxAns = Math.max(maxAns,temp[j]*(n-j));
21            }
22        }
23        return maxAns;
24    }
25}