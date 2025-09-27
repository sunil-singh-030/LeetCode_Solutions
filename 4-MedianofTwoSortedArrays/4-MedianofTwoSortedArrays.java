// Last updated: 9/27/2025, 10:12:28 AM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if (m>n){
            return findMedianSortedArrays(nums2,nums1);
        }
        int size = m+n;
        int sizeleft = (size+1)/2;
        int low = 0;
        int high = m;
        double ans = Integer.MIN_VALUE;
        while (low<=high){
            int mid1 = (low+high)/2;
            int mid2 = sizeleft-mid1;
            int max1 = mid1<=0 ? Integer.MIN_VALUE : nums1[mid1-1];
            int max2 = mid2<=0 ? Integer.MIN_VALUE : nums2[mid2-1];
            int min1 = mid1>=m ? Integer.MAX_VALUE : nums1[mid1];
            int min2 = mid2>=n ? Integer.MAX_VALUE : nums2[mid2];
            if (max1>min2){
                high = mid1-1;
            }
            else if (max2>min1){
                low = mid1+1;
            }
            else{
                if (size%2==1){
                    ans = Math.max(max1,max2);
                }
                else{
                    ans = (Math.max(max1,max2) + Math.min(min1,min2))/2.0;
                }
                break;
            }
        }
        return ans;
    }
}