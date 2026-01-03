// Last updated: 1/3/2026, 9:55:46 PM
1class Solution {
2    public int findMaxVal(int n, int[][] restrictions, int[] diff) {
3        long[] upper = new long[n];
4        for (int i = 0; i < n; i++) {
5            upper[i] = (long) Math.pow(10,18);
6        }
7        upper[0] = 0;
8        
9        for (int[] r : restrictions) {
10            int idx = r[0];
11            int maxVal = r[1];
12            upper[idx] = Math.min(upper[idx], maxVal);
13        }
14
15        long[] left = new long[n];
16        left[0] = 0;
17        for (int i = 1; i < n; i++) {
18            left[i] = Math.min(upper[i],left[i - 1] + diff[i - 1]);
19        }
20        
21        long[] right = new long[n];
22        right[n - 1] = upper[n - 1];
23        for (int i = n - 2; i >= 0; i--) {
24            right[i] = Math.min(upper[i],right[i + 1] + diff[i]);
25        }
26        long ans = 0;
27        for (int i = 0; i < n; i++) {
28            ans = Math.max(ans, Math.min(left[i], right[i]));
29        }
30
31        return (int) ans;
32    }
33}