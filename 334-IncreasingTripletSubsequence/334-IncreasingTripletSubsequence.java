// Last updated: 8/1/2025, 7:09:12 AM
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n=nums.length;
        boolean [] rmax=new boolean[n];
        int max=nums[n-1];
        for (int i=n-2;i>=0;i--){
            if (max>nums[i]){
                rmax[i]=true;
            }
            max=Math.max(max,nums[i]); // 20 100 10 12 5 13
        }
        max=nums[0];
        // for (boolean bool:rmax){
        //     System.out.print(bool+" ");
        // }
        for (int i=1;i<n-1;i++){
            if (max<nums[i] && rmax[i]){
                return true;
            }
            max=Math.min(max,nums[i]);
        }
        return false;
    }
    
}