// Last updated: 8/1/2025, 7:13:10 AM
class Solution {
    public String longestPalindrome(String s) {
        String out="";
        int n = s.length();
        for (int i=0 ; i<n ; i++){
            String str = ""+s.charAt(i);
            int left = i-1;
            int right = i+1;
            while (left>=0 && right<n){
                char ch1 = s.charAt(left);
                char ch2 = s.charAt(right);
                if (ch1==ch2){
                    str = (ch1+str+ch2);
                }
                else{
                    break;
                }
                left--;
                right++;
            }
            if (str.length()>out.length()){
                out = str;
            }
        }
        if (s.length()>1){
            for (int i=1 ; i<n ; i++){
                if (s.charAt(i)==s.charAt(i-1)){
                    String str = s.substring(i-1,i+1);
                    int left = i-2;
                    int right = i+1;
                    while (left>=0 && right<n){
                        char ch1 = s.charAt(left);
                        char ch2 = s.charAt(right);
                        if (ch1==ch2){
                            str = (ch1+str+ch2);
                        }
                        else{
                            break;
                        }
                        left--;
                        right++;
                    }
                    if (str.length()>out.length()){
                        out = str;
                    }
                }
            }
        }
        return out;
    }
    
}