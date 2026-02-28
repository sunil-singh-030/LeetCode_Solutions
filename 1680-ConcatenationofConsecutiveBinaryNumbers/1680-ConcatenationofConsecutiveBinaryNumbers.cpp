// Last updated: 2/28/2026, 7:56:02 AM
1class Solution {
2public:
3    int concatenatedBinary(int n) {
4        const int mod = 1e9 + 7;
5        long long value = 0;
6        int bitLength = 0;
7
8        for (int i = 1; i <= n; i++) {
9            if ((i & (i - 1)) == 0) {
10                bitLength++;
11            }
12            value = ((value << bitLength) | i) % mod;
13        }
14
15        return value;
16    }
17};