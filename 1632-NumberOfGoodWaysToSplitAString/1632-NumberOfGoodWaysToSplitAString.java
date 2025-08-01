// Last updated: 8/1/2025, 7:05:09 AM
class Solution {
    public int numSplits(String s) {
        int[] rightFreq = new int[26];
        int rightUnique = 0;
        
        // Count frequency of each char in right half (entire string initially)
        for (char ch : s.toCharArray()) {
            if (rightFreq[ch - 'a'] == 0) rightUnique++;
            rightFreq[ch - 'a']++;
        }

        int[] leftFreq = new int[26];
        int leftUnique = 0;
        int goodSplits = 0;

        // Move character one by one from right to left
        for (int i = 0; i < s.length() - 1; i++) {
            char ch = s.charAt(i);
            
            // Update left half
            if (leftFreq[ch - 'a'] == 0) leftUnique++;
            leftFreq[ch - 'a']++;

            // Update right half
            rightFreq[ch - 'a']--;
            if (rightFreq[ch - 'a'] == 0) rightUnique--;

            // Compare unique counts
            if (leftUnique == rightUnique) goodSplits++;
        }

        return goodSplits;
    }
}
