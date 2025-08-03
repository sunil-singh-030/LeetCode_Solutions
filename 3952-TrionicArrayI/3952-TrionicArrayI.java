// Last updated: 8/3/2025, 9:55:04 PM
class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        int indp = -1;
        for (int i=1 ; i<n ; i++){
            if (nums[i]<=nums[i-1]){
                indp = i-1;
                break;
            }
        }
        //System.out.println(indp);
        if (indp==-1) return false;
        int indq = -1;
        for (int i=n-2 ; i>=indp ; i--){
            if (nums[i]>=nums[i+1]){
                indq = i+1;
                break;
            }
        }
        if (indq==-1) return false;
        for (int i=indp+1 ; i<=indq ; i++){
            if (nums[i]>=nums[i-1]){
                return false;
            }
        }
        //System.out.println(indp+" "+indq);
        if (indp==0 || indq==n-1) return false;
        return true;
    }
}