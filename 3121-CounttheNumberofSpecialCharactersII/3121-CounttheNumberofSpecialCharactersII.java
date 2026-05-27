// Last updated: 5/27/2026, 9:09:18 AM
1class Solution {
2    public int numberOfSpecialChars(String word) {
3        int[] minLow = new int[26];
4        int[] maxUpp = new int[26];
5        Arrays.fill(minLow,-1);
6        Arrays.fill(maxUpp,-1);
7        for (int i=0 ; i<word.length() ; i++){
8            char ch = word.charAt(i);
9            int asci = (int) ch;
10            if (asci<97){
11                if (maxUpp[ch-'A']==-1){
12                    maxUpp[ch-'A'] = i;
13                }
14                
15            }
16            else{
17                minLow[ch-'a'] = i;
18            }
19        }
20        int cnt = 0;
21        for (int i=0 ; i<26 ; i++){
22            if (minLow[i]!=-1 && maxUpp[i]!=-1 && minLow[i]<maxUpp[i]){
23                cnt++;
24            }
25        }
26        return cnt;
27    }
28}