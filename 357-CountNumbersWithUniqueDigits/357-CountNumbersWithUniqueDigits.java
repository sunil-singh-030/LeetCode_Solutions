// Last updated: 8/1/2025, 7:09:04 AM
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        int[] cnt = new int[9];
        cnt[0] = 1;
        cnt[1] = 10;
        cnt[2] = 91;
        int sum = 81;
        int num = 8;
        for (int i=3 ; i<9 ; i++){
            sum *= num;
            cnt[i] = (cnt[i-1]+(sum));
            num--;
        }
        return cnt[n];
    }
}