// Last updated: 8/1/2025, 7:01:00 AM
class Solution {
    public int countTrapezoids(int[][] points) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        for (int[] a : points){
            map1.put(a[1],map1.getOrDefault(a[1],0)+1);
        }

        HashMap<Integer,Long> map = new HashMap<>();
        for (int key : map1.keySet()){
            long val = map1.get(key);
            if (val==1) continue;
            map.put(key,permu(val));
        }
        //System.out.println(map);
        long cntpair = 0;
        for (int key : map.keySet()){
            cntpair += map.get(key);
        }
        int ans = 0;
        int mod = 1000000007;
        for (int key : map.keySet()){
            long add = map.get(key);
            cntpair -= map.get(key);
            add *= cntpair;
            add %= mod;
            ans += add;
            ans %= mod;
        }
        return ans;
        
    }
    public static long permu(long n){
        if (n==2) return 1;
        if (n==3) return 3;
        return (n*(n-1))/2;
    }
}