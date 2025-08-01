// Last updated: 8/1/2025, 7:06:43 AM
class Solution {
    public int partitionDisjoint(int[] nums) {
        int [] rmax=new int[nums.length];
        int maxr=nums[nums.length-1];
        for (int i=nums.length-2;i>=0;i--){
            rmax[i]=maxr;
            maxr=Math.min(maxr,nums[i]);
        }
        int maxl=-1;
        int len=-1;
        for (int i=0;i<nums.length-1;i++){
            maxl=Math.max(maxl,nums[i]);
            if (maxl<=rmax[i]){
                len=i+1;
                break;
            }
        }
        return len;
    }
}