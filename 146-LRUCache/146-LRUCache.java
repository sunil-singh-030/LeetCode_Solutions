// Last updated: 5/17/2026, 10:12:27 PM
1class Node{
2    int key;
3    int val;
4    Node prev;
5    Node next;
6    Node(int key, int val){
7        this.key = key;
8        this.val = val;
9        prev = null;
10        next = null;
11    }
12}
13class LRUCache {
14    private int cap;
15    private Node head;
16    private Node tail;
17    private HashMap<Integer,Node> map;
18    public LRUCache(int capacity) {
19        cap = capacity;
20        head = new Node(-1,-1);
21        tail = new Node(-1,-1);
22        head.next = tail;
23        tail.prev = head;
24        map = new HashMap<>();
25    }
26    
27    public int get(int key) {
28        if (!map.containsKey(key)) return -1;
29        Node curr = map.get(key);
30        remove(curr);
31        map.put(key,curr);
32        add(curr);
33        return curr.val;
34    }
35    
36    public void put(int key, int value) {
37        Node curr = new Node(key,value);
38        if (map.containsKey(key)){
39            remove(map.get(key));
40        }
41        add(curr);
42        map.put(key,curr);
43        if (map.size()>cap){
44            remove(tail.prev);
45        }
46    }
47    public void add(Node node){
48        Node nextHead = head.next;
49        head.next = node;
50        node.prev = head;
51        node.next = nextHead;
52        nextHead.prev = node;
53    }
54    public void remove(Node node){
55        Node prevNode = node.prev;
56        Node nextNode = node.next;
57        prevNode.next = nextNode;
58        nextNode.prev = prevNode;
59        map.remove(node.key);
60    }
61}
62
63/**
64 * Your LRUCache object will be instantiated and called as such:
65 * LRUCache obj = new LRUCache(capacity);
66 * int param_1 = obj.get(key);
67 * obj.put(key,value);
68 */