// Last updated: 11/18/2025, 7:55:28 AM
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        if (n==1) return true;
        int idx = 0;
        for (int i=0 ; i<n-1 ; i++){
            if (bits[i]==0){
                idx = i+1;
            }
            else{
                idx = i+2;
                i++;
            }
        }
        if (idx==n-1){
            return true;
        }
        return false;
        
    }
}