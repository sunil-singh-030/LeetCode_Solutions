// Last updated: 5/10/2026, 9:04:20 AM
1class Solution {
2    public int maximumJumps(int[] nums, int target) {
3        int n = nums.length;
4        int[] maxJump = new int[n];
5        Arrays.fill(maxJump,-1);
6        maxJump[n-1] = 0;
7        for (int i=n-2 ; i>=0 ; i--){
8            for (int j=i+1 ; j<n ; j++){
9                if (maxJump[j]!=-1 && ((nums[j]-nums[i])<=target && (nums[j]-nums[i])>=-target)){
10                    maxJump[i] = Math.max(maxJump[i],1+maxJump[j]);
11                }
12            }
13        }
14        return maxJump[0];
15    }
16}