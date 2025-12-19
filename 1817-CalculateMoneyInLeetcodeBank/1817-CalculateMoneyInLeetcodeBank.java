// Last updated: 12/19/2025, 11:58:01 AM
class Solution {
    public int totalMoney(int n) {
        int tmoney = 0;
        int week = 0;
        while (n>0){
            tmoney += (Math.min(7,n)*(Math.min(7,n)+1)/2) + week*Math.min(7,n);
            n -= 7;
            week++;
        }
        return tmoney;

    }
}