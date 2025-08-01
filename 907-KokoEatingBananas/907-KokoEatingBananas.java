// Last updated: 8/1/2025, 7:06:56 AM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 1000000000;
        int ans = right;
        while (left<=right){
            int mid = (left+right)/2;
            if (isitpossible(piles,mid,h)){
                ans = mid;
                right = mid-1;
            }
            else{
                left = mid + 1 ;
            }
        }
        return ans;
    }
    public static boolean isitpossible(int [] piles,int speed,int h){
        int cnt = 0;
        for (int pile : piles){
            int hour = pile/speed;
            if (pile%speed!=0){
                hour++;
            }
            cnt += hour ;
            if (cnt>h){
                return false;
            }
        }
        return true;
    }
}