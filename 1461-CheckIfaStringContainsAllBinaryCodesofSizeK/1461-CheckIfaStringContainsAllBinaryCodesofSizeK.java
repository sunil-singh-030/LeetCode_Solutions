// Last updated: 2/23/2026, 9:05:34 PM
1class Solution {
2    public boolean hasAllCodes(String s, int k) {
3        HashSet<String> set = new HashSet<>();
4        String temp = "";
5        int n = s.length();
6        for (int i=0 ; i<Math.min(n,k) ; i++){
7            temp += s.charAt(i);
8        }
9        set.add(temp);
10        for (int i=k ; i<n ; i++){
11            temp = temp.substring(1);
12            temp += s.charAt(i);
13            set.add(temp);
14        }
15        int total = (int) Math.pow(2,k);
16        return set.size()==total;
17    }
18}