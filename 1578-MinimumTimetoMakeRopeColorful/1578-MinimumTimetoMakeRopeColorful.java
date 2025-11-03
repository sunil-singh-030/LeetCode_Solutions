// Last updated: 11/3/2025, 11:46:35 AM
class Solution {
    public int minCost(String colors, int[] neededTime) {
        int cost = 0;
        int tsum = neededTime[0];
        int max = neededTime[0];
        int cnt = 1;
        int n = neededTime.length;
        for (int i=1 ; i<n ; i++){
            if (colors.charAt(i)!=colors.charAt(i-1)){
                if (cnt>1){
                    cost += (tsum-max);
                }
                tsum = neededTime[i];
                max = neededTime[i];
                cnt = 1;
            }
            else{
                tsum += neededTime[i];
                max = Math.max(max,neededTime[i]);
                cnt++;
            }
        }
        if (cnt>1){
            cost += (tsum-max);
        }
        return cost;
    }
    
}