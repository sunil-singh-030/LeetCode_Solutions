// Last updated: 10/30/2025, 10:20:31 AM
class Solution {
    public int minNumberOperations(int[] target) {
        int n = target.length;
        int cntOper = 0;
        int prevCnt = 0;
        for (int i=0 ; i<n ; i++){
            int temp = target[i];
            int currReq = Math.max(0,target[i]-prevCnt);
            cntOper += currReq;
            prevCnt = temp;
        }
        return cntOper;

        
    }
}