// Last updated: 8/1/2025, 7:02:44 AM
class Solution {
    public int minimumSum(int[] nums) {
        int n = nums.length;
        int minsum = Integer.MAX_VALUE;
        int[] lmin = new int[n];
        lmin[0] = nums[0];
        for (int i=1 ; i<n ; i++){
            lmin[i] = Math.min(nums[i-1],lmin[i-1]);
        }
        // for (int num : lmin){
        //     System.out.print(num+" ");
        // }
        int rmin = nums[n-1];
        for (int i=n-2 ; i>=1 ; i--){
            rmin = Math.min(rmin,nums[i+1]);
            if (nums[i]>lmin[i] && nums[i]>rmin){
                minsum = Math.min(minsum,(nums[i]+lmin[i]+rmin));
            }
        }
        if (minsum!=Integer.MAX_VALUE){
            return minsum;
        }
        return -1;
    }
}