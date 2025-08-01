// Last updated: 8/1/2025, 7:08:49 AM
class Solution {
    public boolean canCross(int[] stones) {
        int n = stones.length;
        if (stones[1]!=1){
            return false;
        }
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,1);
        for (int i=2 ; i<n ; i++){
            set.add(stones[i]);
            map.put(stones[i],i);
        }
        int[][] dp = new int[n][n];
        for (int[] a : dp){
            Arrays.fill(a,-1);
        }
        return fn(map,set,1,1,stones[n-1],dp);
    }
    public static boolean fn(HashMap<Integer,Integer> map, HashSet<Integer> set, int curr, int prevJump , int tar, int[][] dp){
        if (curr==tar){
            return true;
        }
        if (curr>tar){
            return false;
        }
        if (dp[map.get(curr)][prevJump]!=-1){
            return dp[map.get(curr)][prevJump]==1;
        }
        if (prevJump-1!=0 && set.contains(curr+prevJump-1) && fn(map,set,curr+prevJump-1,prevJump-1,tar,dp)){
            dp[map.get(curr)][prevJump] = 1;
            return true;
        }
        if (set.contains(curr+prevJump) && fn(map,set,curr+prevJump,prevJump,tar,dp)){
            dp[map.get(curr)][prevJump] = 1;
            return true;
        }
        if (set.contains(curr+prevJump+1) && fn(map,set,curr+prevJump+1,prevJump+1,tar,dp)){
            dp[map.get(curr)][prevJump] = 1;
            return true;
        }
        dp[map.get(curr)][prevJump] = 0;
        return false;
    }
}