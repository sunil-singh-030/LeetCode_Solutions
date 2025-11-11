// Last updated: 11/11/2025, 7:46:33 AM
class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int len = strs.length;
        int[][] arr = new int[len][2];
        for (int i=0 ; i<len ; i++){
            String str = strs[i];
            int cnt1 = 0;
            for (char ch : str.toCharArray()){
                if (ch=='1'){
                    cnt1++;
                }
            }
            arr[i][0] = str.length() - cnt1;
            arr[i][1] = cnt1;
        }
        int[][][] dp = new int[len][m+1][n+1];
        for (int[][] a  : dp){
            for (int[] b : a){
                Arrays.fill(b,-1);
            }
        }
        return maxSize(arr,0,m,n,0,0,dp);
    }
    public int maxSize(int[][] arr, int idx, int m, int n, int cnt0, int cnt1, int[][][] dp){
        if (idx==arr.length){
            return 0;
        }
        if (dp[idx][cnt0][cnt1]!=-1){
            return dp[idx][cnt0][cnt1];
        }
        int currSize = maxSize(arr,idx+1,m,n,cnt0,cnt1,dp);
        if (arr[idx][0]+cnt0<=m && arr[idx][1]+cnt1<=n){
            currSize = Math.max(currSize,1+maxSize(arr,idx+1,m,n,cnt0+arr[idx][0],cnt1+arr[idx][1],dp));
        }
        return dp[idx][cnt0][cnt1] = currSize;
    }
}