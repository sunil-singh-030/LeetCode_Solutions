// Last updated: 2/4/2026, 3:06:58 PM
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
25    public boolean check(String s, int idx, int chance, TrieNode curr){
26        if (curr==null){
27            curr = root;
28        }
29        if (idx==s.length()){
30            return curr.isEnd;
31        }
32        
33        boolean res = false;
34        if (curr.child[s.charAt(idx)-'a']!=null){
35            res = res || check(s,idx+1,chance,curr.child[s.charAt(idx)-'a']);
36        }
37        if (res){
38            return true;
39        }
40        if (chance>0){
41            for (int i=0 ; i<26 ; i++){
42                if (curr.child[i]!=null){
43                    res = res || check(s,idx+1,chance-1,curr.child[i]);
44                    if (res){
45                    return true;
46                }
47                }
48            }
49        }
50        
51        return false;
52
53    }
54}
55class Solution {
56    public List<String> twoEditWords(String[] queries, String[] dictionary) {
57        Trie t = new Trie();
58        for (String s : dictionary){
59            t.insert(s);
60        }
61        List<String> ans = new ArrayList<>();
62        for (String q : queries){
63            if (t.check(q,0,2,null)){
64                ans.add(q);
65            }
66        }
67        return ans;
68    }
69}