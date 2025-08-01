// Last updated: 8/1/2025, 7:05:07 AM
class Solution {
    public int findKthPositive(int[] arr, int k) {
        for(int i : arr){
            if(i <= k) k++;
            else break;
        }
        return k;
    }
}