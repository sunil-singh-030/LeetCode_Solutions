// Last updated: 8/3/2025, 9:55:06 PM
class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int n = landStartTime.length;
        int m = waterStartTime.length;
        int ans = Integer.MAX_VALUE;
        for (int i=0 ; i<n ; i++){
            int time = landStartTime[i] + landDuration[i];
            for (int j=0 ; j<m ; j++){
                if (waterStartTime[j]>=landStartTime[i]){
                    ans = Math.min(ans,time+waterDuration[j]+Math.max(0,waterStartTime[j]-time));
                }
            }
        }
        for (int i=0 ; i<m ; i++){
            int time = waterStartTime[i] + waterDuration[i];
            for (int j=0 ; j<n ; j++){
                if (landStartTime[j]>=waterStartTime[i]){
                    ans = Math.min(ans,time+landDuration[j]+Math.max(0,landStartTime[j]-time));
                }
            }
        }
        return ans;
    }
}