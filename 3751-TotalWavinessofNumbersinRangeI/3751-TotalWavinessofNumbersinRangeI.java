// Last updated: 6/4/2026, 6:08:32 AM
1class Solution {
2    public int totalWaviness(int num1, int num2) {
3        int cnt = 0;
4        if (num1<100){
5            num1 = 100;
6        }
7        while (num1<=num2){
8            String s = String.valueOf(num1);
9            int len = s.length();
10            for (int i=1 ; i<len-1 ; i++){
11                int l = s.charAt(i-1)-'0';
12                int m = s.charAt(i)-'0';
13                int r = s.charAt(i+1)-'0';
14                if ((m>l && m>r) || (l>m && r>m)){
15                    cnt++;
16                }
17            }
18            num1++;
19        }
20        return cnt;
21    }
22}