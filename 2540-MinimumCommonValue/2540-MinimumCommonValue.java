// Last updated: 5/19/2026, 5:58:21 AM
1class Solution {
2    public int getCommon(int[] nums1, int[] nums2) {
3        HashSet<Integer> set = new HashSet<>();
4        for (int num : nums1){
5            set.add(num);
6        }
7        for (int num : nums2){
8            if (set.contains(num)){
9                return num;
10            }
11        }
12        return -1;
13    }
14}