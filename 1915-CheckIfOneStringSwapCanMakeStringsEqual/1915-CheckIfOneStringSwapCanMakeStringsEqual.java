// Last updated: 8/1/2025, 7:04:37 AM
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int c = 0;
        char ch1 = '_';
        char ch2 = '_';
        for (int i=0 ; i<s1.length() ; i++){
            if (s1.charAt(i)!=s2.charAt(i)){
                if (ch1=='_'){
                    ch1 = s1.charAt(i);
                    ch2 = s2.charAt(i);
                }
                else {
                    if (ch2!=s1.charAt(i) || ch1!=s2.charAt(i)){
                        return false;
                    }
                }
                c++;
            }
            if (c>2){
                return false;
            }
        }
        return c==0 || c==2;
    }
}