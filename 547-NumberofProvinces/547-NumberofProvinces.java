// Last updated: 10/16/2025, 9:40:52 AM
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
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
                for (int j=0 ; j<n ; j++){ 
                    if ( (j+1!=currNode) && isConnected[currNode-1][j]==1 && !visited.contains(j+1)){
                        q.offer(j+1);
                    }
                }

            }
        }
        return cntProvinces;
    }
}