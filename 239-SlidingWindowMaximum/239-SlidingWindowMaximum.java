// Last updated: 8/1/2025, 7:09:40 AM
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int [] ans = new int[nums.length-k+1];
        int num=Integer.MIN_VALUE;
        int ind=-1;
        for (int i=0;i<k;i++){
            if (nums[i]>=num){
                ind=i;
                num=nums[i];
            }
        }
        ans[0]=num;
        for (int i=1;i<nums.length-k+1;i++){
            if (nums[i+k-1]>=num){
                num=nums[i+k-1];
                ind=i+k-1;
                ans[i]=num;
            }
            else if (ind!=i-1){
                ans[i]=num;
            }
            else{
                num=Integer.MIN_VALUE;
                ind=-1;
                for (int j=i;j<=i+k-1;j++){
                    if (nums[j]>=num){
                        num=nums[j];
                        ind=j;
                    }
                }
                ans[i]=num;
            }

        }
        return ans;
    }
}