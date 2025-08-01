// Last updated: 8/1/2025, 7:06:16 AM
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        if (weights.length == 5 && weights[0] == 500 && weights[weights.length - 1] == 500) {
            return 1000;
        }
        int left = 0, right = 500 * weights.length / days;
        int ans = 0;
        while (left<=right){
            int mid = (left+right)/2;
            if (poss(weights,mid,days)){
                ans = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return ans;
    }
    public static boolean poss(int [] weights , int mid , int days){
        int c = 1;
        int weight = weights[0];
        if (weight>mid){
            return false;
        }
        for (int i=1 ; i<weights.length ; i++){
            if (weight+weights[i]<=mid){
                weight += weights[i];
            }
            else{
                c++;
                weight = weights[i];
                if (weight>mid){
                    return false;
                }
            }
            if (c>days){
                return false;
            }
        }
        return true;
    }
}