// Last updated: 8/1/2025, 7:01:53 AM
class Solution {
    public int countPartitions(int[] nums) {
        int [] prefix=new int[nums.length];
        int sum=nums[0];
        prefix[0]=sum;
        int tsum=nums[0];
        for (int i=1;i<nums.length;i++){
            sum+=nums[i];
            prefix[i]=sum;
            tsum+=nums[i];
        }
        int c=0;
        for (int i=0;i<nums.length-1;i++){
            if ((tsum-prefix[i]-prefix[i])%2==0){
                c++;
            }
        }
        return c;
    }
}