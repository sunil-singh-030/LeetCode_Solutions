// Last updated: 8/1/2025, 7:05:17 AM
class Solution {
    public int longestSubarray(int[] nums) {
        int ans=0;
        int length=0;
        int start=0;
        int ind=0;
        int indo=-1;
        boolean flag=true;
        boolean flag1=false;
        while (ind<nums.length){
            if (nums[ind]==1){
                ind++;
                flag1=true;
            }
            else{
                if (!flag1){
                    start++;
                }
                else{
                    if (flag){
                    indo=ind;
                    flag=false;
                    }
                    else{
                        ans=Math.max(ans,ind-start-1);
                        start=indo+1;
                        indo=ind;
                    }
                }
                ind++;
            }
        }
        ans=Math.max(ans,ind-start-1);
        if (flag1 && flag && start>0){
            ans++;
        }
        return ans;
    }
}