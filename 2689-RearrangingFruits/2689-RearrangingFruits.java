// Last updated: 8/2/2025, 6:24:52 AM
class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        int min = Integer.MAX_VALUE;
        HashMap<Integer,Integer> map1 = new HashMap<>();
        for (int cost : basket1){
            min = Math.min(min,cost);
            map1.put(cost,map1.getOrDefault(cost,0)+1);
        }
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for (int cost : basket2){
            min = Math.min(min,cost);
            map2.put(cost,map2.getOrDefault(cost,0)+1);
        }
        for (int key : map1.keySet()){
            int cnt1 = map1.get(key);
            int cnt2 = map2.getOrDefault(key,0);
            if ((cnt1+cnt2)%2==1) return -1;
        }
        List<Integer> extra1 = new ArrayList<>();
        List<Integer> extra2 = new ArrayList<>();

        for (int key : map1.keySet()){
            int cnt1 = map1.get(key);
            int cnt2 = map2.getOrDefault(key,0);
            int ideal = (cnt1+cnt2)/2;
            for (int i=0 ; i<cnt1-ideal ; i++){
                extra1.add(key);
            }
        }
        for (int key : map2.keySet()){
            int cnt2 = map2.get(key);
            int cnt1 = map1.getOrDefault(key,0);
            int ideal = (cnt1+cnt2)/2;
            for (int i=0 ; i<cnt2-ideal ; i++){
                extra2.add(key);
            }
        }
        Collections.sort(extra1);
        Collections.sort(extra2);
        long mincost = 0;
        int i = 0;
        int j = 0;
        int cnt = 0;
        while (cnt<extra1.size()){
            if (extra1.get(i)<extra2.get(j)){
                if (2*min<=extra1.get(i)){
                    mincost += (extra1.size()-cnt)*(2*min);
                    break;
                }
                else{
                    mincost += extra1.get(i);
                    i++;
                }
                
            }
            else{
                if (2*min<=extra2.get(j)){
                    mincost += (extra1.size()-cnt)*(2*min);
                    break;
                }
                else{
                    mincost += extra2.get(j);
                    j++;
                }
            }
            cnt++;
        }
        return mincost;
    }
}