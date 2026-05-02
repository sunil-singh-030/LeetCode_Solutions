// Last updated: 5/2/2026, 6:26:03 AM
1class Solution {
2    public int rotatedDigits(int n) {
3        int cnt = 0;
4        for (int i=1 ; i<=n ; i++){
5            int num = i;
6            boolean found = false;
7            boolean check = true;
8            while (num>0){
9                int dig = num%10;
10                if (dig==2 || dig==5 || dig==6 || dig==9){
11                    found = true;
12                }
13                if (dig==3 || dig==4 || dig==7){
14                    check = false;
15                    break;
16                }
17                num /= 10;
18            }
19            if (found && check){
20                cnt++;
21            }
22        }
23        return cnt;
24    }
25}