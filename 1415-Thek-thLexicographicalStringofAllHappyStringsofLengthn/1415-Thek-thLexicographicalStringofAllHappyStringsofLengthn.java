// Last updated: 3/14/2026, 3:03:06 PM
1class Solution {
2    static int cnt = 0;
3    static boolean flag = false;
4    static char[] arr = {'a','b','c'};
5    static String ans = "";
6    public String getHappyString(int n, int k) {
7        ans = "";
8        cnt = 0;
9        flag = false;
10        lets(n,k,"");
11        return ans;
12    }
13    public static void lets(int n , int k , String s){
14        if (flag){
15            return;
16        }
17        if (n==0){
18            cnt++;
19            if (cnt==k){
20                ans = s;
21                flag = true;
22            }
23            return;
24        }
25        for (int i=0 ; i<3 ; i++){
26            if (s.length()==0 || s.charAt(s.length()-1)!=arr[i]){
27                lets(n-1,k,s+arr[i]);
28            }
29        }
30    }
31}