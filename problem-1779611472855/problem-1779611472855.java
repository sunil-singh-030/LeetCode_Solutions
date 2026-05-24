// Last updated: 5/24/2026, 2:01:12 PM
1class Solution {
2    public int passwordStrength(String password) {
3        HashSet<Character> set = new HashSet<>();
4        int sc = 0;
5        for (char ch : password.toCharArray()){
6            if (set.contains(ch)){
7                continue;
8            }
9            set.add(ch);
10            int asci = (int) ch;
11            if (asci>=65 && asci<=90){
12                sc += 2;
13            }
14            else if (asci>=97 && asci<=122){
15                sc++;
16            }
17            else if (asci>=48 && asci<=57){
18                sc += 3;
19            }
20            else{
21                sc += 5;
22            }
23            
24        }
25        return sc;
26    }
27}