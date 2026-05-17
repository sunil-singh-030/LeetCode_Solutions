// Last updated: 5/17/2026, 8:29:04 PM
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        Arrays.sort(nums);
4        int n = nums.length;
5        if (n==0) return 0;
6        int maxLen = 1;
7        int currLen = 1;
8        for (int i=1 ; i<n ; i++){
9            if (nums[i]==nums[i-1]){
10                continue;
11            }
12            if (nums[i]-nums[i-1]==1){
13                currLen++;
14            }
15            else{
16                maxLen = Math.max(maxLen,currLen);
17                currLen = 1;
18            }
19        }
20        maxLen = Math.max(maxLen,currLen);
21        return maxLen;
22        
23    }
24}