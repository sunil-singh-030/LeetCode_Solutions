// Last updated: 8/1/2025, 7:02:10 AM
class Solution {
    static String s;
    public char kthCharacter(int k) {
        if (k==1){
            return 'a';
        }
        check(k,"a");
        return s.charAt(k-1);
    }
    public static void check (int k,String str){
        if (str.length()>=k){
            s=str;
            return;
        }
        String newstr = "";
        for (char ch:str.toCharArray()){
            if (ch=='z'){
                newstr+='a';
            }
            else{
                newstr+= (char) (((int) ch)+1);
            }
        }
        check(k,str+newstr);
    }
}