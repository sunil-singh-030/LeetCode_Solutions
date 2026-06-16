// Last updated: 6/16/2026, 5:54:19 AM
1class Solution {
2    public String processStr(String s) {
3        String res = "";
4        for (char ch : s.toCharArray()){
5            if (ch!='*' && ch!='%' && ch!='#'){
6                res += ch;
7            }
8            else if (ch=='*' && res.length()>0){
9                res = res.substring(0,res.length()-1);
10            }
11            else if (ch=='%'){
12                String str = "";
13                for (int i=res.length()-1 ; i>=0 ; i--){
14                    str += res.charAt(i);
15                }
16                res = str;
17            }
18            else{
19                res += res;
20            }
21        }
22        return res;
23    }
24}