// Last updated: 8/1/2025, 7:01:40 AM
class Solution {
    public String findValidPair(String s) {
        int [] c = new int[10];
        for (char ch : s.toCharArray()){
            c[ch-'0']++;
        }
        String ans = "";
        for (int i=1 ; i<s.length() ; i++){
            char ch1 = s.charAt(i-1);
            char ch2 = s.charAt(i);
            if (ch1!=ch2){
                if (c[ch1-'0']==(ch1-'0') && c[ch2-'0']==(ch2-'0')){
                    ans += ch1;
                    ans += ch2;
                    break;
                }
            }
        }
        return ans;
    }
}