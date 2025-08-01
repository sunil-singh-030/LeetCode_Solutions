// Last updated: 8/1/2025, 7:11:55 AM
class Solution {
    public int climbStairs(int n) {
        if (n<=2){
            return n;
        }
        int curr = 2;
        int prev = 1;
        for (int i=3 ; i<=n ; i++){
            int temp = prev;
            prev = curr;
            curr += temp;
        }
        return curr;
    }
    
}