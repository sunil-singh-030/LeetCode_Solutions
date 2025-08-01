// Last updated: 8/1/2025, 7:01:17 AM
class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];
        int n = s.length();
        for (int i=0 ; i<n/2 ; i++){
            char ch = s.charAt(i);
            freq[ch-'a']++;
        }
        StringBuilder out = new StringBuilder();
        for (int i=0 ; i<26 ; i++){
            for (int j=0 ; j<freq[i] ; j++){
                out.append((char) (97+i));
            }
        }
        //System.out.println(out);
        if (n%2==0){
            StringBuilder temp = out;
            for (int i=out.length()-1 ; i>=0 ; i--){
                out.append(temp.charAt(i));
            }
            return out.toString();
        }
        else{
            out.append(s.charAt(n/2));
            StringBuilder temp = out;
            for (int i=out.length()-2 ; i>=0 ; i--){
                out.append(temp.charAt(i));
            }
            return out.toString();
        }
    }
}