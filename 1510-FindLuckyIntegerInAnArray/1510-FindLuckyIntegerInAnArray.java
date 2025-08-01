// Last updated: 8/1/2025, 7:05:32 AM
class Solution {
    public int findLucky(int[] arr) {
        int[] freq = new int[501];
        for (int num : arr){
            freq[num]++;
        }
        for (int i=500 ; i>=1 ; i--){
            if (freq[i]==i) return i;
        }
        return -1;
    }
}