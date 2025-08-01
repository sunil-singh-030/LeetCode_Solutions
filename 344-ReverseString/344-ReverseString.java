// Last updated: 8/1/2025, 7:09:09 AM
class Solution {
    public void reverseString(char[] s) {
        for (int i=0;i<s.length/2;i++){
            char temp=s[i];
            s[i]=s[s.length-1-i];
            s[s.length-1-i]=temp;
        }
    }
}