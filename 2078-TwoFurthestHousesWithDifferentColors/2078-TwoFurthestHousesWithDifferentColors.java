// Last updated: 4/20/2026, 8:47:58 AM
1class Solution {
2    public int maxDistance(int[] colors) {
3        int maxDiff = 0;
4        int n = colors.length;
5        for (int i=0 ; i<n-1 ; i++){
6            for (int j=i+1 ; j<n ; j++){
7                if (colors[i]!=colors[j]){
8                    maxDiff = Math.max(maxDiff,j-i);
9                }
10            }
11        }
12        return maxDiff;
13    }
14}