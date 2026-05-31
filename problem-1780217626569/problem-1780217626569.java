// Last updated: 5/31/2026, 2:23:46 PM
1class Solution {
2    public int digitFrequencyScore(int n) {
3        int[] f = new int[10];
4        int temp = n;
5        while (temp>0){
6            f[temp%10]++;
7            temp /= 10;
8        }
9        int ans = 0;
10        for (int i=0 ; i<=9 ; i++){
11            ans += i*f[i];
12        }
13        return ans;
14    }
15}