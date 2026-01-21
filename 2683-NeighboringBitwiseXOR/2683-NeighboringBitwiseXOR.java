// Last updated: 1/21/2026, 11:43:32 AM
1class Solution {
2    public int xorAllNums(int[] nums1, int[] nums2) {
3        int exor1 = 0;;
4        if (nums2.length%2==0){
5            exor1=0;
6        }
7        else{
8            for (int i=0;i<nums1.length;i++){
9                exor1^=nums1[i];
10            }
11        }
12        int exor2 = 0;
13        if (nums1.length%2==0){
14            exor2=0;
15        }
16        else{
17            for (int i=0;i<nums2.length;i++){
18                exor2^=nums2[i];
19            }
20        }
21        return exor1^exor2;
22
23    }
24}