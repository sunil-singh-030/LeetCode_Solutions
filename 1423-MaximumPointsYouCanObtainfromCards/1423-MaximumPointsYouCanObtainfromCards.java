// Last updated: 1/3/2026, 4:07:24 PM
1class Solution {
2    public int maxScore(int[] cardPoints, int k) {
3        int n = cardPoints.length;
4        int total = 0;
5        for (int x : cardPoints) total += x;
6
7        if (k == n) return total;
8
9        int windowSize = n - k;
10        int curr = 0;
11
12        
13        for (int i = 0; i < windowSize; i++) {
14            curr += cardPoints[i];
15        }
16
17        int minSum = curr;
18
19        for (int i = windowSize; i < n; i++) {
20            curr += cardPoints[i];
21            curr -= cardPoints[i - windowSize];
22            minSum = Math.min(minSum, curr);
23        }
24
25        return total - minSum;
26    }
27}
28