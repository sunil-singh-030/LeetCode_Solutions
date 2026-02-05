// Last updated: 2/5/2026, 12:29:15 PM
1class TrieNode{
2    TrieNode[] child;
3    boolean isEnd;
4    public TrieNode(){
5        child = new TrieNode[26];
6        isEnd = false;
7    }
8}
9class Trie{
10    private TrieNode root;
11    public Trie(){
12        root = new TrieNode();
13    }
14    public void insert(String s){
15        TrieNode curr = root;
16        for (char ch : s.toCharArray()){
17            int idx = ch-'a';
18            if (curr.child[idx]==null){
19                curr.child[idx] = new TrieNode();
20            }
21            curr = curr.child[idx];
22        }
23        curr.isEnd = true;
24    }
25    
26    public int minValidSearch(String s, int idx, TrieNode curr, int[] dp){
27        if (idx==s.length()){
28            return 0;
29        }
30        if (dp[idx]!=-1){
31            return dp[idx];
32        }
33        if (curr==null){
34            curr = root;
35        }
36
37
38        int ans = s.length()+1;
39        for (int i=idx ; i<s.length() ; i++){
40            char ch = s.charAt(i);
41            if (curr.child[ch-'a']!=null){
42                ans = Math.min(ans,1+minValidSearch(s,i+1,null,dp));
43                curr = curr.child[ch-'a'];
44            }
45            else{
46                if (idx!=i){
47                    ans = Math.min(ans,1+minValidSearch(s,i,null,dp));
48                }
49                return dp[idx] = ans;
50            }
51        }
52        return dp[idx] = 1;
53        
54    }
55}
56class Solution {
57    
58    public int minValidStrings(String[] words, String target) {
59        Trie t = new Trie();
60        for (String word : words){
61            t.insert(word);
62        }
63        int[] dp = new int[target.length()];
64        Arrays.fill(dp,-1);
65        int res = t.minValidSearch(target,0,null,dp);
66        return res>target.length() ? -1 : res;
67    }
68}