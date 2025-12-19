// Last updated: 12/19/2025, 11:56:11 AM
class Solution {
    public long maximumTotalDamage(int[] power) {
        Arrays.sort(power);
        HashMap<Long,Integer> map = new HashMap<>();
        for (int num : power){
            map.put((long) num,map.getOrDefault((long) num,0)+1);
        }
        HashMap<Long,Long> dp = new HashMap<>();
        return maxDamage(power,1,map,dp);
    }
    public long maxDamage(int[] power, long curr, HashMap<Long,Integer> map, HashMap<Long,Long> dp){
        if (curr==-1){
            return 0;
        }
        if (dp.containsKey(curr)){
            return dp.get(curr);
        }
        long nextnum1 = justMax(curr,power);
        long notake = maxDamage(power,nextnum1,map,dp);
        long take = 0;
        if (map.containsKey(curr)){
            long nextnum2 = justMax(curr+2,power);
            take = (map.get(curr)*curr) + maxDamage(power,nextnum2,map,dp);
        }
        dp.put(curr,Math.max(notake,take));
        return Math.max(notake,take);
    }
    public long justMax(long curr, int[] power ){
        long ans = -1;
        int st = 0;
        int end = power.length-1;
        while (st<=end){
            int mid = (st+end)/2;
            if (power[mid]>curr){
                ans = power[mid];
                end = mid-1;
            }
            else{
                st = mid+1;
            }
        }
        return ans;
    }
}