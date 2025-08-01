// Last updated: 8/1/2025, 7:01:11 AM
class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for (int num : nums){
            sum += num;
        }
        return sum%k;
    }
}