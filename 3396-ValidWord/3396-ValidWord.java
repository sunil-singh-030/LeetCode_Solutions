// Last updated: 8/1/2025, 7:02:28 AM
class Solution {
    public boolean isValid(String word) {
        int n = word.length();
        if (n<3){
            return false;
        }
        if (word.indexOf('@')>=0 || word.indexOf('#')>=0 || word.indexOf('$')>=0){
            return false;
        }
        boolean havevowel = false;
        boolean havecons = false;
        for (char ch : word.toCharArray()){
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                havevowel = true;
                continue;
            }
            if (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                havevowel = true;
                continue;
            }
            int asci = (int) ch;
            if (asci>=97 && asci<=122){
                havecons = true;
            }
            if (asci>=65 && asci<=90){
                havecons = true;
            }
            if (havevowel && havecons){
                break;
            }
            
        }
        return havevowel && havecons;
    }
}