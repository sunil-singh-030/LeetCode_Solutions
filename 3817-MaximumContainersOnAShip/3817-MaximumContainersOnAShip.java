// Last updated: 8/1/2025, 7:01:16 AM
class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        return Math.min(n*n,maxWeight/w);
    }
}