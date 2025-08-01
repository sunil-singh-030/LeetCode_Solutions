// Last updated: 8/1/2025, 7:03:13 AM
class Solution {
    public long repairCars(int[] ranks, int cars) {
        int minrank = Integer.MAX_VALUE;
        for (int mech : ranks){
            minrank = Math.min(minrank,mech);
        }
        long min = 1;
        long max = ((long) Math.pow(cars,2))*minrank;
        long ans = max;
        while (min<=max){
            long mid = (min+max)/2;
            if (ispossible(ranks,cars,mid)){
                ans = mid;
                max = mid-1;
            }
            else{
                min = mid+1;
            }
        }
        return ans;
    }
    public static boolean ispossible(int[] ranks , int cars , long time){
        int cnt = 0;
        for (int mech : ranks){
            cnt += (long) Math.sqrt((time/mech));
            if (cnt>=cars){
                return true;
            }
        }
        return cnt>=cars;
    }
}