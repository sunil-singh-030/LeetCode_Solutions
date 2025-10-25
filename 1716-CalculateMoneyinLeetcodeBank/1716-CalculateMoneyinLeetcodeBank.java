// Last updated: 10/25/2025, 8:02:37 AM
class Solution {
    public int totalMoney(int n) {
        int tmoney = 0;
        int extra = 0;
        while (n>0){
            if (n>=7){
                tmoney += 28 + (extra*7);
            }
            else{
                tmoney += (n*(n+1)/2) + extra*n;
            }
            n -= 7;
            extra++;
        }
        return tmoney;

    }
}