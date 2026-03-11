// Last updated: 3/11/2026, 9:54:31 AM
1class Solution {
2public:
3    int bitwiseComplement(int n) {
4        if (n==0) return 1;
5        int res = 0;
6        int power = 0;
7        while (n>0){
8            int bit = (n>>0)&1;
9            if (bit==0){
10                res += pow(2,power);
11            }
12            n /= 2;
13            power++;
14        }
15        return res;
16    }
17};