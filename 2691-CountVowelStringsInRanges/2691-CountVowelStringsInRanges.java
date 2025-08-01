// Last updated: 8/1/2025, 7:03:10 AM
class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int [] out=new int[queries.length];
        boolean [] isvowel=new boolean[words.length];
        for (int i=0;i<words.length;i++){
            String str= words[i];
            if (str.charAt(0)=='a' || str.charAt(0)=='e' || str.charAt(0)=='i' || str.charAt(0)=='o' || str.charAt(0)=='u'){
                if (str.charAt(str.length()-1)=='a' || str.charAt(str.length()-1)=='e' || str.charAt(str.length()-1)=='i' || str.charAt(str.length()-1)=='o' || str.charAt(str.length()-1)=='u'){
                    isvowel[i]=true;
                }
            }
        }
        int [] prefixsum=new int[words.length];
        int c=0;
        for (int i=0;i<words.length;i++){
            if (isvowel[i]){
                c++;
            }
            prefixsum[i]=c;
        }
        for (int i=0;i<queries.length;i++){
            out[i]=prefixsum[queries[i][1]]-prefixsum[queries[i][0]];
            if (isvowel[queries[i][0]]){
                out[i]++;
            }
        }
        return out;
    }
}