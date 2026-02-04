// Last updated: 2/4/2026, 12:13:52 PM
1class Solution {
2    class TrieNode{
3        HashMap<Character,TrieNode> child;
4        boolean isEnd;
5        public TrieNode(){
6            child = new HashMap<>();
7            isEnd = false;
8        }
9    }
10    class Trie{
11        private TrieNode root;
12        public Trie(){
13            root = new TrieNode();
14        }
15        public void insert(String s){
16            TrieNode curr = root;
17            for (char ch : s.toCharArray()){
18                if (!curr.child.containsKey(ch)){
19                    curr.child.put(ch,new TrieNode());
20                }
21                curr = curr.child.get(ch);
22            }
23            curr.isEnd = true;
24        }
25        public String search(String s){
26            StringBuilder sb = new StringBuilder();
27            TrieNode curr = root;
28            for (char ch : s.toCharArray()){
29                if (curr.child.containsKey(ch)){
30                    sb.append(ch);
31                    curr = curr.child.get(ch);
32                    if (curr.isEnd){
33                        return sb.toString();
34                    }
35                }
36                else{
37                    return s;
38                }
39            }
40            return s;
41        }
42    }
43    public String replaceWords(List<String> dictionary, String sentence) {
44        Trie t = new Trie();
45        for (String str : dictionary){
46            t.insert(str);
47        }
48        String[] arr = sentence.split(" ");
49        StringBuilder ans = new StringBuilder();
50        for (String str : arr){
51            ans.append(t.search(str));
52            ans.append(" ");
53        }
54        ans.deleteCharAt(ans.length()-1);
55        return ans.toString();
56    }
57}