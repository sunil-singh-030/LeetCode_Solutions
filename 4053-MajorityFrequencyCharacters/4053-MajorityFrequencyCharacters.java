// Last updated: 12/19/2025, 11:54:21 AM
class Solution {
    public String majorityFrequencyGroup(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int[] freq = new int[101];
        for (char key : map.keySet()){
            freq[map.get(key)]++;
        }
        int max = 0;
        int take = -1;
        for (int i=100 ; i>=0 ; i--){
            if (freq[i]>max){
                max = freq[i];
                take = i;
            }
        }
        String ans = "";
        for (char key : map.keySet()){
            if (map.get(key)==take){
                ans += key;
            }
        }
        return ans;
    }
}