// Last updated: 1/18/2026, 8:03:23 AM
1class Solution {
2    public int vowelConsonantScore(String s) {
3        int v = 0;
4        int c = 0;
5            HashSet<Character> set = new HashSet<>();
6        set.add('a');
7        set.add('e');
8        set.add('i');
9        set.add('o');
10        set.add('u');;
11        for (char ch : s.toCharArray()){
12            if (set.contains(ch)){
13                v++;
14            }
15            else if (((int) ch)>=97 && ((int) ch)<=122){
16                c++;
17            }
18        }
19        if (c==0){
20            return 0;
21        }
22        return v/c;
23    }
24}