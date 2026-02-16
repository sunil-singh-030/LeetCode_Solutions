// Last updated: 2/16/2026, 9:40:38 PM
1class Solution {
2    public String mapWordWeights(String[] words, int[] weights) {
3        StringBuilder sb = new StringBuilder();
4        for (String word : words){
5            int sc = 0;
6            for (char c : word.toCharArray()){
7                sc += weights[c-'a'];
8            }
9            sc %= 26;
10            sb.append((char) (122-sc));
11        }
12        return sb.toString();
13    }
14}