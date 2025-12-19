// Last updated: 12/19/2025, 11:59:59 AM
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for (int i=0 ; i<rooms.size() ; i++){
            map.put(i,new ArrayList<>());
            List<Integer> ls = rooms.get(i);
            for (int num : ls){
                map.get(i).add(num);
            }
        }
        boolean[] visited = new boolean[rooms.size()];
        Queue<Integer> q = new LinkedList<>();
        q.offer(0);
        while (!q.isEmpty()){
            int roomno = q.poll();
            visited[roomno] = true;
            for (int num : map.get(roomno)){
                if (!visited[num]){
                    q.offer(num);
                }
            } 
        }
        for (boolean val : visited){
            if (!val) return false;
        }
        return true;
    }
}