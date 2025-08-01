// Last updated: 8/1/2025, 7:04:46 AM
class Solution {
    public int largestAltitude(int[] gain) {
        int ans=0;
        int gain1=0;
        for (int i=0;i<gain.length;i++){
            gain1+=gain[i];
            ans=Math.max(gain1,ans);
        }
        return ans;
    }
}