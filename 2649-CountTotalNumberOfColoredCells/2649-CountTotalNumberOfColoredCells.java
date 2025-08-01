// Last updated: 8/1/2025, 7:03:14 AM
class Solution {
    public long coloredCells(int n) {
        long ans = (long) Math.pow(n,2);
        return ans*2 - (2*n-1);
    }
}