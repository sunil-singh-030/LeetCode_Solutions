// Last updated: 11/22/2025, 7:36:23 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int cnt = 0;
        for (int num : nums){
            int way1 = num%3;
            int way2 = 3 - way1;
            cnt += Math.min(way1,way2);
        }
        return cnt;
    }
}