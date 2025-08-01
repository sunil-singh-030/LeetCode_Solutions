// Last updated: 8/1/2025, 7:03:24 AM
class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int exor1;
        if (nums2.length%2==0){
            exor1=0;
        }
        else{
            exor1=nums1[0];
            for (int i=1;i<nums1.length;i++){
                exor1^=nums1[i];
            }
        }
        int exor2;
        if (nums1.length%2==0){
            exor2=0;
        }
        else{
            exor2=nums2[0];
            for (int i=1;i<nums2.length;i++){
                exor2^=nums2[i];
            }
        }
        return exor1^exor2;

    }
}