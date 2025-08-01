// Last updated: 8/1/2025, 7:08:26 AM
class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int ele = nums[n/2];
        int cnt = 0;
        for (int num : nums){
            cnt += Math.abs(ele-num);
        }
        return cnt;

    }
}