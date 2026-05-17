// Last updated: 5/17/2026, 7:07:35 AM
1class Solution {
2    public boolean canJump(int[] nums) {
3        int n = nums.length;
4        boolean[] canI = new boolean[n];
5        canI[n-1] = true;
6        for (int i=n-2 ; i>=0 ; i--){
7            int jump = nums[i];
8            if (i+jump>=n-1){
9                canI[i] = true;
10            }
11            else{
12                
13                for (int j=i+1 ; j<=i+jump ; j++){
14                    if (canI[j]){
15                        canI[i] = true;
16                        break;
17                    }
18                }
19            }
20            
21        }
22        return canI[0];
23    }
24}