// Last updated: 2/26/2026, 11:19:05 AM
1class Solution {
2public:
3    int distributeCandies(int n, int limit) {
4        int cnt = 0;
5        for (int i=0 ; i<=limit ; i++){
6            for (int j=0 ; j<=limit ; j++){
7                int left = n-i-j;
8                if (left<=limit && left>=0){
9                    cnt++;
10                }
11            }
12        }
13        return cnt;
14    }
15};