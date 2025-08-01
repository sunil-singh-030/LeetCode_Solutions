// Last updated: 8/1/2025, 7:01:54 AM
class Solution {
    public String answerString(String word, int numFriends) {
        if (numFriends==1){
            return word;
        }
        int ind=-1;
        String out="";
        for (int i=0;i<word.length();i++){
            if (!isgreater(out,word.substring(i))){
                out=word.substring(i);
                ind=i;
            }
        }
        if (ind>=(numFriends-1)){
            return out;
        }
        else{
            numFriends--;
            numFriends-=ind;
            return out.substring(0,out.length()-numFriends);
        }
        

    }
    public static boolean isgreater(String s1,String s2){
        int ind1=0;
        int ind2=0;
        int minlen=Math.min(s1.length(),s2.length());
        while (ind1<s1.length() && ind2<s2.length()){
            if (s1.charAt(ind1)>s2.charAt(ind2)){
                return true;
            }
            else if (s1.charAt(ind1)<s2.charAt(ind2)){
                return false;
            }
            ind1++;
            ind2++;
        }
        if (ind2<s2.length()){
            return false;
        }
        return true;
    }
}