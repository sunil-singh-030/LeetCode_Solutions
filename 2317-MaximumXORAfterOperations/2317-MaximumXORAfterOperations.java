// Last updated: 2/11/2026, 12:36:31 PM
1class Solution {
2    public int maximumXOR(int[] nums) {
3        int ans = 0;
4        for (int i=0 ; i<32 ; i++){
5            int cnt1 = 0;
6            for (int j=0 ; j<nums.length ; j++){
7                if (nums[j]>0){
8                    cnt1 += nums[j]%2==1 ? 1 : 0;
9                    nums[j] /= 2;
10                }
11                
12            }
13            if (cnt1>0){
14                ans += (int) Math.pow(2,i);
15            }
16            
17        }
18        return ans;
19    }
20}