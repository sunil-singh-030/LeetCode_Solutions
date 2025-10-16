// Last updated: 10/16/2025, 9:37:27 AM
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for (int i=1 ; i<=n ; i++){
            map.put(i,new ArrayList<>());
        }
        for (int i=0 ; i<n; i++){
            int v1 = i+1;
            for (int j=0 ; j<n ; j++){
                if (isConnected[i][j]==1 && i!=j){
                    int v2 = j+1;
                    map.get(v1).add(v2);
                    map.get(v2).add(v1);
                }
            }
        }

        int cntProvinces = 0;
        HashSet<Integer> visited = new HashSet<>();
        for (int i=1 ; i<=n ; i++){
            if (visited.contains(i)) continue;
            cntProvinces++;
            Queue<Integer> q = new LinkedList<>();
            q.offer(i);
            while (!q.isEmpty()){
                // 1 remove
                int currNode = q.poll();

                // 2 ignore if already visited
                if (visited.contains(currNode)) continue;

                // 3 mark visited
                visited.add(currNode);

                // 4 self work

                // add unvisited nbrs
                for (int nbr : map.get(currNode)){
                    if (!visited.contains(nbr)){
                        q.offer(nbr);
                    }
                }

            }
        }
        return cntProvinces;
    }
}