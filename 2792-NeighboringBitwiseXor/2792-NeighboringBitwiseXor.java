// Last updated: 8/1/2025, 7:02:58 AM
class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int res = 1;
        for (int x : derived) {
            res ^= x;
        }
        return res == 1;
    }
}