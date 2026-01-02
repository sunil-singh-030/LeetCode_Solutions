// Last updated: 1/2/2026, 10:57:57 AM
1class Solution {
2    public int repeatedNTimes(int[] nums) {
3        HashSet<Integer> set = new HashSet<>();
4        for (int num : nums){
5            if (set.contains(num)){
6                return num;
7            }
8            set.add(num);
9        }
10        return -1;
11    }
12}