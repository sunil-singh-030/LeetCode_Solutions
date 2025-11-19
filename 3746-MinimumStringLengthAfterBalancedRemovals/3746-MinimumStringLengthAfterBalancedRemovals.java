// Last updated: 11/19/2025, 9:48:36 AM
class Solution {
    public int minLengthAfterRemovals(String s) {
        int countA = 0;
        int countB = 0;

        for (char c : s.toCharArray()) {
            if (c == 'a') countA++;
            else countB++;
        }
        
        return Math.abs(countA - countB);
    }
}