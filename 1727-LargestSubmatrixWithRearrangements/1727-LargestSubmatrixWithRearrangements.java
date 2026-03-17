// Last updated: 3/17/2026, 10:39:09 AM
1class Solution {
2    public int largestSubmatrix(int[][] matrix) {
3        // 0 0 1
4        // 1 1 2
5        // 2 1 3
6
7        int maxAns = 0;
8        int m = matrix.length;
9        int n = matrix[0].length;
10        int[] arr = new int[n];
11        for (int i=0 ; i<m ; i++){
12            for (int j=0 ; j<n ; j++){
13                if (matrix[i][j]==0){
14                    arr[j] = 0;
15                }
16                else{
17                    arr[j]++;
18                }
19            }
20            int[] temp = arr.clone();
21            
22            Arrays.sort(temp);
23            //System.out.println(Arrays.toString(temp));
24            for (int j=0 ; j<n ; j++){
25                maxAns = Math.max(maxAns,temp[j]*(n-j));
26            }
27            
28            System.out.println(maxAns);
29        }
30        return maxAns;
31    }
32}