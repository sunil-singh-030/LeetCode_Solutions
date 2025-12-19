// Last updated: 12/19/2025, 11:56:05 AM
class Solution {
    public int minimumOperations(int[] nums) {
        int cnt = 0;
        for (int num : nums){
            cnt += Math.min(1,num%3);
        }
        return cnt;
    }
}