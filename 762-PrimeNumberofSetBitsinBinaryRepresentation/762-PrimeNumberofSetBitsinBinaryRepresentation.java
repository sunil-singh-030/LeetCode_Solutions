// Last updated: 2/21/2026, 11:50:33 AM
1class Solution {
2    public int countPrimeSetBits(int left, int right) {
3        int cnt = 0;
4        for (int i=left ; i<=right ; i++){
5            int cbit = 0;
6            int temp = i;
7            while (temp>0){
8                cbit += temp%2==1 ? 1 : 0;
9                temp /= 2;
10            }
11            boolean notprime = false;
12            for (int j=2 ; j<cbit ; j++){
13                if (cbit%j==0){
14                    notprime = true;
15                    break;
16                }
17            }
18
19            if (!notprime && cbit>1){
20                cnt++;
21            }
22        }
23        return cnt;
24    }
25}