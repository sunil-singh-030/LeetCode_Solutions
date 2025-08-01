// Last updated: 8/1/2025, 7:10:22 AM
class Solution {
    public int majorityElement(int[] nums) {
        int len=nums.length;
        int winner=nums[0];
        int vote=1;
        for (int i=1;i<len;i++){
            if (nums[i]!=winner){
                vote--;
                if (vote==0){
                winner=nums[i];
                vote=1;
            }
            }
            else{
                vote++;
            }
        }
        return winner;

    }
}