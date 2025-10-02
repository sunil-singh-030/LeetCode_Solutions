// Last updated: 10/2/2025, 8:07:06 AM
class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int cnt = 0;
        while (numBottles>=numExchange){
            cnt += numExchange;
            numBottles -= numExchange;
            numBottles++;
            numExchange++;
        }
        cnt += numBottles;
        return cnt;
    }
}