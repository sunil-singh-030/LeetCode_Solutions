// Last updated: 8/1/2025, 7:06:02 AM
class Solution {
    public String breakPalindrome(String palindrome) {
        int n = palindrome.length();
        if (n==1){
            return "";
        }
        String out = "";
        boolean found = false;
        for (int i=0 ; i<n/2 ; i++){
            if (palindrome.charAt(i)!='a'){
                found = true;
                out = palindrome.substring(0,i)+'a'+palindrome.substring(i+1);
                break;
            }
        }
        if (found){
            return out;
        }
        out = palindrome;
        out = (out.substring(0,n-1) + 'b');
        return out;
    }
}