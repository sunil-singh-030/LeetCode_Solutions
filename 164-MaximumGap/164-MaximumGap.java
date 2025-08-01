// Last updated: 8/1/2025, 7:10:27 AM
class Solution {
    public int maximumGap(int[] nums) {
        if (nums.length<2){
            return 0;
        }
        Arrays.sort(nums);
        int maxdiff=0;
        for (int i=0;i<nums.length-1;i++){
            maxdiff=Math.max(maxdiff,nums[i+1]-nums[i]);
        }
        return maxdiff;
    }
}