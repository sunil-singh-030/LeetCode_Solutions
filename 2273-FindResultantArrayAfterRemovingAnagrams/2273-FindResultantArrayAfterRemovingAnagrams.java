// Last updated: 10/13/2025, 7:01:51 AM
class Solution {
    public List<String> removeAnagrams(String[] words) {
        String prev = "";
        List<String> ls = new ArrayList<>();
        for (String s : words){
            int[] freq = new int[26];
            for (char ch : s.toCharArray()){
                freq[ch-'a']++;
            } 
            StringBuilder sortStr = new StringBuilder();
            for (int i=0 ; i<26 ; i++){
                for (int j=0 ; j<freq[i] ; j++){
                    sortStr.append((char) (97+i)); 
                }
            }
            if (!prev.equals(sortStr.toString())){
                ls.add(s);
            }
            prev = sortStr.toString();
        }
        return ls;
    }
}