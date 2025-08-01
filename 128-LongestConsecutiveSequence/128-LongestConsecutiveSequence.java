// Last updated: 8/1/2025, 7:10:54 AM
import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);
        int ans = 1, count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) continue; // Skip duplicates
            if (nums[i] == nums[i - 1] + 1) {
                count++;
            } else {
                ans = Math.max(ans, count);
                count = 1;
            }
        }
        return Math.max(ans, count);
    }
}
