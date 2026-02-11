// Last updated: 2/11/2026, 12:38:00 PM
class Solution {
    public int maximumXOR(int[] nums) {
        int ans=0;
        for(int n:nums)
        {
            ans|=n;
        }
        return ans;
        
    }
}