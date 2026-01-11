// Last updated: 1/11/2026, 8:03:18 AM
1class Solution {
2    public int centeredSubarrays(int[] nums) {
3        int n = nums.length;
4        int cnt = 0;
5        for (int i=0 ; i<n ; i++){
6            int sum = 0;
7            HashSet<Integer> set = new HashSet<>();
8            for (int j=i ; j<n ; j++){
9                sum += nums[j];
10                set.add(nums[j]);
11                if (set.contains(sum)){
12                    cnt++;
13                }
14                    
15            }
16        }
17        return cnt;
18    }
19}