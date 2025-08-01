// Last updated: 8/1/2025, 7:06:07 AM
import java.util.*;

class Solution {
    public int numTilePossibilities(String tiles) {
        int[] count = new int[26];  // Frequency array for characters 'A' to 'Z'
        for (char c : tiles.toCharArray()) {
            count[c - 'A']++;  // Count occurrences
        }
        return backtrack(count);
    }

    private int backtrack(int[] count) {
        int sum = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                sum++;  // Count this unique sequence
                count[i]--;  // Use the tile
                sum += backtrack(count);  // Explore further sequences
                count[i]++;  // Backtrack
            }
        }
        return sum;
    }
}
