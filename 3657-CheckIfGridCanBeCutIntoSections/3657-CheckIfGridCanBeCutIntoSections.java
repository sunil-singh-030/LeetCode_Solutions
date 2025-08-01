// Last updated: 8/1/2025, 7:01:59 AM
class Solution {
    public boolean checkValidCuts(int n, int[][] rectangles) {
        // case1 
        Map<Integer,Integer> mapx1 = new HashMap<>();
        Map<Integer,Integer> mapx2 = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        HashSet<Integer> set = new HashSet<>();
        for (int[] arr : rectangles){
            int st = arr[0];
            int end = arr[2];
            mapx1.put(st,mapx1.getOrDefault(st,0)+1);
            mapx2.put(end,mapx2.getOrDefault(end,0)+1);
            if (!set.contains(st)){
                set.add(st);
                pq.add(st);
            }
            if (!set.contains(end)){
                set.add(end);
                pq.add(end);
            }
        }
        // System.out.println(mapx1);
        // System.out.println(mapx2);
        long cuursum = 0;
        int cnt = 0;
        while (pq.size()>1){
            int ele = pq.poll();
            //System.out.println(ele+" "+cuursum);
            int cntst = mapx1.getOrDefault(ele,0);
            int cntend = mapx2.getOrDefault(ele,0);
            if (cntend>=cuursum && cntend>0){
                cnt++;
                if (cnt==2){
                    return true;
                }
            }
            cuursum += cntst;
            cuursum -= cntend;
            // System.out.println(cuursum+" "+cnt);
            // System.out.println();

        }

        //case2
        Map<Integer,Integer> mapy1 = new HashMap<>();
        Map<Integer,Integer> mapy2 = new HashMap<>();
        pq = new PriorityQueue<>();
        set = new HashSet<>();
        for (int[] arr : rectangles){
            int st = arr[1];
            int end = arr[3];
            mapy1.put(st,mapy1.getOrDefault(st,0)+1);
            mapy2.put(end,mapy2.getOrDefault(end,0)+1);
            if (!set.contains(st)){
                set.add(st);
                pq.add(st);
            }
            if (!set.contains(end)){
                set.add(end);
                pq.add(end);
            }
        }
        cuursum = 0;
        cnt = 0;
        while (pq.size()>1){
            int ele = pq.poll();
            //System.out.println(ele+" "+cuursum);
            int cntst = mapy1.getOrDefault(ele,0);
            int cntend = mapy2.getOrDefault(ele,0);
            if (cntend>=cuursum && cntend>0){
                cnt++;
                if (cnt==2){
                    return true;
                }
            }
            cuursum += cntst;
            cuursum -= cntend;
            // System.out.println(cuursum+" "+cnt);
            // System.out.println();

        }
        return false;
    }
}