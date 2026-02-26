// Last updated: 2/26/2026, 11:17:04 AM
1class Solution {
2public:
3    int distributeCandies(int n, int limit) {
4        int cnt = 0;
5        for (int i=0 ; i<=limit ; i++){
6            for (int j=0 ; j<=limit ; j++){
7                for (int k=0 ; k<=limit ; k++){
8                    if (i+j+k==n){
9                        cnt++;
10                    }
11                }
12            }
13        }
14        return cnt;
15    }
16};