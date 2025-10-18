// Last updated: 10/18/2025, 10:39:40 PM
class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        String maxPalinStr = "";
        int maxLen = 0;
        // when length is odd
        for (int i=0 ; i<n ; i++){
            int leftPointer = i-1;
            int rightPointer = i+1;
            int currlen = 1; // 5 2 1 2
            while (leftPointer>=0 && rightPointer<n){
                if (s.charAt(leftPointer)==s.charAt(rightPointer)){
                    currlen += 2;
                }
                else{
                    break;
                }
                leftPointer--;
                rightPointer++;
            }
            if (currlen>maxLen){
                maxPalinStr = s.substring(leftPointer+1,leftPointer+1+currlen);
                maxLen = currlen;
            }
        }

        // 2nd case len is even
        for (int i=1 ; i<n ; i++){
            int currLen = 0;
            int leftPointer = i-1;
            int rightPointer = i;
            while (leftPointer>=0 && rightPointer<n){
                if (s.charAt(leftPointer)==s.charAt(rightPointer)){
                    currLen += 2;
                }
                else{
                    break;
                }
                leftPointer--;
                rightPointer++;
            } // 4 5 (4,7)
            if (currLen>maxLen){
                maxPalinStr = s.substring(leftPointer+1,leftPointer+1+currLen);
                maxLen = currLen;
            }
        }
        return maxPalinStr;
    }

    
    
    
}