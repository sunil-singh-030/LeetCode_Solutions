// Last updated: 5/16/2026, 10:37:34 PM
1class Node{
2    int key;
3    int val;
4    Node prev;
5    Node next;
6    Node (int key, int val){
7        this.key = key;
8        this.val = val;
9        this.prev = null;
10        this.next = null;
11    }
12}
13class LRUCache {
14    private int cap;
15    private HashMap<Integer,Node> map;
16    private Node head;
17    private Node tail;
18    public LRUCache(int capacity) {
19        cap = capacity;
20        map = new HashMap<>();
21        head = new Node(-1,-1);
22        tail = new Node(-1,-1);
23        head.next = tail;
24        tail.prev = head;
25    }
26    
27    public int get(int key) {
28        if (!map.containsKey(key)){
29            return -1;
30        }
31        Node currNode = map.get(key);
32        remove(currNode);
33        map.put(key,currNode);
34        add(currNode);
35        return currNode.val;
36    }
37    
38    public void put(int key, int value) {
39        if (map.containsKey(key)){
40            Node currNode = map.get(key);
41            remove(currNode);
42        }
43        Node newNode = new Node(key,value);
44        add(newNode);
45        map.put(key,newNode);
46        if (map.size()>cap){
47            remove(tail.prev);
48        }
49    }
50
51    public void remove(Node node){
52        Node prevNode = node.prev;
53        Node nextNode = node.next;
54        prevNode.next = nextNode;
55        nextNode.prev = prevNode;
56        map.remove(node.key);
57    }
58
59    public void add(Node node){
60        Node headNext = head.next;
61        head.next = node;
62        node.prev = head;
63        node.next = headNext;
64        headNext.prev = node;
65    }
66}
67
68/**
69 * Your LRUCache object will be instantiated and called as such:
70 * LRUCache obj = new LRUCache(capacity);
71 * int param_1 = obj.get(key);
72 * obj.put(key,value);
73 */