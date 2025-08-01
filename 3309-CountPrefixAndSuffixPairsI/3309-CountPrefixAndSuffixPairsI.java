// Last updated: 8/1/2025, 7:02:35 AM
class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int c=0;
        for (int i=0;i<words.length-1;i++){
            for (int j=i+1;j<words.length;j++){
                if (isprefixandsuffix(words[i],words[j])){
                    c++;
                }
            }
        }
        return c;
    }
    public static boolean isprefixandsuffix(String str1,String str2){
        if (!str2.contains(str1)){
            return false;
        }
        if (str2.indexOf(str1)==0 && str2.lastIndexOf(str1)==str2.length()-str1.length()){
            return true;
        }
        return false;
    }
}