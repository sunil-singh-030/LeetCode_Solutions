// Last updated: 8/1/2025, 7:12:43 AM
class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int ind1=-1;
        int ind2=-1;
        for (int i=n-1;i>0;i--){
            if (nums[i]>nums[i-1]){
                ind1=i-1;
                break;
            }
        }
        if (ind1!=-1){
            for (int j=n-1;j>ind1;j--){
                if (nums[j]>nums[ind1]){
                    ind2=j;
                    break;
                }
            }
            int temp=nums[ind1];
            nums[ind1]=nums[ind2];
            nums[ind2]=temp;
            while (ind1+1<n-1){
                int temp1=nums[ind1+1];
                nums[ind1+1]=nums[n-1];
                nums[n-1]=temp1;
                ind1++;
                n--;
            }
        }
        else{
            int index=0;
            while (index<n-1){
                int temp1=nums[index];
                nums[index]=nums[n-1];
                nums[n-1]=temp1;
                index++;
                n--;
            }
        }
    }
    
}