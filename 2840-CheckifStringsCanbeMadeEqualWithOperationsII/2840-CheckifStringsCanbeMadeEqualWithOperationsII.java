// Last updated: 3/30/2026, 6:20:08 AM
1class Solution {
2    public boolean checkStrings(String s1, String s2) {
3        int n = s2.length();
4
5        List<Character> l1 = new ArrayList<>();
6        List<Character> l2 = new ArrayList<>();
7        for (int i=0 ; i<n ; i+=2){
8            l1.add(s1.charAt(i));
9            l2.add(s2.charAt(i));
10        }
11        Collections.sort(l1);
12        Collections.sort(l2);
13        for (int i=0 ; i<l1.size() ; i++){
14            if (l1.get(i)!=l2.get(i)) return false;
15        }
16
17        l1.clear();
18        l2.clear();
19
20        for (int i=1 ; i<n ; i+=2){
21            l1.add(s1.charAt(i));
22            l2.add(s2.charAt(i));
23        }
24        Collections.sort(l1);
25        Collections.sort(l2);
26
27        for (int i=0 ; i<l1.size() ; i++){
28            if (l1.get(i)!=l2.get(i)) return false;
29        }
30        return true;
31    }
32}