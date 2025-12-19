// Last updated: 12/19/2025, 11:58:56 AM
class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] prev = new int[n2+1];
        int[] curr = new int[n2+1];
        for (int i=1 ; i<=n1 ; i++){
            for (int j=1 ; j<=n2 ; j++){
                int num1 = nums1[i-1];
                int num2 = nums2[j-1];
                if (num1==num2){
                    curr[j] = 1 + prev[j-1];
                }
                else{
                    curr[j] = 0 + Math.max(curr[j],curr[j-1]);
                }
            }
            prev = curr.clone();
        }
        return curr[n2];
    }
}