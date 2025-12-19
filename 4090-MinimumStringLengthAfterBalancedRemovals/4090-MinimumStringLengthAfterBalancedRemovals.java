// Last updated: 12/19/2025, 11:54:07 AM
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