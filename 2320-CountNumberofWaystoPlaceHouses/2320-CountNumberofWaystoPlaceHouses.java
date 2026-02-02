// Last updated: 2/2/2026, 10:10:15 AM
1class Solution {
2    public int countHousePlacements(int n) {
3        int MOD = 1_000_000_007;
4
5        long a = 1;
6        long b = 2;
7
8        for (int i = 2; i <= n; i++) {
9            long c = (a + b) % MOD;
10            a = b;
11            b = c;
12        }
13
14        return (int)((b * b) % MOD);
15    }
16}
17