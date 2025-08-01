// Last updated: 8/1/2025, 7:11:35 AM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] arr= new int[m+n];
        int i=0 ;
        int j=0 ;
        int ind = 0;
        while (i<m && j<n){
            if (nums1[i]<=nums2[j]){
                arr[ind] = nums1[i];
                i++;
            }
            else{
                arr[ind] = nums2[j];
                j++;
            }
            ind++;
        }
        
        while (i<m){
            arr[ind] = nums1[i];
            i++;
            ind++;
        }
        while (j<n){
            arr[ind] = nums2[j];
            j++;
            ind++;
        }
        for (i=0 ; i<arr.length ; i++){
            nums1[i] = arr[i];
        }
        
    }
}