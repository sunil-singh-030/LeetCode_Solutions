// Last updated: 6/2/2026, 11:27:21 PM
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> children;
6
7    public Node() {}
8
9    public Node(int _val) {
10        val = _val;
11    }
12
13    public Node(int _val, List<Node> _children) {
14        val = _val;
15        children = _children;
16    }
17};
18*/
19
20class Solution {
21    public List<List<Integer>> levelOrder(Node root) {
22        List<List<Integer>> ansLs = new ArrayList<>();
23        if (root==null) return ansLs;
24        Queue<Node> q = new LinkedList<>();
25        q.add(root);
26        while (!q.isEmpty()){
27            int len = q.size();
28            List<Integer> temp = new ArrayList<>();
29            for (int i=0 ; i<len ; i++){
30                Node cnode = q.poll();
31                temp.add(cnode.val);
32                for (Node child : cnode.children){
33                    q.add(child);
34                }
35            }
36            ansLs.add(temp);
37        }
38        return ansLs;
39    }
40}