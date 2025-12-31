// Last updated: 12/31/2025, 12:05:55 PM
1class TrieNode{
2    TrieNode[] children;
3    boolean isEnd;
4    TrieNode(){
5        children = new TrieNode[26];
6        isEnd = false;
7    }
8}
9class Trie {
10    TrieNode root;
11
12    public Trie() {
13        root = new TrieNode();
14    }
15    
16    public void insert(String word) {
17        TrieNode curr = root;
18        for (char ch : word.toCharArray()){
19            int idx = ch-'a';
20            if (curr.children[idx]==null){
21                TrieNode nn = new TrieNode();
22                curr.children[idx] = nn;
23            }
24            curr = curr.children[idx];
25        }
26        curr.isEnd = true;
27    }
28    
29    public boolean search(String word) {
30        TrieNode curr = root;
31        for (char ch : word.toCharArray()){
32            int idx = ch-'a';
33            if (curr.children[idx]==null){
34                return false;
35            }
36            curr = curr.children[idx];
37        }
38        return curr.isEnd ;
39    }
40    
41    public boolean startsWith(String prefix) {
42        TrieNode curr = root;
43        for (char ch : prefix.toCharArray()){
44            int idx = ch-'a';
45            if (curr.children[idx]==null){
46                return false;
47            }
48            curr = curr.children[idx];
49        }
50        return true ;
51    }
52}
53
54/**
55 * Your Trie object will be instantiated and called as such:
56 * Trie obj = new Trie();
57 * obj.insert(word);
58 * boolean param_2 = obj.search(word);
59 * boolean param_3 = obj.startsWith(prefix);
60 */