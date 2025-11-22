// Last updated: 11/22/2025, 7:37:12 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int cnt = 0;
        for (int num : nums){
            cnt += Math.min(1,num%3);
        }
        return cnt;
    }
}