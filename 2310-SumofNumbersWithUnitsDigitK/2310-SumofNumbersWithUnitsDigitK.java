// Last updated: 1/5/2026, 10:30:02 AM
1class Solution {
2    public int minimumNumbers(int num, int k) {
3        if (num==0){
4            return 0;
5        }
6        if (k>num){
7            return -1;
8        }
9        int lastdig = num%10;
10        int cnt = 1;
11        int temp = k;
12        while (temp%10!=lastdig){
13            cnt++;
14            temp += k;
15            if (cnt==11){
16                break;
17            }
18        }
19        if (k*cnt>num){
20            return -1;
21        }
22        return cnt==11 ? -1 : cnt;
23    }
24}