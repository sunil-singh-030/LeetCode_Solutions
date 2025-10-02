// Last updated: 10/2/2025, 8:07:41 AM
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