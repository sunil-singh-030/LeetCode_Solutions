// Last updated: 8/3/2025, 9:55:10 PM
class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int ans = Integer.MAX_VALUE;
        int optimalLand = Integer.MAX_VALUE;
        for(int i = 0; i < landStartTime.length; i++) {
            optimalLand = Math.min(landStartTime[i]+landDuration[i], optimalLand);
        }
        for(int i = 0; i < waterStartTime.length; i++) {
            if(optimalLand >= waterStartTime[i]) {
                ans = Math.min(ans, optimalLand + waterDuration[i]);
            } else {
                ans = Math.min(ans, optimalLand + ((waterStartTime[i] - optimalLand) + waterDuration[i]));
            }
        }
        int optimalWater = Integer.MAX_VALUE;
        for(int i = 0; i < waterStartTime.length; i++) {
            optimalWater = Math.min(waterStartTime[i]+waterDuration[i], optimalWater);
        }
        for(int i = 0; i < landStartTime.length; i++) {
            if(optimalWater >= landStartTime[i]) {
                ans = Math.min(ans, optimalWater + landDuration[i]);
            } else {
                ans = Math.min(ans, optimalWater + ((landStartTime[i] - optimalWater) + landDuration[i]));
            }
        }
        return ans;
    }
}
