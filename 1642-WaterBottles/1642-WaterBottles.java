// Last updated: 12/19/2025, 11:58:12 AM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int cnt = 0;
        while (numBottles>=numExchange){
            cnt += numExchange;
            numBottles -= numExchange;
            numBottles++;
        }
        cnt += numBottles;
        return cnt;
    }
}