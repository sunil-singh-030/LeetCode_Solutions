// Last updated: 3/2/2026, 10:54:22 PM
1class Solution {
2public:
3    string trimTrailingVowels(string s) {
4        int n = s.size();
5        string res = "";
6        int idx = n-1;
7        while (idx>=0){
8            char ch = s[idx];
9            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
10                idx--;
11            }
12            else{
13                break;
14            }
15        }
16        while (idx>=0){
17            res = s[idx] + res;
18            idx--;
19        }
20        return res;
21    }
22};