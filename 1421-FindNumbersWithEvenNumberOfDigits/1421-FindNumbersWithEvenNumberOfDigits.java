// Last updated: 8/1/2025, 7:05:43 AM
class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for (int num : nums){
            String s = String.valueOf(num);
            if (s.length()%2==0){
                ans++;
            }
        }
        return ans;
    }
}