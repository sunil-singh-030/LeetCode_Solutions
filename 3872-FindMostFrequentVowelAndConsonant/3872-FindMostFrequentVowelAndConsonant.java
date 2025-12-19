// Last updated: 12/19/2025, 11:54:57 AM
class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        int maxv = 0;
        int maxc = 0;
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        set.add(4);
        set.add('i'-'a');
        set.add('o'-'a');
        set.add('u'-'a');
        for (int i=0 ; i<26 ; i++){
            if (set.contains(i)){
                maxv = Math.max(maxv,freq[i]);
            }
            else{
                maxc = Math.max(maxc,freq[i]);
            }
        }
        return maxc+maxv;
    }
}