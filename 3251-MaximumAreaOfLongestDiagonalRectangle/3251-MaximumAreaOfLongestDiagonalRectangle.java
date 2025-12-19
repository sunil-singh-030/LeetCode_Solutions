// Last updated: 12/19/2025, 11:56:18 AM
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int ans = 0;
        double maxdiag = 0;
        for (int[] arr : dimensions){
            double diag = Math.sqrt(arr[0]*arr[0] + arr[1]*arr[1]);
            if (diag>maxdiag){
                ans = arr[0]*arr[1];
                maxdiag = diag;
            }
            else if (diag==maxdiag){
                if (ans<(arr[0]*arr[1])){
                    ans = arr[0]*arr[1];
                }
            }
        }
        return ans;

    }
}