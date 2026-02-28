// Last updated: 2/28/2026, 10:00:32 PM
1class Solution {
2public:
3    string mergeCharacters(string s, int k) {
4        string ans = "";
5        int n = s.size();
6        for (int i=0 ; i<n ; i++){
7            char ch = s[i];
8            if (ans.size()==0){
9                ans += ch;
10            }
11            else{
12                int idx = ans.size()-1;
13                int move = k;
14                bool found = false;
15                while (move>0 && idx>=0){
16                    if (ans[idx]==ch){
17                        found = true;
18                        break;
19                    }
20                    move--;
21                    idx--;
22                }
23                if (!found){
24                    ans += ch;
25                }
26            }
27        }
28        return ans;
29    }
30};