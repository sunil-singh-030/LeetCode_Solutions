// Last updated: 9/29/2025, 2:16:52 PM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = cost.length;
        int total = 0;
        for (int i=0 ; i<n ; i++){
            total += gas[i]-cost[i];
        }
        if (total<0){
            return -1 ;
        }
        int curr = 0;
        int idx = 0;
        int need = 0;
        for (int i=0 ; i<n ; i++){
            curr += (gas[i]-cost[i]);
            if (curr<0){
                idx = i+1;
                need += curr;
                curr = 0;
            }
        }
        if (need+curr<0){
            return -1;
        }
        return idx;

        

    }
}