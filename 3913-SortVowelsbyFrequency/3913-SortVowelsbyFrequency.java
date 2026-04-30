// Last updated: 4/30/2026, 11:33:46 PM
1class Solution {
2    public String sortVowels(String s) {
3        int n = s.length();
4        int[][] freq = new int[26][3];
5        for (int i=0 ; i<26 ; i++){
6            freq[i][0] = n;
7            freq[i][2] = i;
8        }
9        for (int i=0 ; i<n ; i++){
10            char ch = s.charAt(i);
11            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
12                freq[ch-'a'][1]++;
13                if (freq[ch-'a'][0]==n){
14                    freq[ch-'a'][0] = i;
15                }
16            }
17        }
18        Arrays.sort(freq,(a,b)->{
19            if (a[1]!=b[1]){
20                return b[1]-a[1];
21            }
22            return a[0]-b[0];
23        });
24        StringBuilder sb = new StringBuilder();
25        int idx = 0;
26        for (char ch : s.toCharArray()){
27            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
28                char currChar = (char) (freq[idx][2]+97);
29                freq[idx][1]--;
30                if (freq[idx][1]==0){
31                    idx++;
32                }
33                sb.append(currChar);
34            }
35            else{
36                sb.append(ch);
37            }
38        }
39        return sb.toString();
40    }
41}