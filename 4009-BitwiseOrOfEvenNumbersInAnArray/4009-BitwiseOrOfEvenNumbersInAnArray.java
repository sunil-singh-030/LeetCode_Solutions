// Last updated: 12/19/2025, 11:54:30 AM
class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int ans = 0;
        for (int num : nums){
            if (num%2==0){
                ans = ans | num;
            }
            //ans ^= num;
        }
        return ans;
    }
}