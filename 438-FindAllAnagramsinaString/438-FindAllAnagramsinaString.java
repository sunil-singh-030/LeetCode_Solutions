// Last updated: 10/1/2025, 7:07:53 AM
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if (p.length()>s.length()){
            return new ArrayList<>();
        }
        List<Integer> ls = new ArrayList<>();
        int [] freqp = new int[26];
        for (char ch : p.toCharArray()){
            freqp[ch-'a']++;
        }
        int [] freqs = new int[26];
        for (int i = 0 ; i<p.length() ; i++){
            freqs[s.charAt(i)-'a']++;
        }
        boolean flag=true;
        for (int i=0;i<26;i++){
            if (freqp[i]!=freqs[i]){
                flag=false;
                break;
            }
        }
        if (flag){
            ls.add(0);
        }
        for (int i=1 ; i<=s.length()-p.length();i++){
            flag=true;
            freqs[s.charAt(i+p.length()-1)-'a']++;
            freqs[s.charAt(i-1)-'a']--;
            for (int j=0;j<26;j++){
                if (freqp[j]!=freqs[j]){
                    flag=false;
                    break;
                }
            }
            if (flag){
                ls.add(i);
            }
        }
        return ls;
    }
}