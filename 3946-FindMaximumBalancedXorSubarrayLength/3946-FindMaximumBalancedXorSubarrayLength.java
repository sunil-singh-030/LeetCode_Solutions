// Last updated: 12/19/2025, 11:54:46 AM
import java.util.*;

class Solution {
    public int maxBalancedSubarray(int[] nums) {
        int n = nums.length;

        int xor = 0;
        int bal = 0;
        int ans = 0;

        Map<String, Integer> map = new HashMap<>();

        map.put("0#0", -1);

        for (int i = 0; i < n; i++) {

            xor ^= nums[i];

            if (nums[i] % 2 == 0) bal += 1;
            else bal -= 1;

            String key = xor + "#" + bal;

            if (map.containsKey(key)) {
                ans = Math.max(ans, i - map.get(key));
            } else {
                map.put(key, i);
            }
        }

        return ans;
    }
}
