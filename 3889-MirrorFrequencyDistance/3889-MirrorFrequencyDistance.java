// Last updated: 4/6/2026, 2:48:11 PM
1class Solution {
2    public int mirrorFrequency(String s) {
3        int[] charFreq = new int[26];
4        int[] digFreq = new int[10];
5        for (char ch : s.toCharArray()){
6            int asci = (int) ch;
7            if (asci<97){
8                digFreq[ch-'0']++;
9            }
10            else{
11                charFreq[ch-'a']++;
12            }
13        }
14        int res = 0;
15        for (int i=0 ; i<13 ; i++){
16            res += Math.abs(charFreq[i]-charFreq[26-1-i]);
17        }
18        for (int i=0 ; i<5 ; i++){
19            res += Math.abs(digFreq[i]-digFreq[10-1-i]);
20        }
21        return res;
22    }
23}