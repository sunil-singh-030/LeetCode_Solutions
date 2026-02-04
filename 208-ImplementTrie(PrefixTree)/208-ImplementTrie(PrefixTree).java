// Last updated: 2/4/2026, 11:56:57 AM
1class TrieNode{
2    HashMap<Character,TrieNode> children;
3    boolean isEnd;
4    public TrieNode(){
5        children = new HashMap<>();
6        isEnd = false;
7    }
8}
9class Trie {
10    TrieNode root;
11    public Trie() {
12        root = new TrieNode();
13    }
14    
15    public void insert(String word) {
16        TrieNode curr = root;
17        for (char ch : word.toCharArray()){
18            if (!curr.children.containsKey(ch)){
19                curr.children.put(ch,new TrieNode());
20            }
21            curr = curr.children.get(ch);
22        }
23        curr.isEnd = true;
24    }
25    
26    public boolean search(String word) {
27        TrieNode curr = root;
28        for (char ch : word.toCharArray()){
29            if (!curr.children.containsKey(ch)){
30                return false;
31            }
32            curr = curr.children.get(ch);
33        }
34        return curr.isEnd;
35    }
36    
37    public boolean startsWith(String prefix) {
38        TrieNode curr = root;
39        for (char ch : prefix.toCharArray()){
40            if (!curr.children.containsKey(ch)){
41                return false;
42            }
43            curr = curr.children.get(ch);
44        }
45        return true;
46    }
47}
48
49/**
50 * Your Trie object will be instantiated and called as such:
51 * Trie obj = new Trie();
52 * obj.insert(word);
53 * boolean param_2 = obj.search(word);
54 * boolean param_3 = obj.startsWith(prefix);
55 */