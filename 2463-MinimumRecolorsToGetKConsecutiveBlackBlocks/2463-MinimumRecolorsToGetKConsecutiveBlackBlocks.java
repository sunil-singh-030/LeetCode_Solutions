// Last updated: 8/1/2025, 7:03:34 AM
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int ans = n;
        int cntw = 0;
        for (int i=0 ; i<k ; i++){
            if (blocks.charAt(i)=='W'){
                cntw++;
            }
        }
        ans = Math.min(ans,cntw);
        for (int i=k ; i<n ; i++){
            if (blocks.charAt(i-k)=='W'){
                cntw--;
            }
            if (blocks.charAt(i)=='W'){
                cntw++;
            }
            ans = Math.min(ans,cntw);
        }
        return ans;
    }
}