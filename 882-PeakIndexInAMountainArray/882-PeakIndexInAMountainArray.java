// Last updated: 8/1/2025, 7:07:07 AM
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left=0;
        int right=arr.length-1;
        int ind=-1;
        while (left<=right){
            int mid=(left+right)/2;
            if (mid==0){
                ind=mid+1;
                break;
            }
            if (mid==arr.length-1){
                ind=mid-1;
                break;
            }
            if (arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                ind=mid;
                break;
            }
            else{
                if (arr[mid]>arr[mid-1]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
        }
        return ind;
    }
}