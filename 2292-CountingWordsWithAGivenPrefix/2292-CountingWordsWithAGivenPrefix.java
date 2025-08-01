// Last updated: 8/1/2025, 7:03:56 AM
class Solution {
    public int prefixCount(String[] words, String pref) {
        int c=0;
        for (int i=0;i<words.length;i++){
            if(words[i].contains(pref) && words[i].indexOf(pref)==0){
                c++;
            }
        }
        return c;
    }
}