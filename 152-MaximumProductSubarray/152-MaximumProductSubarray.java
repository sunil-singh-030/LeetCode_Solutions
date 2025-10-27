// Last updated: 10/27/2025, 3:38:39 PM
class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int prevmin = 1;
        int prevmax = 1;
        int ans = Integer.MIN_VALUE;
        for (int i=0 ; i<n ; i++){
            int num = nums[i];
            int currMax = Math.max(num*prevmin,num*prevmax);
            ans = Math.max(ans,currMax);
            if (num>=0){
                prevmax = Math.max(1,prevmax*num);
                prevmin = Math.min(1,num*prevmin);
            }
            else{
                int temp = prevmin;
                prevmin = Math.min(1,prevmax*num);
                prevmax = Math.max(1,temp*num);
            }
        }
        return ans;
    }
    
}