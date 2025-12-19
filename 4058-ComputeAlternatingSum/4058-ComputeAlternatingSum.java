// Last updated: 12/19/2025, 11:54:18 AM
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