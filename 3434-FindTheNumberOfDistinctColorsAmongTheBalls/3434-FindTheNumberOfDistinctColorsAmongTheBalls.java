// Last updated: 8/1/2025, 7:02:23 AM
class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        int n = queries.length;
        int[] ans = new int[n];
        Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();
        for (int i=0 ; i<n ; i++){
            int ball = queries[i][0];
            int color = queries[i][1];
            if (map2.containsKey(ball)){
                int prevcolor = map2.get(ball);
                map1.put(prevcolor,map1.get(prevcolor)-1);
                if (map1.get(prevcolor)==0){
                    map1.remove(prevcolor);
                }
            }
            map2.put(ball,color);
            map1.put(color,map1.getOrDefault(color,0)+1);
            ans[i] = map1.size();
        }
        return ans;
    }
}