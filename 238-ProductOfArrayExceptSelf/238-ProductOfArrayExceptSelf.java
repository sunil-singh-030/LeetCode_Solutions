// Last updated: 8/1/2025, 7:09:41 AM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len=nums.length;
        int [] left_pd=new int[len];
        left_pd[0]=1;
        for (int i=1;i<len;i++){
            left_pd[i]=left_pd[i-1]*nums[i-1];
        }
        int [] right_pd=new int[len];
        right_pd[len-1]=1;
        for (int j=len-2;j>=0;j--){
            right_pd[j]=(right_pd[j+1]*nums[j+1]);
        }
        for (int k=0;k<len;k++){
            right_pd[k]=left_pd[k]*right_pd[k];
        }
        return right_pd;
        
    }
}
    