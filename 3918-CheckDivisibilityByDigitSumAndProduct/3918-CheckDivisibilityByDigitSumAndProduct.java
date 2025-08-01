// Last updated: 8/1/2025, 7:00:44 AM
class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n;
        int sumdig = 0;
        while (temp>0){
            sumdig += (temp%10);
            temp /= 10;
        }
        
        
        temp = n;
        int prd = 1;
        while (temp>0){
            prd *= (temp%10);
            temp /= 10;
        }
        if (n%(prd+sumdig)==0) return true;
        return false;
    }
}