// Last updated: 12/19/2025, 11:58:15 AM
class Solution {
    public int minNumberOperations(int[] target) {
        int n = target.length;
        int cntOper = target[0];
        for (int i=1 ; i<n ; i++){
            cntOper += Math.max(0,target[i]-target[i-1]);
        }
        return cntOper;

        
    }
}