// Last updated: 10/10/2025, 6:51:31 AM
class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n = energy.length;
        int max = Integer.MIN_VALUE;
        for (int i=n-1 ; i>=0 ; i--){
            int curr = energy[i];
            if (i+k<n){
                curr += energy[i+k];
            }
            max = Math.max(max,curr);
            energy[i] = curr;
        }
        return max;
    }
}