// Last updated: 8/1/2025, 7:06:35 AM
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if(name.length()>typed.length()){
            return false;
        }
        int ind=0;
        char char1=name.charAt(ind);
        for (char ch:typed.toCharArray()){
            if(ch==name.charAt(ind)){
                char1=ch;
                ind++;
            }
            else{
                if(ch==name.charAt(ind) || ch!=char1){
                    return false;
                }
            }
            if(ind==name.length()){
                ind--;
            }
        }
        if (ind<name.length()-1){
            return false;
        }
        return name.charAt(name.length()-1)==typed.charAt(typed.length()-1);
    }
}