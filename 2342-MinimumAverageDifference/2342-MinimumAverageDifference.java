// Last updated: 8/1/2025, 7:03:48 AM
class Solution {
    public int minimumAverageDifference(int[] nums) {
        long sum=0;
        for (int num:nums){
            sum+=num;
        }
        long temp=0;
        long mavg=Integer.MAX_VALUE;
        int ind=-1;
        for (int i=0;i<nums.length-1;i++){
            temp+=nums[i];
            sum-=nums[i];
            long lavg= temp/(i+1);
            long ravg= sum/(nums.length-i-1);
            if (mavg>Math.abs(lavg-ravg)){
                mavg=Math.abs(lavg-ravg);
                ind=i;
            }
        }
        temp+=nums[nums.length-1];
        if (mavg>temp/nums.length){
            ind=nums.length-1;
        }
        return ind;
    }
}