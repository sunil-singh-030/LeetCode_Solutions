// Last updated: 10/1/2025, 10:15:36 AM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int cnt = 0;
        while (numBottles>=numExchange){
            cnt += ((numBottles/numExchange)*numExchange);
            int left = numBottles - ((numBottles/numExchange)*numExchange);
            left += (numBottles/numExchange);
            numBottles = left;
        }
        cnt += numBottles;
        return cnt;
    }
}