// Last updated: 2/1/2026, 8:02:20 AM
1class Solution {
2    public int countMonobit(int n) {
3        int cnt = 0;
4        int len = 0;
5        int cnt1 = 0;
6        while (n>0){
7            if (n%2==1){
8                cnt1++;
9            }
10            len++;
11            n /=2;
12        }
13        if (cnt1==len){
14            cnt++;
15        }
16        cnt += len;
17        return cnt;
18    }
19}