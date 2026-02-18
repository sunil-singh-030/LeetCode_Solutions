// Last updated: 2/18/2026, 9:40:06 AM
1class Solution {
2    public boolean hasAlternatingBits(int n) {
3        int prevBit = n%2;
4        n /= 2;
5        while (n>0){
6            int currBit = n%2;
7            if (prevBit==currBit){
8                return false;
9            }
10            prevBit = 1 - prevBit;
11            n /= 2;
12            
13        }
14        return true;
15    }
16}