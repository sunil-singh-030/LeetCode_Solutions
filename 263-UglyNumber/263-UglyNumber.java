// Last updated: 8/1/2025, 7:09:34 AM
class Solution {
    public boolean isUgly(int n) {
        if (n<=0){
            return false;
        }
        while (true){
            if (n%2==0){
                n /= 2;
            }
            else {
                break;
            }
        }
        while (true){
            if (n%3==0){
                n /= 3;
            }
            else {
                break;
            }
        }
        while (true){
            if (n%5==0){
                n /= 5;
            }
            else {
                break;
            }
        }
        return n==1;
    }
}