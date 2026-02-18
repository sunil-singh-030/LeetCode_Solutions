// Last updated: 2/18/2026, 11:38:16 AM
1class Solution {
2    public boolean canMakeArithmeticProgression(int[] arr) {
3        Arrays.sort(arr);
4        int diff = arr[1] - arr[0];
5        for (int i=2 ; i<arr.length ; i++){
6            if (arr[i]-arr[i-1]!=diff){
7                return false;
8            }
9        }
10        return true;
11    }
12}