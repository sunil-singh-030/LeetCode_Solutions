// Last updated: 8/3/2025, 9:55:03 PM
class Solution {
    public int maxBalancedShipments(int[] weight) {
        int n = weight.length;
        int cnt = 0;
        int max = 0;
        for (int i=0 ; i<n ; i++){
            max = Math.max(max,weight[i]);
            if (weight[i]<max){
                cnt++;
                max = 0;
            }
        }
        return cnt;
    }
}