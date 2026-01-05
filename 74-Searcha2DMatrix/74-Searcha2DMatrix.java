// Last updated: 1/5/2026, 4:02:31 PM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5
6        int low = 0;
7        int high = m * n - 1;
8
9        while (low <= high) {
10            int mid = low + ((high - low) >> 1);  // bit shift
11
12            int r = mid / n;
13            int c = mid % n;
14
15            int val = matrix[r][c];
16
17            if (val == target) return true;
18            else if (val < target) low = mid + 1;
19            else high = mid - 1;
20        }
21        return false;
22    }
23}
24