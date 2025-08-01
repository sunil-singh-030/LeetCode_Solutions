// Last updated: 8/1/2025, 7:05:18 AM
class Solution {
    public int kthFactor(int n, int k) {
        if (k==1){
            return 1;
        }
        int c=1;
        for (int i=2;i<=n;i++){
            if (n%i==0){
                c++;
            }
            if (k==c){
                return i;
            }
        }
        return -1;
    }
}