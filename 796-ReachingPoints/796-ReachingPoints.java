// Last updated: 8/1/2025, 7:07:20 AM
class Solution {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        while (tx >= sx && ty >= sy) {
            if (tx == sx && ty == sy) {
                return true;
            }
            if (tx > ty) {
                if (ty > sy) {
                    tx %= ty; // Reduce tx directly
                } else { 
                    return (tx - sx) % ty == 0; // Check if we can reach sx exactly
                }
            } else {
                if (tx > sx) {
                    ty %= tx; // Reduce ty directly
                } else {
                    return (ty - sy) % tx == 0; // Check if we can reach sy exactly
                }
            }
        }
        return false;
    }
}
