// Last updated: 1/31/2026, 8:06:19 PM
1class Solution {
2    public String reverseByType(String s) {
3        HashSet<Integer> s1 = new HashSet<>();
4        HashSet<Integer> s2 = new HashSet<>();
5        int n = s.length();
6        List<Character> ls1 = new ArrayList<>();
7        List<Character> ls2 = new ArrayList<>();
8        for (int i=0 ; i<n ; i++){
9            char ch = s.charAt(i);
10            int asc = (int) ch;
11            if (asc>=97 && asc<=122){
12                s1.add(i);
13                ls1.add(ch);
14            }
15            else{
16                s2.add(i);
17                ls2.add(ch);
18            }
19        }
20        
21        String out = "";
22        int i1 = ls1.size()-1;
23        int i2 = ls2.size()-1;
24        for (int i=0 ; i<n ; i++){
25            if (s1.contains(i)){
26                out += ls1.get(i1);
27                i1--;
28            }
29            else{
30                out += ls2.get(i2);
31                i2--;
32            }
33        }
34        return out;
35        
36    }
37}