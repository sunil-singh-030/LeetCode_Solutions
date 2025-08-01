// Last updated: 8/1/2025, 7:02:49 AM
class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        boolean flag=true;
        int c=0;
        int ind=0;
        for (int i=0;i<str2.length();i++){
            int temp=c;
            for (int j=ind;j<str1.length();j++){
                if (str1.charAt(j)==str2.charAt(i)){
                    ind=j+1;
                    c++;
                    break;
                }
                else if (flag){
                    if (str2.charAt(i)-str1.charAt(j)==1 || (str2.charAt(i)=='a' && str1.charAt(j)=='z')){
                        ind =j+1;
                        c++;
                        break;
                    }
                }
            }
            if (temp==c){
                return false;
            }
        }
        return true;
    }
}