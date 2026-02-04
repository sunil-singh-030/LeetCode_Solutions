// Last updated: 2/4/2026, 3:03:46 PM
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
25    public boolean check(String s, int chance, TrieNode curr){
26        if (s.isEmpty()){
27            return curr.isEnd;
28        }
29        if (curr==null){
30            curr = root;
31        }
32        boolean res = false;
33        if (curr.child[s.charAt(0)-'a']!=null){
34            res = res || check(s.substring(1),chance,curr.child[s.charAt(0)-'a']);
35        }
36        if (res){
37            return true;
38        }
39        if (chance>0){
40            for (int i=0 ; i<26 ; i++){
41                if (curr.child[i]!=null){
42                    res = res || check(s.substring(1),chance-1,curr.child[i]);
43                    if (res){
44                    return true;
45                }
46                }
47            }
48        }
49        
50        return false;
51
52    }
53}
54class Solution {
55    public List<String> twoEditWords(String[] queries, String[] dictionary) {
56        Trie t = new Trie();
57        for (String s : dictionary){
58            t.insert(s);
59        }
60        List<String> ans = new ArrayList<>();
61        for (String q : queries){
62            if (t.check(q,2,null)){
63                ans.add(q);
64            }
65        }
66        return ans;
67    }
68}