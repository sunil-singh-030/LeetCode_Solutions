// Last updated: 8/1/2025, 7:03:47 AM
class Solution {
    static long count = 0;
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        count = 0;
        int maxpen = total/cost1;
        pair(cost1,cost2,total,maxpen);
        return count;
    }
    public static void pair(int cost1 , int cost2 , int total , int maxpen){
        for (int i=0 ; i<=maxpen ; i++){
            total -= cost1*i;
            count += total/cost2;
            count++;
            total += cost1*i;
        }
    }
}