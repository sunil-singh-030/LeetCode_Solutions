// Last updated: 1/1/2026, 10:10:18 AM
1class Solution {
2    public int[] plusOne(int[] digits) {
3        int n = digits.length;
4        int carry = 1;
5        for (int i=n-1 ; i>=0 ; i--){
6            if (digits[i]<9){
7                 digits[i] += carry;
8                 carry = 0;
9            }
10            else{
11                if (carry==1){
12                    digits[i] = 0;
13                }
14            }
15        }
16        if (carry==1){
17            int[] ans = new int[n+1];
18            ans[0] = 1;
19            for (int i=0 ; i<n ; i++){
20                ans[i+1] = digits[i]; 
21            }
22            return ans;
23        }
24        return digits;
25    }
26}