// Last updated: 5/20/2026, 3:15:26 PM
1class Solution {
2    public int maxProduct(int[] nums) {
3        int n = nums.length;
4        int prevmin = 1;
5        int prevmax = 1;
6        int ans = Integer.MIN_VALUE;
7        for (int i=0 ; i<n ; i++){
8            int num = nums[i];
9            int currMax = Math.max(num*prevmin,num*prevmax);
10            ans = Math.max(ans,currMax);
11            if (num>=0){
12                prevmax = Math.max(1,prevmax*num);
13                prevmin = Math.min(1,num*prevmin);
14            }
15            else{
16                int temp = prevmin;
17                prevmin = Math.min(1,prevmax*num);
18                prevmax = Math.max(1,temp*num);
19            }
20        }
21        return ans;
22    }
23    
24}