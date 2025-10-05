// Last updated: 10/5/2025, 8:01:32 AM
class Solution {
    public int alternatingSum(int[] nums) {
        int sume = 0;
        int sumo = 0;
        for (int i=0 ; i<nums.length ; i++){
            if (i%2==0){
                sume += nums[i];
            }
            else{
                sumo += nums[i];
            }
        }
        return sume-sumo;
    }
}