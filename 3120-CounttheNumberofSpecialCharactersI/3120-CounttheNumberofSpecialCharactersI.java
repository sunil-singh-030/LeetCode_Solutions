// Last updated: 5/26/2026, 6:10:25 AM
1class Solution {
2    public int numberOfSpecialChars(String word) {
3        int[] freq1 = new int[26];
4        int[] freq2 = new int[26];
5        for (char ch : word.toCharArray()){
6            int asci = (int) ch;
7            if (asci<97){
8                freq1[ch-'A']++;
9            }
10            else{
11                freq2[ch-'a']++;
12            }
13        }
14        int cnt = 0;
15        for (int i=0 ; i<26 ; i++){
16            if (freq1[i]>0 && freq2[i]>0){
17                cnt++;
18            }
19        }
20        return cnt;
21    }
22}