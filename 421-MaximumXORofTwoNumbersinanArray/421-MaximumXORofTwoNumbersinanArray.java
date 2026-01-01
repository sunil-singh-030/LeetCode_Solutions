// Last updated: 1/1/2026, 11:44:06 AM
1class Solution {
2    public int findMaximumXOR(int[] nums) {
3        // 00011 
4        // 01010 
5        // 00101 
6        // 11001 
7        // 00010 
8        // 01000
9        //HashMap<String,Integer> map = new HashMap<>();
10
11        int n = nums.length;
12        String[] binArr = new String[n];
13        int maxlen = 0;
14        for (int i=0 ; i<n ; i++){
15            binArr[i] = bin(nums[i]);
16            maxlen = Math.max(maxlen,binArr[i].length());
17            
18        }
19        for (int i=0 ; i<n ; i++){
20            binArr[i] = "0".repeat(maxlen-binArr[i].length()) + binArr[i];
21            //map.put(binArr[i],i);
22        }
23        Trie curr = new Trie();
24        for (String s : binArr){
25            curr.insert(s);
26        }
27        int maxXor = 0;
28        for (int i=0 ; i<n ; i++){
29            String str = binArr[i];
30            int num1 = nums[i];
31            int num2 = 0;
32            int pow = maxlen-1;
33            TrieNode xorNode = curr.root;
34            for (char ch : str.toCharArray()){
35                if (ch=='0'){
36                    if (xorNode.children[1]==null){
37                        xorNode = xorNode.children[0];
38                    }
39                    else{
40                        num2 += (int) Math.pow(2,pow);
41                        xorNode = xorNode.children[1];
42                    }
43                    
44                }
45                else{
46                    if (xorNode.children[0]==null){
47                        num2 += (int) Math.pow(2,pow);
48                        xorNode = xorNode.children[1];
49                    }
50                    else{
51                        xorNode = xorNode.children[0];
52                    }
53                }
54                pow--;
55            }
56            maxXor = Math.max(maxXor,num1 ^ num2);
57            // System.out.println(maxXor+" "+nums[map.get(str)]+" "+nums[map.get(out)]);
58            // System.out.println(maxXor+" "+(nums[map.get(str)] | nums[map.get(out)]));
59            // System.out.println();
60        }
61        return maxXor;
62    }
63    public String bin(int num){
64        String str = "";
65        while (num>0){
66            str = num%2 + str;
67            num /= 2;
68        }
69        return str;
70    }
71    class TrieNode{
72        TrieNode[] children;
73        boolean isEnd;
74        TrieNode(){
75            children = new TrieNode[2];
76            isEnd = false;
77        }
78    }
79    class Trie {
80        TrieNode root;
81
82        public Trie() {
83            root = new TrieNode();
84        }
85        
86        public void insert(String word) {
87            TrieNode curr = root;
88            for (char ch : word.toCharArray()){
89                int idx = ch-'0';
90                if (curr.children[idx]==null){
91                    TrieNode nn = new TrieNode();
92                    curr.children[idx] = nn;
93                }
94                curr = curr.children[idx];
95            }
96            curr.isEnd = true;
97        }
98        
99        
100    }
101
102
103
104}