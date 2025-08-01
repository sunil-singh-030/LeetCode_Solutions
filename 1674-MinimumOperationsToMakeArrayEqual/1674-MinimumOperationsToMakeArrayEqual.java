// Last updated: 8/1/2025, 7:04:57 AM
class Solution {
    public int minOperations(int n) {
        if (n%2==0){
            int cnt = (n/2)*(n/2);
            return cnt;
        }
        else{
            int num = n/2;
            int cnt = 2*(num*(num+1)/2);
            return cnt;
        }
    }
}