// Last updated: 10/25/2025, 8:04:11 AM
class Solution {
    public int totalMoney(int n) {
        int res = 0;
        int week = 1;
        int day = 1;
        int count = 1;

        while(n != 0){
            if(day < 8){
                 res += count;
            }else{
                day = 1;
                week++;
                res += week;
                count = week;
            }

            count++;
            day++;
            n--;
        }

        return res;
    }
}