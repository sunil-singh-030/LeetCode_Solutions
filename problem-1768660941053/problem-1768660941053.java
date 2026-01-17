// Last updated: 1/17/2026, 8:12:21 PM
1class Solution {
2    public int minOperations(int[] nums, int[] target) {
3        HashSet<Integer> set = new HashSet<>();
4        int n = nums.length;
5        for (int i=0 ; i<n ; i++){
6            if (nums[i]!=target[i]){
7                set.add(nums[i]);
8            }
9        }
10        return set.size();
11    }
12}