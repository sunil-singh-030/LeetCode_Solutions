// Last updated: 1/23/2026, 10:27:02 AM
1class Solution {
2    public boolean isItPossible(String word1, String word2) {
3        int[] freq1 = new int[26];
4        
5        for (char ch : word1.toCharArray()){
6            int cnt = freq1[ch-'a'];
7            freq1[ch-'a']++;
8        }
9        int[] freq2 = new int[26];
10        
11        for (char ch : word2.toCharArray()){
12            int cnt = freq2[ch-'a'];
13            freq2[ch-'a']++;
14        }
15        for (int i=0 ; i<26 ; i++){
16            for (int j=0 ; j<26 ; j++){
17                if (freq1[i]>0 && freq2[j]>0){
18                    freq2[i]++;
19                    freq2[j]--;
20                    freq1[i]--;
21                    freq1[j]++;
22                    int c1 = 0;
23                    int c2 = 0;
24                    for (int k=0 ; k<26 ; k++){
25                        if (freq1[k]>0){
26                            c1++;
27                        }
28                        if (freq2[k]>0){
29                            c2++;
30                        }
31                    }
32                    if (c1==c2){
33                        return true;
34                    }
35
36                    freq2[i]--;
37                    freq2[j]++;
38                    freq1[i]++;
39                    freq1[j]--;
40                }
41            }
42        }
43        return false;
44    }
45}