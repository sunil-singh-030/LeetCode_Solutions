// Last updated: 1/4/2026, 10:43:22 AM
1class Solution {
2    public int sumFourDivisors(int[] nums) {
3        int ans = 0;
4        for (int num : nums){
5            int cdiv = 0;
6            int sum = num+1;
7            for (int i=2 ; i<num ; i++){
8                if (num%i==0){
9                    sum += i;
10                    cdiv++;
11                }
12                if (cdiv==3){
13                    break;
14                }
15            }
16            if (cdiv==2){
17                ans += sum;
18            }
19        }
20        return ans;
21    }
22}