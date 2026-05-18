// Last updated: 5/18/2026, 12:33:49 PM
1class Solution {
2    public int characterReplacement(String s, int k) {
3        int [] arr=new int[26];
4        for (int i=0;i<s.length();i++){
5            arr[s.charAt(i)-'A']++;
6        }
7        int ans=1;
8        for (int i=0;i<26;i++){
9            if (arr[i]>0){
10                int out=countsamelenstr(s,k,(char) (i+65));
11                ans=Math.max(ans,out);
12            }
13        }
14        return ans;
15    }
16    public static int countsamelenstr(String s,int k,char ch){
17        int ans=1;
18        int si=0;
19        int ci=0;
20        int flip=0;
21        while (ci<s.length()){
22            // grow
23            if (s.charAt(ci)!=ch){
24                flip++;
25            }
26            // shrink
27            while (flip>k){
28                if (s.charAt(si)!=ch){
29                    flip--;
30                }
31                si++;
32            }
33            // ans update
34            ans=Math.max(ans,ci-si+1);
35            ci++;
36        }
37        return ans;
38    }
39}