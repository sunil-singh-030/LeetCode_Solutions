// Last updated: 8/1/2025, 7:03:05 AM
class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int[] arr = new int[1001];
        for (int[] nums : nums1){
            arr[nums[0]] += nums[1];
        }
        for (int[] nums : nums2){
            arr[nums[0]] += nums[1];
        }
        int len = 0;
        for (int num : arr){
            if (num>0){
                len++;
            }
        }
        int[][] out = new int[len][2];
        int ind= 0;
        for (int i=0 ; i<1001 ; i++){
            if (arr[i]>0){
                out[ind][0] = i;
                out[ind][1] = arr[i];
                ind++;
            }
        }
        return out;
    }
}