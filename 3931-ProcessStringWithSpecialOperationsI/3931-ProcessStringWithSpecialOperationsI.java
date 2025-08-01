// Last updated: 8/1/2025, 7:00:47 AM
class Solution {
    public String processStr(String s) {
        String res = "";
        for (char ch : s.toCharArray()){
            if (ch!='*' && ch!='%' && ch!='#'){
                res += ch;
            }
            else if (ch=='*' && res.length()>0){
                res = res.substring(0,res.length()-1);
            }
            else if (ch=='%'){
                String str = "";
                for (int i=res.length()-1 ; i>=0 ; i--){
                    str += res.charAt(i);
                }
                res = str;
            }
            else{
                res += res;
            }
        }
        return res;
    }
}