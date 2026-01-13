// Last updated: 1/13/2026, 3:51:45 PM
1class Solution {
2    int[] freq;
3    public int maxScoreWords(String[] words, char[] letters, int[] score) {
4        freq = new int[26];
5        for (char ch : letters){
6            freq[ch-'a']++;
7        }
8        return helper(words,letters,score,0);
9    }
10    public int helper(String[] words, char[] letters, int[] score, int idx){
11        if (idx==words.length){
12            return 0;
13        }
14        int take = 0;
15        int[] freq1 = new int[26];
16        String s = words[idx];
17        for (char ch : s.toCharArray()){
18            freq1[ch-'a']++;
19        }
20        boolean check = true;
21        for (int i=0 ; i<26 ; i++){
22            if (freq1[i]>freq[i]){
23                check = false;
24                break;
25            }
26        }
27        if (check){
28            int sc = 0;
29            for (int i=0 ; i<26 ; i++){
30                sc += freq1[i]*score[i];
31                freq[i] -= freq1[i];
32            }
33            take += sc;
34            take += helper(words,letters,score,idx+1);
35            for (int i=0 ; i<26 ; i++){
36                freq[i] += freq1[i];
37            }
38
39        }
40        int notake = helper(words,letters,score,idx+1);
41        return Math.max(notake,take);
42    }
43
44}