// Last updated: 1/27/2026, 2:41:15 PM
1class MyCircularQueue {
2    List<Integer> ls;
3    int len;
4    int h;
5    int t;
6    public MyCircularQueue(int k) {
7        ls = new ArrayList<>();
8        len = k;
9        h = -1;
10        t = -1;
11    }
12    
13    public boolean enQueue(int value) {
14        if (ls.size()==len){
15            return false;
16        }
17        ls.add(value);
18        if (ls.size()==1){
19            h = 0;
20        }
21        t++;
22        return true; 
23
24    }
25    // 3 9 5 0
26    public boolean deQueue() {
27        if (ls.size()==0){
28            return false;
29        }
30        ls.remove(h);
31        t--;
32        return true;
33    }
34    
35    public int Front() {
36        if (ls.size()==0){
37            return -1;
38        }
39        return ls.get(h);
40    }
41    
42    public int Rear() {
43        if (ls.size()==0){
44            return -1;
45        }
46        return ls.get(t);
47    }
48    
49    public boolean isEmpty() {
50        return ls.size()==0;
51    }
52    
53    public boolean isFull() {
54        return ls.size()==len;
55    }
56}
57
58/**
59 * Your MyCircularQueue object will be instantiated and called as such:
60 * MyCircularQueue obj = new MyCircularQueue(k);
61 * boolean param_1 = obj.enQueue(value);
62 * boolean param_2 = obj.deQueue();
63 * int param_3 = obj.Front();
64 * int param_4 = obj.Rear();
65 * boolean param_5 = obj.isEmpty();
66 * boolean param_6 = obj.isFull();
67 */