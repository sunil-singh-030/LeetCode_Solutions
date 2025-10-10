// Last updated: 10/10/2025, 12:48:21 PM
class Solution {
    public String removeSubstring(String s, int k) {
        char[] stack = new char[s.length()];
        int top = 0;
        boolean falseAlarm = false;
        int countR = 0;
        boolean changed = true;
        char[] str = s.toCharArray();
        int start;
        while (changed) {
            // println("str = " + str)
            changed = false;
            countR = 0;
            for (char c : str) {
                // println("c = " + c + ", countR = " + countR + ", top = " + top + ", changed = " + changed)
                if (c == '(') {
                    stack[top++] = c;
                    countR = 0;
                } else {
                    countR++;
                    if (countR == k) {
                        // go back and look for k (
                        start = top - (k  - 1) - k;
                        if (start >= 0) {
                            falseAlarm = false;
                            for (int y = start; y < start + k; y++) {
                                // println("looking at " + stack[y])
                                if (stack[y] == ')') {
                                    falseAlarm = true;
                                    break;
                                }
                            }
                            if (!falseAlarm) {
                                // pop from stack
                                top = start;
                                changed = true;
                            } else {
                                stack[top++] = c;
                            }
                            countR = 0;
                        } else {
                            stack[top++] = c;    
                        }
                    } else {
                        stack[top++] = c;
                    }
                }
            }
            // println("str = " + str + ", top = " + top)
            str = Arrays.copyOfRange(stack, 0, top);
            // println("str = " + str)
            top = 0;
        }
        return new String(str);
    }
}