// Last updated: 12/19/2025, 11:56:15 AM
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