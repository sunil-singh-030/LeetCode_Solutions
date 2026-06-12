// Last updated: 6/12/2026, 7:56:57 AM
1class Solution {
2    public List<String> generateValidStrings(int n, int k) {
3        List<String> ans = new ArrayList<>();
4        jaiBabaKi(n,k,ans,"",true);
5        return ans;
6    }
7
8    public void jaiBabaKi(int n, int k, List<String> ans, String s, boolean prev){
9        if (n==0){
10            ans.add(s);
11            return;
12        }
13        int currCost = s.length();
14        jaiBabaKi(n-1,k,ans,s+"0",true);
15        if (prev && currCost<=k){
16            jaiBabaKi(n-1,k-currCost,ans,s+"1",false);
17        }
18    }
19}