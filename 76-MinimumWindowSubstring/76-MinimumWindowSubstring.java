// Last updated: 9/29/2025, 1:25:44 PM
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String minWindow(String s, String t) {
        if (t.isEmpty()) {
            return "";
        }

        Map<Character, Integer> targetCounts = new HashMap<>();
        for (char c : t.toCharArray()) {
            targetCounts.put(c, targetCounts.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> windowCounts = new HashMap<>();
        int windowStart = 0;
        int numRequiredCharsMet = 0; // Counts how many unique characters from 't' have their frequency met in the window
        int minLength = Integer.MAX_VALUE;
        int minWindowStart = 0;

        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            char rightChar = s.charAt(windowEnd);
            windowCounts.put(rightChar, windowCounts.getOrDefault(rightChar, 0) + 1);

            // If this character is in t and its count in window now meets the target count
            // We use .intValue() for proper comparison as get() might return null or a different object type initially.
            // Though in Java 8+, autoboxing usually handles this. Explicit conversion is safer.
            if (targetCounts.containsKey(rightChar) &&
                windowCounts.get(rightChar).intValue() == targetCounts.get(rightChar).intValue()) {
                numRequiredCharsMet++;
            }

            // Shrink the window if all required unique characters are met
            while (numRequiredCharsMet == targetCounts.size()) {
                // Update minimum window found so far
                if (windowEnd - windowStart + 1 < minLength) {
                    minLength = windowEnd - windowStart + 1;
                    minWindowStart = windowStart;
                }

                char leftChar = s.charAt(windowStart);
                windowCounts.put(leftChar, windowCounts.getOrDefault(leftChar, 0) - 1);
                
                // If this character is in t and its count in window now falls below the target count
                if (targetCounts.containsKey(leftChar) &&
                    windowCounts.get(leftChar).intValue() < targetCounts.get(leftChar).intValue()) {
                    numRequiredCharsMet--; // This character became 'unmet'
                }
                windowStart++; // Shrink the window from the left
            }
        }

        if (minLength == Integer.MAX_VALUE) { // If no valid window was found
            return "";
        }
        return s.substring(minWindowStart, minWindowStart + minLength);
    }
}