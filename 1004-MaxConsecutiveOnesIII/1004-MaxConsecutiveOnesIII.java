// Last updated: 10/2/2025, 8:27:59 AM
class Solution {
    public int longestOnes(int[] nums, int k) {
        int flip=0;
        int start=0;
        int ind=0;
        int ans=0;
        while (ind<nums.length){
            if (nums[ind]==1){
                ind++;
            }
            else{
                if (flip<k){
                    ind++;
                    flip++;
                }
                else{
                    ans=Math.max(ans,ind-start);
                    while (flip==k){
                        if (nums[start]==0){
                            flip--;
                        }
                        start++;
                    }
                }
            }
        }
        ans=Math.max(ans,ind-start);
        return ans;
    }
}