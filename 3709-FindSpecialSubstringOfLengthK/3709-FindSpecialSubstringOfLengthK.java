// Last updated: 8/1/2025, 7:01:48 AM
class Solution {
    public boolean hasSpecialSubstring(String s, int k) {
        if (s.length()<k){
            return false;
        }
        if (s.length()==k){
            char ch = s.charAt(0);
            for (int i=1 ; i<k ; i++){
                if (ch!=s.charAt(i)){
                    return false;
                }
            }
            return true;
        }
        char ch = s.charAt(0);
        int cnt = 1;
        for (int i=1 ; i<s.length() ; i++){
            if (s.charAt(i)==ch){
                cnt++;
            }
            else{
                if (cnt==k){
                    int ind1 = i-(k+1);
                    if (ind1>=0 && s.charAt(ind1)!=ch){
                        return true;
                    }
                    if (ind1<0){
                        return true;
                    }
                }
                ch = s.charAt(i);
                cnt = 1;
            }
        }
        if (cnt==k){
            return true;
        }
        return false;
        
    }
}