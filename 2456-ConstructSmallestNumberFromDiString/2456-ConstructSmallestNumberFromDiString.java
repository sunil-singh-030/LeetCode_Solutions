// Last updated: 8/1/2025, 7:03:37 AM
class Solution {
    static String result = "";
    static boolean found = false;
    
    public String smallestNumber(String pattern) {
        result = "";
        found = false;
        boolean[] used = new boolean[10];
        generateNumber(pattern, "", used, 0);
        return result;
    }
    
    private static void generateNumber(String pattern, String current, boolean[] used, int index) {
        if (found) return;
        
        if (index == pattern.length()) {
            char lastPatternChar = pattern.charAt(index - 1);
            int lastDigit = current.charAt(current.length() - 1) - '0';
            
            for (int i = (lastPatternChar == 'D' ? 1 : lastDigit + 1); 
                 (lastPatternChar == 'D' ? i < lastDigit : i <= 9); i++) {
                if (!used[i]) {
                    result = current + i;
                    found = true;
                    return;
                }
            }
            return;
        }
        
        for (int i = 1; i <= 9; i++) {
            if (!used[i]) {
                if (current.isEmpty() || 
                    (pattern.charAt(index - 1) == 'I' && i > current.charAt(current.length() - 1) - '0') || 
                    (pattern.charAt(index - 1) == 'D' && i < current.charAt(current.length() - 1) - '0')) {
                    
                    used[i] = true;
                    generateNumber(pattern, current + i, used, index + 1);
                    used[i] = false;
                }
            }
        }
    }
}
