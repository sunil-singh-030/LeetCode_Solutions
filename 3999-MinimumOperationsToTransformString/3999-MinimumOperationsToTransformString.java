// Last updated: 9/10/2025, 12:10:02 PM
class Solution {
    public int minOperations(String s) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        List<Integer> ls = new ArrayList<>();
        for (int i=0 ; i<26 ; i++){
            if (freq[i]>0){
                ls.add(i);
            }
        }
        int cnt = 0;
        for (int i=0 ; i<ls.size()-1 ; i++){
            int ind = ls.get(i);
            if (ind==0){
                continue;
            }
            cnt += (ls.get(i+1)-ind);
        }
        if (ls.get(ls.size()-1)!=0){
            cnt += (26-ls.get(ls.size()-1));
        }
        return cnt;
    }
}