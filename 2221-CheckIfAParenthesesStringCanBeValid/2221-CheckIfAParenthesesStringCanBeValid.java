// Last updated: 8/1/2025, 7:04:06 AM
class Solution {
    public boolean canBeValid(String s, String locked) {
        if (s.length() % 2 == 1) {
            return false; // Odd length strings can never be valid
        }

        int balance = 0; // Tracks balance of parentheses
        int free = 0;    // Tracks the count of unlockable parentheses

        // Left to Right Pass
        for (int i = 0; i < s.length(); i++) {
            if (locked.charAt(i) == '0') {
                free++; // Unlockable parenthesis
            } else if (s.charAt(i) == '(') {
                balance++; // Add open parenthesis
            } else {
                // Locked closing parenthesis
                if (balance > 0) {
                    balance--; // Match with an open parenthesis
                } else if (free > 0) {
                    free--; // Use an unlockable parenthesis
                } else {
                    return false; // Unmatched closing parenthesis
                }
            }
        }

        if (balance > free) {
            return false; // Not enough unlockables to balance open parentheses
        }

        balance = 0; // Reset balance for the second pass
        free = 0;

        // Right to Left Pass
        for (int i = s.length() - 1; i >= 0; i--) {
            if (locked.charAt(i) == '0') {
                free++; // Unlockable parenthesis
            } else if (s.charAt(i) == ')') {
                balance++; // Add closing parenthesis
            } else {
                // Locked opening parenthesis
                if (balance > 0) {
                    balance--; // Match with a closing parenthesis
                } else if (free > 0) {
                    free--; // Use an unlockable parenthesis
                } else {
                    return false; // Unmatched opening parenthesis
                }
            }
        }

        return balance <= free; // Final check for unmatched opening parentheses
    }
}
