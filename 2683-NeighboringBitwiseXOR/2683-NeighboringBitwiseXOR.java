// Last updated: 1/21/2026, 11:52:04 AM
1class Solution {
2    public int xorAllNums(int[] nums1, int[] nums2) {
3        int exor1 = 0;;
4        if (nums2.length%2==1){
5            for (int num : nums1){
6                exor1^=num;
7            }
8        }
9        
10        int exor2 = 0;
11        if (nums1.length%2==1){
12            for (int num : nums2){
13                exor2^=num;
14            }
15        }
16        return exor1^exor2;
17
18    }
19}