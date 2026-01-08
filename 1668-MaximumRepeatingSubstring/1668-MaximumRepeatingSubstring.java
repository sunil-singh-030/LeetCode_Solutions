// Last updated: 1/8/2026, 11:32:06 AM
1class Solution {
2    public int maxRepeating(String sequence, String word) {
3        int ans = 0;
4        String temp = word;
5        while (true){
6            if (sequence.indexOf(word)>=0){
7                ans++;
8                word += temp;
9            }
10            else{
11                break;
12            }
13        }
14        return ans;
15    }
16}