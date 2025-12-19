// Last updated: 12/19/2025, 11:54:12 AM
class Solution {
    public int[] lexSmallestNegatedPerm(int n, long target) {
        long tsum = (((long) n)*((long) (n+1)))/2;
        long check = tsum-target;
        if ((Math.abs(check)%2)==1){
            return new int[0];
        }
        long req = check/2;
        if (req<0 || req>tsum){
            return new int[0];
        }
        boolean[] isNeg = new boolean[n];
        for (int i=n ; i>=0 ; i--){
            if (req>=i){
                req -= i;
                isNeg[i-1] = true; 
            }
            if (req==0){
                break;
            }
        }
        int[] ans = new int[n];
        int idx = 0;
        for (int i=n-1 ; i>=0 ; i--){
            if (isNeg[i]){
                ans[idx] = -(i+1);
                idx++;
            }
        }
        for (int i=0 ; i<n ; i++){
            if (!isNeg[i]){
                ans[idx] = i+1;
                idx++;
            }
        }
        return ans;
        
    }
}