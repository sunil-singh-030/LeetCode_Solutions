// Last updated: 3/29/2026, 3:38:56 PM
1class EventManager {
2    TreeMap<Integer,TreeSet<Integer>> map1;
3    HashMap<Integer,Integer> map2;
4    public EventManager(int[][] events) {
5        map1 = new TreeMap<>();
6        map2 = new HashMap<>();
7        for (int[] e : events){
8            int id = e[0];
9            int pr = e[1];
10            map2.put(id,pr);
11            if (!map1.containsKey(pr)){
12                map1.put(pr,new TreeSet<>());
13            }
14            map1.get(pr).add(id);
15        }
16    }
17    
18    public void updatePriority(int eventId, int newPriority) {
19        //System.out.println(eventId+" "+newPriority);
20        int prevPr = map2.get(eventId);
21        map1.get(prevPr).remove(eventId);
22        if (map1.get(prevPr).size()==0){
23            map1.remove(prevPr);
24        }
25        if (!map1.containsKey(newPriority)){
26            map1.put(newPriority,new TreeSet<>());
27        }
28        map2.put(eventId,newPriority);
29        map1.get(newPriority).add(eventId);
30    }
31    
32    public int pollHighest() {
33        if (map1.size()==0) return -1;
34        int higPr =  map1.lastKey();
35        int eventId = map1.get(higPr).first();
36        map2.remove(eventId);
37        map1.get(higPr).remove(eventId);
38        if (map1.get(higPr).size()==0){
39            map1.remove(higPr);
40        }
41        //System.out.println(higPr+" "+eventId);
42        return eventId;
43    }
44}
45
46/**
47 * Your EventManager object will be instantiated and called as such:
48 * EventManager obj = new EventManager(events);
49 * obj.updatePriority(eventId,newPriority);
50 * int param_2 = obj.pollHighest();
51 */