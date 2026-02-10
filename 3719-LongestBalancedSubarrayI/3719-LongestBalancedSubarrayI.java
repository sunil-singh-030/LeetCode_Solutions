// Last updated: 2/10/2026, 10:14:21 AM
1class Solution {
2    public int longestBalanced(int[] nums) {
3        int n = nums.length;
4        int maxLen = 0;
5        for (int i=0 ; i<n ; i++){
6            HashSet<Integer> eSet = new HashSet<>();
7            HashSet<Integer> oSet = new HashSet<>();
8            for (int j=i ; j<n ; j++){
9                if (nums[j]%2==0){
10                    eSet.add(nums[j]);
11                }
12                else{
13                    oSet.add(nums[j]);
14                }
15                if (eSet.size()==oSet.size()){
16                    maxLen = Math.max(maxLen,j-i+1);
17                }
18            }
19        }
20        return maxLen;
21    }
22}